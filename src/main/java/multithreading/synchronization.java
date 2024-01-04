//Question
    //WAP to simulate Synchronization in multithreading.
//Answer
package multithreading;
class MyData{
    synchronized void display(String s) throws InterruptedException {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
    }
}

class MyThread extends Thread{
    MyData d;
    String s;
    MyThread(MyData d,String s){
        super(s);
        this.d=d;
        this.s=s;
    }

    @Override
    public void run() {
        try {
            this.d.display(s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class synchronization {
    public static void main(String[] args) {
        MyData ob=new MyData();
        MyThread t1=new MyThread(ob,"Hello World");
        MyThread t2=new MyThread(ob,"Welcome");

        t1.start();
        t2.start();
    }
}
