//Question 
    //Create a radio button appliction in java.awt for showing only one selection at a time. 
//Answer
package graphics.awt;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButton extends Frame implements ItemListener {
    Label l;

    Checkbox c1,c2, c3;

    RadioButton() {
        super("My CheckBox");
        l = new Label("Nothing is selected ");
        add(l);

        CheckboxGroup radio =new CheckboxGroup();
        c1=new Checkbox("Python",radio,false);
        c2=new Checkbox("Java",radio,false);
        c3=new Checkbox("C#",radio,false);

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
        if(str.equals(""))
            str="Nothing is selected ";
        l.setText(str);

    }

    public static void main(String[] args) {
        RadioButton c=new RadioButton();
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setSize(450,450);
        
    }

}
