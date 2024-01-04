//Question
    //Show the use of threadId,getState,isDaemon,isAlive,setDaemon,sleep,yield,dumpStack,join method in Thread class.
//Answer
package multithreading;

import java.lang.Thread;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        int i = 1;
        Thread.dumpStack();
        while (i <= 50) {
            try {
                System.out.println("Thread run method "+i);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("***************************************************** The thread is giving a exception *****************************************************");
            }
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadClass ob = new ThreadClass();
        ob.setDaemon(true);

        System.out.println("isAlive " + ob.isAlive());
//      state Changed RUNNABLE
        ob.start();
        System.out.println("isAlive " + ob.isAlive());

        System.out.println("getState " + ob.getState());
        System.out.println("threadId " + ob.threadId());

//        Thread.yield();         //Used for given priority to the other running Thread for minimization of starvation problem.
        Thread.sleep(1000);
        System.out.println("isDaemon " + ob.isDaemon());

//        Thread.currentThread().join();            //join method waits for the other thread for complete there execution although the thread is demon.
        Thread.currentThread().join(10000);     //join can also wait for a particular time if the other thread work is not complete it terminates.
//        Thread.dumpStack();           //For printing the Stack trace of the thread
    }
}
