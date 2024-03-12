//Question 
    //Create a Menu bar inside frame in java.
//Answer
package graphics.awt;

import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuDemo extends Frame {
    MenuBar mb = new MenuBar();
    TextField tf = new TextField(10);
    

    MenuDemo() {
        super("Menu Demo");
        add(tf);

        Menu file = new Menu("File");

        MenuItem open = new MenuItem("open");
        open.addActionListener((ActionEvent e) -> { tf.setText(open.getLabel());});
        file.add(open);

        Menu sub = new Menu("Close");
        MenuItem close = new MenuItem("close");
        close.addActionListener((ActionEvent e) -> {
            tf.setText(close.getLabel());
        });
        sub.add(close);

        MenuItem closeAll = new MenuItem("closeAll");
        closeAll.addActionListener((ActionEvent e) -> {
            tf.setText(closeAll.getLabel());
        });
        sub.add(closeAll);

        file.add(sub);


        
        CheckboxMenuItem cb = new CheckboxMenuItem("Auto Save");
        cb.addItemListener((ItemEvent e) -> {
            if (cb.getState())
            tf.setText(cb.getLabel() + " on");
            else
            tf.setText(cb.getLabel() + " off");
        });
        file.add(cb);

        mb.add(file);
        setMenuBar(mb);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });

    }

    public static void main(String[] args) {
        MenuDemo c = new MenuDemo();
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setSize(450, 450);

    }

}
