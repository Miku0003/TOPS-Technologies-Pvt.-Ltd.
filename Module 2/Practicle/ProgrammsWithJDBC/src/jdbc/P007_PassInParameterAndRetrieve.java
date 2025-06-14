package jdbc;

import java.sql.*;

public class P007_PassInParameterAndRetrieve {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
        String username = "root";
        String password = "system";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            // Prepare the CallableStatement
            String procedureCall = "{CALL GetEmployeeDetailsByDepartment(?)}";
            CallableStatement cstmt = conn.prepareCall(procedureCall);
            cstmt.setString(1, "java developer");
            boolean hadResults = cstmt.execute();

            while (hadResults) {
                ResultSet rs = cstmt.getResultSet();
                while (rs.next()) {
                    System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getString("department") + " " + rs.getBigDecimal("salary"));
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
