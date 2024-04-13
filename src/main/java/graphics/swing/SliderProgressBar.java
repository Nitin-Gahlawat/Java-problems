//Question
    //Create an application to Show the usage of a Progressbar and Slider.
//Answer
package graphics.swing;

import java.awt.BorderLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderProgressBar extends JFrame implements ChangeListener {

    JSlider js;
    JProgressBar jpb;
    JPanel p1;

    int w=50;

    SliderProgressBar() {
        js=new JSlider(0,100,0);
        js.setMajorTickSpacing(10);
        js.setMinorTickSpacing(1);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        js.setPaintTrack(true);
        add(js,BorderLayout.NORTH);
        js.addChangeListener(this);

        JPanel p=new JPanel();
        jpb=new JProgressBar(SwingConstants.HORIZONTAL,0,100);
        jpb.setString("0%");
        //jpb.setIndeterminate(true);
        jpb.setStringPainted(true);
        p.add(jpb);
        add(p,BorderLayout.SOUTH);


        p1=new JPanel(){
            @Override
            public void paint(Graphics g) {
                g.clearRect(0,0,getWidth(), getHeight());
                g.drawOval(200,200,w,w);
            }
        };

        add(p1,BorderLayout.CENTER);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        w=js.getValue();
        p1.repaint();
        jpb.setValue(w);
        jpb.setString(w+"%");
    }

    public static void main(String[] args) {
        SliderProgressBar n = new SliderProgressBar();
        n.setVisible(true);
        n.setSize(750, 750);
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



}
