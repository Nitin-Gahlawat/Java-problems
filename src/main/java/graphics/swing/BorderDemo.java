//Question
    //WAP to Add a Border to the JPanel.
//Answer
package graphics.swing;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class BorderDemo extends JFrame {
    JPanel p;
    JLabel l;
    JTextField t;
    JButton b;

    BorderDemo() {
        p = new JPanel();
        l = new JLabel("Name");
        t = new JTextField(20);
        b = new JButton("OK");

        p.add(l);
        p.add(t);
        p.add(b);
        Border br= BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE),"Login",TitledBorder.CENTER, TitledBorder.TOP );

        // Border br= BorderFactory.createLineBorder(Color.BLUE);

        // Border br = BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLUE),BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        p.setBorder(br);
        add(p);
    }

    public static void main(String[] args) {
        BorderDemo n = new BorderDemo();
        n.setVisible(true);
        n.setSize(450, 450);
        n.setLayout(new FlowLayout());
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
