//Question
    //WAP to show JTextField,JFormattedText and TextArea in swing java.
//Answer
package graphics.swing;

import java.awt.FlowLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class JTextFieldDemo extends JFrame {

    JTextFieldDemo() {
        // 1 JTextField
        JTextField tf = new JTextField(15);
        tf.setToolTipText("This is Simple TextField");
        add(tf);

        // 2 JTextField
        SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy");
        JFormattedTextField date_tf = new JFormattedTextField(df);
        date_tf.setColumns(20);
        date_tf.setValue(new Date());
        date_tf.setToolTipText("This is for date");
        add(date_tf);

        // 3 JTextField
        NumberFormat nf = NumberFormat.getInstance();
        NumberFormatter n = new NumberFormatter(nf);
        n.setAllowsInvalid(false);
        n.setMaximum(1000);
        JFormattedTextField tf3 = new JFormattedTextField(n);
        tf3.setColumns(20);
        tf3.setToolTipText("This is for Number");
        add(tf3);

        // 4 JTextField
        NumberFormat curr_for = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormatter n1 = new NumberFormatter(curr_for);
        n1.setAllowsInvalid(false);
        n1.setMaximum(1000);
        JFormattedTextField tf4 = new JFormattedTextField(n1);
        tf4.setColumns(20);
        tf4.setValue(0);
        tf4.setToolTipText("This is for Currency");
        add(tf4);

        // TextArea
        JTextArea Text_Area = new JTextArea(30, 30);
        Text_Area.setText("Hello world");
        Text_Area.setToolTipText("This is TextArea");
        add(Text_Area);

        setLayout(new FlowLayout());

    }

    public static void main(String[] args) {
        JTextFieldDemo tf = new JTextFieldDemo();
        tf.setVisible(true);
        tf.setTitle("JTextField,JFormattedText and TextArea");
        tf.setSize(450, 450);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
