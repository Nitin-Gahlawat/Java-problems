//Question
    //Implement Producer and Consumer using threads in java.
//Answer
package multithreading;
class Data {
    int value;
    Boolean flag=true;
    synchronized void set(int v) {
        if(flag!=true) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        value = v;
        flag=false;
        notify();
    }

    synchronized int get() {
        if(flag!=false) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int x = value;
        flag=true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    Data d;

    Producer(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        int i = 0;
        while (i!=50) {
            d.set(i);
            System.out.println("Producer " + (i++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Producer end");
    }
}

class Consumer extends Thread {
    Data d;

    Consumer(Data d) {
        this.d = d;
    }

    @Override
    public void run() {
        int val=0;
        while (val!=50) {
            val = d.get();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumer " + val + "************************");
        }
        System.out.println("Consumer end");
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Data d = new Data();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);
        p.start();
        c.start();
    }
}
