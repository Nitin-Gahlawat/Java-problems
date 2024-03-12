//Question 
    //Show the operation on the TextArea using the ActionListener.
//Answer
package graphics.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaDemo extends Frame implements ActionListener {
    TextArea ta;
    Button b;
    TextField tf;
    Label l;

    TextAreaDemo() {
        super("TextArea Demo");
        ta = new TextArea(10, 30);
        add(ta);

        l = new Label("this is a label");
        add(l);

        tf = new TextField(10);
        add(tf);

        b = new Button("Demo");
        add(b);
        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText(ta.getSelectedText());
        // ta.append(tf.getText());
        ta.insert(tf.getText(), ta.getCaretPosition());
    }

    public static void main(String[] args) {
        TextAreaDemo tad = new TextAreaDemo();
        tad.setSize(450, 450);
        tad.setVisible(true);
        tad.setLayout(new FlowLayout());
    }
}
