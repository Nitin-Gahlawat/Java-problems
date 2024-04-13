//Question
    //Create a application to Change case and style of the text in JTextField using RadioButton and CheckBox.
//Answer
package graphics.swing;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JRadioBtnAndJCheckBox extends JFrame implements ItemListener {
    JRadioButton r1, r2;
    ButtonGroup bg;
    JTextField tf;
    JCheckBox i, b;

    JRadioBtnAndJCheckBox() {
        tf = new JTextField("java, Lua and Python", 25);
        add(tf);

        r1 = new JRadioButton("Lower");
        add(r1);
        r2 = new JRadioButton("Upper");
        add(r2);
        bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);


        i = new JCheckBox("Italic");
        add(i);
        b = new JCheckBox("Bold");
        add(b);

        r1.addItemListener(this);
        r2.addItemListener(this);
        i.addItemListener(this);
        b.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //Logic for the Lower case and the upper case
        if (e.getSource() == r1)
            tf.setText(tf.getText().toLowerCase());
        if (e.getSource() == r2)
            tf.setText(tf.getText().toUpperCase());

        //Logic for Bold and Italic
        int x = 0, y = 0;
        if (i.isSelected())
            x = Font.ITALIC;
        if (b.isSelected())
            y = Font.BOLD;
        tf.setFont(new Font("Times new Roman", x | y, 20));
    }

    public static void main(String[] args) {
        JRadioBtnAndJCheckBox n = new JRadioBtnAndJCheckBox();
        n.setVisible(true);
        n.setSize(450, 450);
        n.setLayout(new FlowLayout());
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
