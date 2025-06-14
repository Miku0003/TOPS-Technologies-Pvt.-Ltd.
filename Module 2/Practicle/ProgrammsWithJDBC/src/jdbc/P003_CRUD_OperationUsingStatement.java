package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P003_CRUD_OperationUsingStatement {

    public static void main(String[] args) {
        // Database connection parameters
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
        String username = "root";
        String password = "system";

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            // Create a statement object
            Statement stmt = conn.createStatement();

            // Create table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS employees (id INT PRIMARY KEY, name VARCHAR(255), salary DECIMAL(10, 2))";
            stmt.executeUpdate(createTableQuery);

            // Insert data
            String insertQuery = "INSERT INTO employees (id, name, salary) VALUES (1, 'Miku Kumar', 50000.00)";
            stmt.executeUpdate(insertQuery);

            // Select data
            String selectQuery = "SELECT * FROM employees";
            ResultSet result = stmt.executeQuery(selectQuery);
            System.out.println("Employees:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getBigDecimal("salary"));
            }

            // Update data
            String updateQuery = "UPDATE employees SET salary = 55000.00 WHERE id = 1";
            stmt.executeUpdate(updateQuery);

            // Select updated data
            result = stmt.executeQuery(selectQuery);
            System.out.println("Updated Employees:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getBigDecimal("salary"));
            }

            // Delete data
            String deleteQuery = "DELETE FROM employees WHERE id = 1";

            stmt.executeUpdate(deleteQuery);

            // Select data after deletion
            result = stmt.executeQuery(selectQuery);
            System.out.println("Employees after deletion:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getBigDecimal("salary"));
            }

            // Close resources
            result.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }
    }

}
