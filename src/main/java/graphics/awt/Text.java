//Question 
    //Show the operation on the textField using the  TextListener and ActionListener.
//Answer
package graphics.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Text extends Frame {
    Label l1, l2;
    TextField tf;

    Text() {
        super(" TextFiled Demo");
        l1 = new Label("No text is Entered yet");
        add(l1);
        l2 = new Label("Enter key is not presed yet");
        add(l2);
        tf = new java.awt.TextField(20);
        // tf.setEchoChar('*');
        add(tf);

        Handler h=new Handler();
        tf.addActionListener(h);
        tf.addTextListener(h);
    }


    class Handler implements ActionListener, TextListener{
        @Override
        public void textValueChanged(TextEvent e) {
            l1.setText(tf.getText());
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            l2.setText(tf.getText());
        }
    
    }
    public static void main(String[] args) {
        Text t = new Text();
        t.setVisible(true);
        t.setSize(450, 450);
        t.setLayout(new FlowLayout());
    }
}
