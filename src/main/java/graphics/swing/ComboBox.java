//Question
    //Create an application to Show the usage of a Spinner,JList,JComboBox.
//Answer

package graphics.swing;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener,ListSelectionListener,ChangeListener{
    JSpinner sp1,sp2;
    JList<String> list;
    JComboBox<String> cb;
    TextField tf;

    String[] cities = { "New York", "Delhi", "Paris", "Berlin" };
    String[] countries = { "India", "US", "UK", "Canada", "Australia" };
    String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
            "October", "November", "December" };
    String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };


    ComboBox() {
        cb = new JComboBox<>(countries);
        add(cb);
        cb.addActionListener(this);
        
        sp1 = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        sp1.addChangeListener(this);
        add(sp1);
        
        sp2 = new JSpinner(new SpinnerListModel(days));
        sp2.addChangeListener(this);
        add(sp2);
        
        list = new JList<>(months);
        list.setVisibleRowCount(5);
        list.addListSelectionListener(this);
        JScrollPane sp = new JScrollPane(list);
        add(sp);

        tf = new TextField(15);
        add(tf);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText(cb.getSelectedItem().toString());
    }
    @Override
    public void valueChanged(ListSelectionEvent e) {
        tf.setText(list.getSelectedValue().toString());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(e.getSource()==sp1)
            tf.setText(sp1.getValue().toString());
        if(e.getSource()==sp2)
            tf.setText(sp2.getValue().toString());
    }

    public static void main(String[] args) {
        ComboBox n = new ComboBox();
        n.setVisible(true);
        n.setSize(450, 450);
        n.setLayout(new FlowLayout());
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }




}
