//Question 
    //Create a Color palette using ScrollBar.
//Answer
package graphics.awt;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarDemo extends Frame implements AdjustmentListener {
    Scrollbar s1, s2, s3;
    TextField tf;
    Label l1, l2, l3;

    ScrollBarDemo() {
        super("ScrollBar");
        l1 = new Label("Red");
        s1 = new Scrollbar(Scrollbar.HORIZONTAL, 50, 20, 0, 255);
        l2 = new Label("Green");
        s2 = new Scrollbar(Scrollbar.HORIZONTAL, 50, 20, 0, 255);
        l3 = new Label("Blue");
        s3 = new Scrollbar(Scrollbar.HORIZONTAL, 100, 20, 0, 255);

        tf = new TextField(20);
        tf.setBackground(new Color(s1.getValue(), s2.getValue(), s3.getValue()));

        tf.setBounds(50, 50, 300, 50);
        l1.setBounds(50, 130, 300, 30);
        s1.setBounds(50, 150, 300, 30);
        l2.setBounds(50, 180, 300, 30);
        s2.setBounds(50, 200, 300, 30);
        l3.setBounds(50, 230, 300, 30);
        s3.setBounds(50, 250, 300, 30);
        setLayout(null);

        add(tf);
        add(l1);
        add(s1);
        add(l2);
        add(s2);
        add(l3);
        add(s3);

        s1.addAdjustmentListener(this);
        s2.addAdjustmentListener(this);
        s3.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(s1.getValue(), s2.getValue(), s3.getValue()));
    }

    public static void main(String[] args) {
        ScrollBarDemo cd = new ScrollBarDemo();
        cd.setVisible(true);
        cd.setSize(450, 450);
    }

}
