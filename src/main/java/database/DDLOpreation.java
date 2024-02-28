//Question
    //WAP to show DDL Opreation on a database.
//Answer
package database;
import java.sql.*;
public class DDLOpreation {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");  
        String str = System.getProperty("user.dir") + "\\src\\main\\java\\database\\univ.db";
        Connection c=DriverManager.getConnection(  
        "jdbc:sqlite:"+str);

        Statement s=c.createStatement();
        s.executeUpdate("Create table Temp(a integer,b integer)");
        System.out.println("Temp table created");
        s.executeUpdate("Drop table Temp");
        System.out.println("Temp table droped");
    }
}
