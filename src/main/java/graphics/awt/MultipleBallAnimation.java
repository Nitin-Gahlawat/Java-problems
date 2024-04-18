//Question 
    //Create a Multiple bouncing ball Animation in java.awt.
//Answer
package graphics.awt;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.ArrayList;

public class MultipleBallAnimation extends Frame implements Runnable {
    int n=4;
    ArrayList<Integer> xList=new ArrayList<>();
    ArrayList<Integer> yList=new ArrayList<>();
    ArrayList<Integer> txlist = new ArrayList<>();
    ArrayList<Integer> tylist = new ArrayList<>();
    ArrayList<Integer> ballsize=new ArrayList<>();
    Random r=new Random();
    Thread t=new Thread(this);

    MultipleBallAnimation() {
        super("Animation");
        for (int i = 0; i < n; i++) {
            ballsize.add(r.nextInt(30,80));
            xList.add(r.nextInt(0,450));
            yList.add(r.nextInt(20,550));
            if(r.nextBoolean())
                txlist.add(1);
            else
                txlist.add(-1);
            if(r.nextBoolean())
                tylist.add(-1);
            else
                tylist.add(1);
        }
        setBackground(Color.BLACK);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        t.start();
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            if(i>n-1){
                i=0;
            }
            xList.set(i,xList.get(i) + txlist.get(i));
            yList.set(i,yList.get(i) + tylist.get(i));
            if (xList.get(i) > 450 || xList.get(i) < 0) {
                txlist.set(i, txlist.get(i) * (-1));
            }
            if (yList.get(i) > 550 || yList.get(i) < 20) {
                tylist.set(i, tylist.get(i) * (-1));
            }
            repaint();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        for (int i = 0; i < n; i++) {
            g.fillOval(xList.get(i),yList.get(i),ballsize.get(i),ballsize.get(i));
            
        }

    }

    public static void main(String[] args) {
        MultipleBallAnimation c = new MultipleBallAnimation();
        c.setVisible(true);
        c.setLayout(new FlowLayout());
        c.setSize(500, 600);

    }

}
