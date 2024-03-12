//Question 
    //Show various Mouse Events in java.
//Answer
package graphics.awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Mouse extends Frame implements MouseListener,MouseMotionListener{
    Label l1,l2,l3;
    Mouse(){
        l1=new Label("nothing happend");
        l2=new Label("No Motion happend");
        l3=new Label("");
        add(l1);
        add(l2);
        add(l3);

        setLayout(null);
        l1.setBounds(50, 50, 100, 20);
        l2.setBounds(50, 100, 100, 20);
        l3.setBounds(50,150,100,20);
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public static void main(String[] args) {
        Mouse cd = new Mouse();
        cd.setVisible(true);
        cd.setSize(450, 450);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        l1.setText("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l1.setText("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l1.setText("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l1.setText("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l1.setText("mouseExited");
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        l2.setText("mouseMoved");
        l3.setText("("+e.getX()+","+e.getY()+")");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        l2.setText("mouseDragged");
    }
}
