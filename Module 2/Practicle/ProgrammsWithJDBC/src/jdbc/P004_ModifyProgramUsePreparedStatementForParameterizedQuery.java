package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class P004_ModifyProgramUsePreparedStatementForParameterizedQuery {

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

            // Create table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY auto_increment, name VARCHAR(255), fee DECIMAL(10, 2))";
            PreparedStatement pstmt = conn.prepareStatement(createTableQuery);
            pstmt.executeUpdate();

            // Insert data
            String insertQuery = "INSERT INTO student (id, name, fee) VALUES (?, ?, ?)";
            pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, 1);
            pstmt.setString(2, "Miku Kumar");
            pstmt.setBigDecimal(3, new java.math.BigDecimal("50000.00"));
            pstmt.executeUpdate();
            System.out.println("Data Inserted Successfully...............");

            // Select data
            String selectQuery = "SELECT * FROM student WHERE id = ?";
            pstmt = conn.prepareStatement(selectQuery);
            pstmt.setInt(1, 1);
            ResultSet result = pstmt.executeQuery();
            System.out.println("Student:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getBigDecimal("fee"));
            }
            System.out.println("Data Displayed Successfully...............");

            // Update data
            String updateQuery = "UPDATE student SET name = ?, fee = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, "Miku");
            pstmt.setBigDecimal(2, new java.math.BigDecimal("55645.00"));
            pstmt.setInt(3, 1);
            pstmt.executeUpdate();
            System.out.println("Data Updated Successfully...............");

            // Select updated data
            pstmt = conn.prepareStatement(selectQuery);
            pstmt.setInt(1, 1);
            result = pstmt.executeQuery();
            System.out.println("Updated Student:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getBigDecimal("fee"));
            }
            System.out.println("Updated Data Displayed Successfully...............");

            // Delete data
            String deleteQuery = "DELETE FROM student WHERE id = ?";
            pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, 1);
            pstmt.executeUpdate();
            System.out.println("Data Deleted Successfully...............");

            // Close resources
            result.close();
            pstmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }
    }

}
