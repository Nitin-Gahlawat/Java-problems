//Question 
    //Create a bouncing ball Animation in java.awt .
//Answer
package graphics.awt;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Animation extends Frame {

    int x = 100;
    int y = 100;
    int xchange = 1;
    int ychange = 1;

    Animation() {
        super("My CheckBox");
        setBackground(Color.BLACK);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    x = x + xchange;
                    y = y + ychange;
                    if (x > 450 || x < 0) {
                        xchange = xchange * (-1);
                    }
                    if (y > 550 || y < 20) {
                        ychange = ychange * (-1);
                    }
                    repaint();
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 50, 50);

    }

    public static void main(String[] args) {
        Animation c = new Animation();
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setSize(500, 600);

    }

}
