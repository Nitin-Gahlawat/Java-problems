//Question 
    //Show Various Layouts in java awt.
//Answer
package graphics.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Layouts {
    private Frame FrameInit() {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400, 400);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        return f;
    }

    private Button[] addbtn(int n) {
        Button b[] = new Button[5];
        for (int j = 0; j < b.length; j++) {
            b[j] = new Button("Button " + (j + 1));
        }
        return b;
    }

    void flowLayout() {
        Frame f = FrameInit();
        f.setLayout(new FlowLayout());
        Button[] b = addbtn(5);
        for (Button button : b) {
            f.add(button);
        }
    }

    void boderLayout() {
        Frame f = FrameInit();
        f.setLayout(new BorderLayout());
        Button[] b = addbtn(5);
        f.add(b[0], BorderLayout.CENTER);
        f.add(b[1], BorderLayout.NORTH);
        f.add(b[2], BorderLayout.SOUTH);
        f.add(b[3], BorderLayout.EAST);
        f.add(b[4], BorderLayout.WEST);
    }

    void gridLayout() {
        Frame f = FrameInit();
        Button[] b = addbtn(5);
        f.setLayout(new GridLayout(3, 2));
        for (Button button : b) {
            f.add(button);
        }
    }

    void gridBagLayout() {
        Frame f = FrameInit();
        Button[] b = addbtn(5);
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        f.setLayout(gbl);
        c.gridx = 0;
        c.gridy = 0;
        for (int i = 1; i <= b.length; i++) {
            f.add(b[i - 1], c);
            c.gridx = i; // 1,2,3,....
            c.gridy = i; // 1,2,3,....
        }
    }

    void cardLayout() {
        Frame f = FrameInit();
        CardLayout cd = new CardLayout();
        Panel a, b;
        final Panel all = new Panel(cd);

        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox one = new Checkbox("one", true, cbg);
        Checkbox two = new Checkbox("two", false, cbg);
        one.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (one.getState()) {
                    cd.first(all);
                } else {
                    cd.last(all);
                }
            }
        }); // onclick of the one radio button
        two.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (one.getState()) {
                    cd.first(all);
                } else {
                    cd.last(all);
                }
            }
        }); // onclick of the two radio button

        Panel mp = new Panel();
        mp.add(one);
        mp.add(two);
        f.add(mp, BorderLayout.NORTH);

        a = new Panel(new FlowLayout());
        b = new Panel(new FlowLayout());
        Button b1 = new Button("one card");
        a.add(b1);
        Button b2 = new Button("two card");
        b.add(b2);

        all.add("one", a);
        all.add("two", b);
        f.add(all, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Layouts l = new Layouts();
        System.out.println("There are 5 Frame one on another created..");
        l.boderLayout();
        l.flowLayout();
        l.gridLayout();
        l.gridBagLayout();
        l.cardLayout();
        
    }
}
