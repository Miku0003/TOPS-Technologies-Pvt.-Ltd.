package jdbc;


import java.sql.*;
import java.util.Scanner;

public class P001_SimpleJDBCConnection {
    public static void main(String[] args) {

        // Database connection parameters
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";

        String username = "root";
        String password = "system";

        try {

            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            // Create a statement object
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter User name: ");
            String uname = sc.nextLine();
            System.out.println("Enter Password: ");
            String pass = sc.nextLine();

            // Establish database connection
            Statement stmt = conn.createStatement();

            //data insert in database
            try{

                String query = "insert into login values('"+uname+"', '"+pass+"')";
                stmt.executeUpdate(query);

            }catch (Exception e){
                e.printStackTrace();
            }


            // Execute a query
            ResultSet result = stmt.executeQuery("SELECT * FROM login");

            // Process the result set
            while (result.next()) {
                System.out.println(result.getString(1) + " " + result.getString(2));
            }

            // Close the connection
            conn.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error connecting to database or executing query.");
            e.printStackTrace();
        }
    }
}
