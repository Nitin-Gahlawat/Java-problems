//Question 
    //Create an awt application in which selected option of the Checkbox is shown in the label.
//Answer
package graphics.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Checkbox extends Frame implements ItemListener {
    Label l;

    java.awt.Checkbox c1,c2, c3;

    Checkbox() {
        super("My CheckBox");
        l = new Label("Nothing is selected ");
        add(l);

        c1=new java.awt.Checkbox("Python");
        c2=new java.awt.Checkbox("Java");
        c3=new java.awt.Checkbox("C#");

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        add(c1);
        add(c2);
        add(c3);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str="";
        if(c1.getState())
            str+=" "+c1.getLabel();
        if(c2.getState())
            str+=" "+c2.getLabel();
        if(c3.getState())
            str+=" "+c3.getLabel();
        if(str.isEmpty())
            str="Nothing is selected ";
        l.setText(str);

    }

    public static void main(String[] args) {
        Checkbox c=new Checkbox();
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setSize(450,450);
        
    }

}
