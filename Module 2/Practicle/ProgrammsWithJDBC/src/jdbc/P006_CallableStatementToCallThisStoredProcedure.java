package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class P006_CallableStatementToCallThisStoredProcedure {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
        String username = "root";
        String password = "system";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            // Prepare the CallableStatement
            String procedureCall = "{CALL GetEmployeeDetails()}";
            CallableStatement cstmt = conn.prepareCall(procedureCall);
            boolean hadResults = cstmt.execute();

            while (hadResults) {
                ResultSet rs = cstmt.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getBigDecimal("salary"));
                }
                hadResults = cstmt.getMoreResults();
            }

            // Close resources
            cstmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error calling stored procedure.");
            e.printStackTrace();
        }
    }

}
