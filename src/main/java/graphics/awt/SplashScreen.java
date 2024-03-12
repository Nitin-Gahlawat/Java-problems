//Question 
    //Create a Splash Screen in java awt.
//Answer
package graphics.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class SplashScreen extends Thread implements ActionListener{
    @Override
    public void run() {
        Frame frame = new Frame("Simple Frame");
        frame.setBackground(Color.BLACK);
        frame.setForeground(Color.white);
        Label l = new Label("This is a splash screen", Label.CENTER);
        Label per = new Label(" ", Label.CENTER);
        frame.add(l, BorderLayout.CENTER);
        frame.add(per, BorderLayout.SOUTH);
        frame.setUndecorated(true);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        try {
            int i = 0;
            while (i <= 100) {
                Thread.sleep(1 * 100);
                per.setText(String.valueOf(i) + "%");
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        frame.setVisible(false);

    }

    int count = 0;
    Button b;
    Label l;

    void create() {
        Frame f = new Frame("This is a basic awt appliction");

        l = new Label(String.valueOf(count));
        f.setForeground(Color.WHITE);
        f.add(l);

        f.setBackground(Color.decode("0x2b2b2b"));
        b = new Button("Click");
        b.addActionListener(this);
        f.add(b);
        f.setSize(f.getMaximumSize());
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText(String.valueOf(++count));
    }

    public static void main(String[] args) {
        SplashScreen t = new SplashScreen();
        t.start();
        t.create();
    }
}
