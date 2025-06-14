package jdbc;
import java.sql.*;
import java.util.*;
public class P005_ConsoleBasedCRUD_Operation {
    static String dbUrl = "jdbc:mysql://localhost:3306/Assignment";
    static String username = "root";
    static String password = "system";
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){

        int option;
        do {
            System.out.println("Enter 1 for Insert Data:");
            System.out.println("Enter 2 for View All Data:");
            System.out.println("Enter 3 for Search Data:");
            System.out.println("Enter 4 for Update Data:");
            System.out.println("Enter 5 for Delete Data:");
            System.out.println("Enter 6 for Exit:");
            System.out.println("Enter your Operation Which You Want: ");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    insert();
                    break;
                case 2:
                    view();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                case 6:
                    System.out.println("Thank You! for Exit.");
                    System.exit(0);
                default:
                    System.out.println("Please Choose Correct Option.");
            }

        }while(option != 6);
    }


//    Insert Method
    public static void insert(){

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            // Create a statement object
            Statement stmt = conn.createStatement();

            System.out.println("Enter student id");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Course Name : ");
            String coursename = sc.nextLine();
            System.out.println("Enter How much fee did you pay for this course : ");
            float fee = sc.nextFloat();


            // Create table
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(255), coursename VARCHAR(255), fee float(10, 2))";
            stmt.executeUpdate(createTableQuery);

            // Insert data
            String insertQuery = "INSERT INTO students (id, name, coursename, fee) VALUES (?, ?, ?, ?)";


            PreparedStatement pst = conn.prepareStatement(insertQuery);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, coursename);
            pst.setFloat(4, fee);
            pst.executeUpdate();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }

    }   //Insert Method Closed

//    View Method
    public static void view(){

        try{
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            Statement stmt = conn.createStatement();
            String selectQuery = "SELECT * FROM students";
            ResultSet result = stmt.executeQuery(selectQuery);
            System.out.println("Students:");
            System.out.println("Student id\t Student name\t\t Course Name\t\t Paid fee");
            while (result.next()) {
                System.out.println(result.getInt("id") + "\t\t\t " + result.getString("name") +"\t\t\t " + result.getString("coursename") +"\t\t\t\t " + result.getBigDecimal("fee"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }

    }   //View Method Closed

//    Search Method
    public static void search(){

        try{

            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            Statement stmt = conn.createStatement();
            System.out.println("Enter student id You want to search");
            int id = sc.nextInt();

            String selectQuery = "SELECT * FROM students where id = '"+id+"'";
            ResultSet result = stmt.executeQuery(selectQuery);
            System.out.println("Students:");
            System.out.println("Student id\t Student name\t\t Course Name\t\t Paid fee");
            if (result.next()) {
                System.out.println(result.getInt("id") + "\t\t\t " + result.getString("name") +"\t\t\t " + result.getString("coursename") +"\t\t\t\t " + result.getBigDecimal("fee"));
            }else{
                System.out.println("Data not found.");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }

    }   //Search Method Closed

//    Update Method
    public static void update(){

        try{
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            Statement stmt = conn.createStatement();


            System.out.println("Enter student id You want to update");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Student Name for update : ");
            String name = sc.nextLine();
            System.out.println("Enter Course Name for update : ");
            String coursename = sc.nextLine();
            System.out.println("Enter How much fee did you pay for this course for update : ");
            float fee = sc.nextFloat();

            // Select data
            String selectQuery = "SELECT * FROM students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(selectQuery);
            pstmt = conn.prepareStatement(selectQuery);
            pstmt.setInt(1, id);
            ResultSet result = pstmt.executeQuery();
            System.out.println("Before Update:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getString("coursename") + " " + result.getBigDecimal("fee"));
            }


            // Update data
            String updateQuery = "UPDATE students SET name = ?, coursename = ?, fee = ? WHERE id = ?";
            pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, name);
            pstmt.setString(2, coursename);
            pstmt.setBigDecimal(3, new java.math.BigDecimal(fee));
            pstmt.setInt(4, id);
            pstmt.executeUpdate();

            // Select updated data
            pstmt = conn.prepareStatement(selectQuery);
            pstmt.setInt(1, id);
            result = pstmt.executeQuery();
            System.out.println("After Update:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getString("coursename") + " " + result.getBigDecimal("fee"));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }

    }   //Update Method Closed

//    Delete Method
    public static void delete(){

        try{

            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dbUrl, username, password);

            // Create a statement object
            Statement stmt = conn.createStatement();

            System.out.println("Enter Id You Want to Delete: ");
            int id = sc.nextInt();

            String deleteQuery = "delete from students where id=?";
            PreparedStatement pst = conn.prepareStatement(deleteQuery);
            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println("Data deleted Successfully");

            // Select Deleted data
            String selectQuery = "SELECT * FROM students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(selectQuery);
            pstmt = conn.prepareStatement(selectQuery);
            pstmt.setInt(1, id);
             ResultSet result = pstmt.executeQuery();
            System.out.println("After Update:");
            while (result.next()) {
                System.out.println(result.getInt("id") + " " + result.getString("name") + " " + result.getString("coursename") + " " + result.getBigDecimal("fee"));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
        } catch (SQLException e) {
            System.out.println("Error performing CRUD operations.");
            e.printStackTrace();
        }

    }   //Delete Method Closed



}
