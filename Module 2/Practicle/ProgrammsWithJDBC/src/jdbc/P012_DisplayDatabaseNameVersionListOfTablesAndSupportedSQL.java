package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P012_DisplayDatabaseNameVersionListOfTablesAndSupportedSQL {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
        String username = "root";
        String password = "system";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            DatabaseMetaData metaData = conn.getMetaData();

            // Database name and version
            System.out.println("Database Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Version: " + metaData.getDatabaseProductVersion());

            // List of tables
            System.out.println("\nList of Tables:");
            ResultSet tables = metaData.getTables(null, null, "%", new String[] {"TABLE"});
            while (tables.next()) {
                System.out.println(tables.getString("TABLE_NAME"));
            }
            tables.close();

            // Supported SQL
            System.out.println("\nSupported SQL:");
            System.out.println("SQL Keywords: " + metaData.getSQLKeywords());
            System.out.println();
            System.out.println("Numeric Functions: " + metaData.getNumericFunctions());
            System.out.println();
            System.out.println("String Functions: " + metaData.getStringFunctions());
            System.out.println();
            System.out.println("System Functions: " + metaData.getSystemFunctions());
            System.out.println();
            System.out.println("Time Date Functions: " + metaData.getTimeDateFunctions());

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error retrieving database info.");
            e.printStackTrace();
        }
    }

}
