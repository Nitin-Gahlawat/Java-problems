//Question 
    //WAP to show the Use of List and Choice in java awt
//Answer
package graphics.awt;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ListBoxAndChoice extends Frame implements ItemListener,ActionListener {
    Choice c;
    TextArea ta;
    List l;
    String[] ListStr = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };
    String[] ChoiceStr = {
            "Rust","Python", "Java", "lua", "c#", "c", "c++"
    };

    ListBoxAndChoice() {
        super("Choice and the List");
        c = new Choice();
        for (String string : ChoiceStr) {
            c.addItem(string);
        }
        add(c);
        c.addItemListener(this);

        l = new List(3,true);
        for (String string : ListStr) {
            l.add(string);
        }
        add(l);
        l.addItemListener(this);
        l.addActionListener(this);

        ta = new TextArea(20, 30);
        add(ta);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c)
            ta.setText(c.getSelectedItem());
        else{
            ta.setText(l.getSelectedItem());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==l){
            String[] str =l.getSelectedItems();
            StringBuilder temp= new StringBuilder();
            for (String string : str) {
                temp.append(string).append("\n");
            }
            ta.setText(temp.toString());
            // l.deselect(4);
            // l.getItems()
            // l.remove();
            // l.select();
            // l.setMultipleMode();
        }
    }

    public static void main(String[] args) {
        ListBoxAndChoice cd = new ListBoxAndChoice();
        cd.setVisible(true);
        cd.setSize(450, 450);
        cd.setLayout(new FlowLayout());
    }
}
