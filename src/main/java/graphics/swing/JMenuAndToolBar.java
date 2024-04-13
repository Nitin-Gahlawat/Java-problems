//Question
    //Create a JMenu and Tool bar in swing.
//Answer
package graphics.swing;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class JMenuAndToolBar extends JFrame implements ActionListener {

    JToolBar t;

    JButton  a, b, e;

    JTextArea ta;

    JMenuItem mi, mi1;

    JMenuAndToolBar() {

        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu("file");

        mi = new JMenuItem("Open");
        m.add(mi);
        mi.addActionListener(this);
        m.setMnemonic(KeyEvent.VK_O);
        mi1 = new JMenuItem("Save");
        m.setMnemonic(KeyEvent.VK_S);
        m.add(mi1);
        mi1.addActionListener(this);
        mb.add(m);
        setJMenuBar(mb);

        JToolBar tb = new JToolBar();
        a = new JButton("New");
        b = new JButton("Save AS");

        tb.add(a);
        tb.add(b);
        add(tb, BorderLayout.NORTH);
        ta = new JTextArea();
        add(ta, BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi) {
            JFileChooser f = new JFileChooser();
            f.showOpenDialog(this);
            File file = f.getSelectedFile();
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] b = new byte[fis.available()];
                fis.read(b);
                String str = new String(b);
                ta.setText(str);
                fis.close();

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } else {
            Color r=JColorChooser.showDialog(this,"FontColor", Color.ORANGE);
            ta.setForeground(r);
        }

    }

    public static void main(String[] args) {
        JMenuAndToolBar n = new JMenuAndToolBar();
        n.setVisible(true);
        n.setSize(450, 450);
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
