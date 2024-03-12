//Question 
    //Create a GUI that connects to the database.
//Answer
package graphics.awt;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseGraphics {
    static Frame f;
    
    static String[] s=new String[20];
    static void initFrame() {
        f = new Frame();
        f.setLayout(null);
        f.setBackground(Color.decode("0x2b2b2b"));
        f.setVisible(true);
        f.setSize(450, 450);
    }

    static ResultSet data() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        String str = System.getProperty("user.dir") + "\\src\\main\\java\\database\\univ.db";
        Connection con = DriverManager.getConnection(
                "jdbc:sqlite:" + str);

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("select * from students");

        return rs;
    }

    DatabaseGraphics() throws SQLException, ClassNotFoundException {
       
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        initFrame();
        Choice c = new Choice();
        ResultSet r = data();
        TextArea t=new TextArea();
        int i=0;
        while (r.next()) {
            int roll = r.getInt(1);
            c.add(String.valueOf(roll));
            s[i]=(r.getString(2) + "\n" + r.getString(3) + "\n" + r.getInt(4));
            i++;

        }
        c.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                t.setText(s[c.getSelectedIndex()]);
            }

        });
        c.setBounds(50, 50, 100, 100);
        t.setBounds(50,100,300,250);

        f.add(c);
        f.add(t);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
}
