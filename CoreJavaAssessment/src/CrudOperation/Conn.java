package CrudOperation;



import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            
            c = DriverManager.getConnection("jdbc:mysql:///CRUD","root","system");
            s = c.createStatement();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
