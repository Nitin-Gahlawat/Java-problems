//Question 
    //Show a basic Drawing on the frame in java awt.
//Answer
package graphics.awt;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Drawing extends Frame {

    int tx=0;
    int ty=0;
    int x=0;
    int y=0;
    Drawing() {
        super("My CheckBox");
        setBackground(Color.BLACK);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                x=e.getX();
                y=e.getY();
                repaint();
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                tx=e.getX();
                ty=e.getY();
                repaint();
            }
        });
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(x,y,100,100);
        g.setColor(Color.RED);
        g.setFont(new Font("SimSun", Font.BOLD+Font.ITALIC, 20));
        // System.out.println(g.getFont().getName());
        g.drawString("Hello", tx, ty);
        
    }
    
    public static void main(String[] args) {
        Drawing c=new Drawing();
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setSize(450,450);
        
    }

}
