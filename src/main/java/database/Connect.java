//Question
    //WAP to show a connection to database in java.
//Answer
package database;

import java.sql.*;

public class Connect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		String str = System.getProperty("user.dir") + "\\src\\main\\java\\database\\univ.db";
		Connection c=DriverManager.getConnection("jdbc:sqlite:"+str);
		Statement s=c.createStatement();
		ResultSet r=s.executeQuery("select * from students");
		while(r.next()) {
			System.out.println(r.getInt("roll")+" "+r.getString("name")+" "+r.getString(3)+" "+r.getInt(4));
		}
		s.close();
		c.close();
		
	}
}
