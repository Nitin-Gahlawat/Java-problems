//Question
    //Show the use of getPriority,currentThread,setPriority,getName,setName,interrupt,isInterrupted,sleep,start,run using Runnable interface.
//Answer
package multithreading;

import java.lang.Runnable;

class RunnableInterface implements Runnable {

    @Override
    public void run() {
        int i = 1;
        while (i <= 50) {
            try {
                System.out.println("Thread run method " + i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("***************************************************** The thread is giving a exception *****************************************************");
            }
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread ob = new Thread(new RunnableInterface());
        ob.start();
        ob.setName("New Thread 1");
        ob.setPriority(Thread.MIN_PRIORITY);

        Thread mainThread = Thread.currentThread();
        mainThread.setPriority(Thread.MAX_PRIORITY);


        for (int i = 0; i < 2; i++) {
            Thread.sleep((int)(Math.random()*1000));
            ob.interrupt();
            System.out.println("isInterrupted " + ob.isInterrupted());
        }

        System.out.println("isInterrupted " + ob.isInterrupted());
        System.out.println("Main Thread name " + mainThread.getName());
        System.out.println("getName " + ob.getName());
        System.out.println("mainThread Priority " + mainThread.getPriority());
        System.out.println("runThread Priority " + ob.getPriority());


    }
}
