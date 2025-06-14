package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P011_RetriveAndDisplaysMetaDataInformationAboutYourDatabaseUsingDatabaseMetaData {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
        String username = "root";
        String password = "system";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            DatabaseMetaData metaData = conn.getMetaData();

            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("JDBC Driver Name: " + metaData.getDriverName());
            System.out.println("JDBC Driver Version: " + metaData.getDriverVersion());

            System.out.println("Tables:");
            ResultSet tables = metaData.getTables(null, null, "%", new String[] {"TABLE"});
            while (tables.next()) {
                System.out.println(tables.getString("TABLE_NAME"));
            }
            tables.close();

            System.out.println("Views:");
            ResultSet views = metaData.getTables(null, null, "%", new String[] {"VIEW"});
            while (views.next()) {
                System.out.println(views.getString("TABLE_NAME"));
            }
            views.close();

            System.out.println("Stored Procedures:");
            ResultSet procedures = metaData.getProcedures(null, null, "%");
            while (procedures.next()) {
                System.out.println(procedures.getString("PROCEDURE_NAME"));
            }
            procedures.close();

            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error retrieving metadata.");
            e.printStackTrace();
        }
    }

}
