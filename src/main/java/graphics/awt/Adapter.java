//Question 
    //Show the use of Adapter classes.
//Answer
package graphics.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Adapter extends Frame {
    Label l;
    Adapter() {
        super("Window");
        l=new Label("Adapter Classes");
        add(l);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Adapter cd = new Adapter();
        cd.setVisible(true);
        cd.setSize(450, 450);
        cd.setLayout(new FlowLayout());
    }
}
