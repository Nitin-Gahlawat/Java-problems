//Question
    //Create an application Showing the use of the JLayeredPane.
//Answer
package graphics.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class LayeredPaneDemo extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;

    JRadioButton r1, r2, r3;

    JLayeredPane lp;

    LayeredPaneDemo() {
        JPanel p = new JPanel();
        r1 = new JRadioButton("Red");
        r2 = new JRadioButton("Green");
        r3 = new JRadioButton("Blue", true);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        p.add(r1);
        p.add(r2);
        p.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);
        add(p, BorderLayout.NORTH);

        lp = new JLayeredPane();
        lp.setLayout(null);

        l1 = new JLabel("RED");
        l1.setBackground(Color.RED);
        l1.setBounds(130, 130, 200, 200);
        l1.setOpaque(true);
        lp.add(l1, Integer.valueOf(0));

        l2 = new JLabel("Green");
        l2.setBackground(Color.GREEN);
        l2.setBounds(160, 160, 200, 200);
        l2.setOpaque(true);
        lp.add(l2, Integer.valueOf(1));

        l3 = new JLabel("Blue");
        l3.setBackground(Color.BLUE);
        l3.setBounds(200, 200, 200, 200);
        l3.setOpaque(true);
        lp.add(l3, Integer.valueOf(2));

        l4 = new JLabel("");
        l4.setBackground(Color.BLACK);
        l4.setBounds(0, 0, 100, 100);
        l4.setOpaque(true);
        lp.add(l4, Integer.valueOf(3));

        add(lp, BorderLayout.CENTER);

        addMouseMotionListener(new MouseAdapter() {

            @Override
            public void mouseMoved(MouseEvent e) {
                l4.setLocation(e.getX(), e.getY());
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (r1.isSelected())
            lp.setLayer(l4, Integer.valueOf(1));
        if (r2.isSelected())
            lp.setLayer(l4, Integer.valueOf(2));
        if (r3.isSelected())
            lp.setLayer(l4, Integer.valueOf(3));

    }

    public static void main(String[] args) {
        LayeredPaneDemo tf = new LayeredPaneDemo();
        tf.setVisible(true);
        tf.setSize(800, 800);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
