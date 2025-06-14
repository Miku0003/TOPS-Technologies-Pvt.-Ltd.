package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P010_NevigateThroughTheResultSetUsingethodLikeNextAndPrevious {

    public static void main(String[] args) {
        String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
        String username = "root";
        String password = "system";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, username, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            System.out.println("Navigating forward:");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }

            System.out.println("Navigating backward:");
            rs.afterLast();
            while (rs.previous()) {
                System.out.println(rs.getString("name"));
            }

            System.out.println("Moving to first row:");
            rs.first();
            System.out.println(rs.getString("name"));

            System.out.println("Moving to last row:");
            rs.last();
            System.out.println(rs.getString("name"));

            System.out.println("Moving before first row:");
            rs.beforeFirst();
            System.out.println("Is before first row: " + rs.isBeforeFirst());

            System.out.println("Moving after last row:");
            rs.afterLast();
            System.out.println("Is after last row: " + rs.isAfterLast());

            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error navigating ResultSet.");
            e.printStackTrace();
        }
    }

}
