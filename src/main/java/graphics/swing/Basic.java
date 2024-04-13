//Question
    //Write a Basic Program to show the Use of swing Classes in java.
//Answer

package graphics.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Basic extends JFrame implements ActionListener {
    int ct = 0;
    JButton b;
    JLabel l;

    Basic() {
        l = new JLabel("Count is " + ct);
        l.setToolTipText("counter");
        add(l);

        b = new JButton("Click");
        String WindowIconPath = System.getProperty("user.dir") + "\\src\\main\\java\\graphics\\swing\\res\\Click.png";
        ImageIcon WindowIcon = new ImageIcon(WindowIconPath);
        b.setIcon(WindowIcon);
        b.addActionListener(this);
        add(b);

        getRootPane().setDefaultButton(b);

        String ButtonIconPath = System.getProperty("user.dir")
                + "\\src\\main\\java\\graphics\\swing\\res\\BtnImage.png";
        ImageIcon ButtonIcon = new ImageIcon(ButtonIconPath);
        setIconImage(ButtonIcon.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ct++;
        l.setText("Count is " + ct);
    }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException,
            InstantiationException, IllegalAccessException {
        Basic c = new Basic();
        c.setSize(450, 450);
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // List of the Theme of the Swing
        System.out.println("List of the Theme of the Swing");
        UIManager.LookAndFeelInfo[] x = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo p : x) {
            System.out.println(p.getName());
        }
        // Applying motif Theme to the Application
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    }

}
