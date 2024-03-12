//Question 
    //WAP to show the keyEvents (and KeyListener) in java.
//Answer
package graphics.awt;


import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;

public class Key extends Frame implements KeyListener {
    Label l1, l2, l3, l4;
    Panel p;
    Key() {
       super("Key events in java");
        l1 = new Label("");
        l2 = new Label("");
        l3 = new Label("");
        l4 = new Label("");
        p=new Panel();
        p.setLayout(null);
        l1.setBounds(20, 20, 200, 20);
        l2.setBounds(20, 50, 200, 20);
        l3.setBounds(20,70, 200, 20);
        l4.setBounds(20, 90, 200, 20);


        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.setBounds(100,100,200,100);
        add(p);
        addKeyListener(this);
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("keyTyped");
        l2.setText("");
        l3.setText("");
        l4.setText("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("");
        l2.setText("keyPressed");
        l3.setText("");
        l4.setText(new Date(e.getWhen()).toString());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l1.setText("");
        l2.setText("");
        l3.setText("keyReleased");
        l4.setText("");
    }

    public static void main(String[] args) {
        Key cd = new Key();
        cd.setVisible(true);
        cd.setSize(450, 450);
    }
}
