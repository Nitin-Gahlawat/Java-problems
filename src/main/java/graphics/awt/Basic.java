//Question 
    //Create a basic awt application in which a label is incremented on clicking of a button.
//Answer
package graphics.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Basic extends Frame implements ActionListener{
    int count=0;
    Button b;
    Label l;
    Basic(){
        super("This is a Basic awt application");

        l=new Label(String.valueOf(count));
        add(l);
        
        
        b=new Button("Click");
        b.addActionListener(this);
        add(b);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        l.setText(String.valueOf(++count));
    }
    public static void main(String[] args) {
        Basic b=new Basic();
        b.setSize(400,400);
        b.setLayout(new FlowLayout());
        b.setVisible(true);
    }

}
