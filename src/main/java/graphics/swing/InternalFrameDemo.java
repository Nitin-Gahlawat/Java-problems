//Question
    //Show the use of the Internal Frame in swing.
//Answer
package graphics.swing;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
class MyInternalFrame extends  JInternalFrame{

    JTextArea ta;
    JScrollPane sp;
    static int ct=0;

    public MyInternalFrame() {
        super("Doc"+(++ct),true,true,true,true);

        ta=new JTextArea();
        sp=new JScrollPane();
        sp.add(ta);
        add(sp);

        //Menu bar
        JMenuBar mb=new JMenuBar();
        JMenu m=new JMenu("File");
        mb.add(m);
        JMenuItem mi=new JMenuItem("SAVE");
        m.add(mi);
        setJMenuBar(mb) ;

        //JInternalFrame
        setSize(300,300);
        setLocation(50,50);
        setVisible(true);
    }
}

public class InternalFrameDemo extends  JFrame implements ActionListener {
    JDesktopPane p;
    InternalFrameDemo(){
        super("Internal Frame Demo");

        // JDesktopPane
        p=new JDesktopPane();
        p.setBackground(Color.ORANGE);
        setContentPane(p);

        //Main JMenuBar
        JMenuBar mb=new JMenuBar();
        JMenu m=new JMenu("New");
        mb.add(m);
        JMenuItem mi=new JMenuItem("Doc");
        m.add(mi);
        setJMenuBar(mb);
        mi.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyInternalFrame my=new MyInternalFrame();
        p.add(my);
    }

    public static void main(String[] args) {
        InternalFrameDemo n = new InternalFrameDemo();
        n.setVisible(true);
        n.setSize(800, 800);
        n.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


}
