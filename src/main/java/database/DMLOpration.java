//Question
    //WAP to show DML Opreation on a database.
//Answer
package database;

import java.sql.*;

public class DMLOpration {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");  
        String str = System.getProperty("user.dir") + "\\src\\main\\java\\database\\univ.db";
        Connection con=DriverManager.getConnection(  
        "jdbc:sqlite:"+str);
        
        Statement s=con.createStatement();    

        s.executeUpdate("insert into dept values(120,'Cooking')");
        System.out.println("Insert sucessfull");


        System.out.println("The values of the dept table is");
        ResultSet rs=s.executeQuery("select * from dept");  
        while (rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }

        // s.executeUpdate("delete from dept where deptno=120");
        System.out.println("deptno=120 is deleted");

        con.close();  

    }
}
