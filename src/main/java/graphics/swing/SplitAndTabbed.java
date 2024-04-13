//Question
    //Create an application to Show usage of Split and Tabbed Pane.
//Answer
package graphics.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;

public class SplitAndTabbed extends JFrame implements ListSelectionListener {
    JList<String> list;
    JSplitPane jsp;
    JLabel l;
    String[] data = { "RED", "BLUE", "GREEN", "BLACK", "ORANGE", "MAGENTA" };

    SplitAndTabbed() {

        list = new JList<String>(data);
        JScrollPane p = new JScrollPane(list);
        list.setSelectedIndex(0);
        list.addListSelectionListener(this);

        l = new JLabel(" ");
        l.setOpaque(true);
        l.setBackground(Color.RED);
        JScrollPane p1 = new JScrollPane(l);

        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p, p1);
        jsp.setDividerLocation(250);
        add(jsp);

        /*** Code for the Tabbed pane ***/
        // JTabbedPane jtp = new JTabbedPane();
        // jtp.addTab("Label", p);
        // jtp.add("Colors", p1);
        // add(jtp);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        switch (list.getSelectedValue().toUpperCase()) {
            case "ORANGE":
                l.setBackground(Color.ORANGE);
                break;
            case "BLUE":
                l.setBackground(Color.BLUE);
                break;
            case "GREEN":
                l.setBackground(Color.GREEN);
                break;
            case "RED":
                l.setBackground(Color.RED);
                break;
            case "BLACK":
                l.setBackground(Color.BLACK);
                break;
            case "MAGENTA":
                l.setBackground(Color.MAGENTA);
                break;

        }
    }

    public static void main(String[] args) {
        SplitAndTabbed n = new SplitAndTabbed();
        n.setVisible(true);
        n.setSize(750, 750);
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
