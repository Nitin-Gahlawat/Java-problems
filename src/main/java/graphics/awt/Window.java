//Question 
    //WAP to Show Window Events in java.
//Answer
package graphics.awt;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Window extends Frame implements WindowListener{
    Window() {
        super("Window");
        addWindowListener(this);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }

    public static void main(String[] args) {
        Window cd = new Window();
        cd.setVisible(true);
        cd.setSize(450, 450);
        cd.setLayout(new FlowLayout());
    }
}
