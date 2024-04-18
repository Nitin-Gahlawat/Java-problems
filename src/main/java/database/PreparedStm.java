//Question
    //Show the use of Prepared Statement in Database java.
//Answer
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class PreparedStm {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("org.sqlite.JDBC");
		String str = System.getProperty("user.dir") + "\\src\\main\\java\\database\\univ.db";
		Connection c = DriverManager.getConnection("jdbc:sqlite:" + str);

		//PreparedStatement is used so that we can take input from the user
		PreparedStatement s = c.prepareStatement("Insert into Students values(?,?,?,?)");

		//Data to be stored into the database
		System.out.println("Enter the roll number");
		s.setInt(1, sc.nextInt());
		System.out.println("Enter the name");
		s.setString(2, sc.next());
		System.out.println("Enter the city");
		s.setString(3, sc.next());
		System.out.println("Enter the dept number");
		s.setInt(4, sc.nextInt());
		s.executeUpdate();


		s.close();
		c.close();
		sc.close();
	}
}
