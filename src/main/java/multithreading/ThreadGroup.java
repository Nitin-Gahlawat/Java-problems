//Question
    //Show the use of getParent,getName,activeCount,getMaxPriority,setMaxPriority,sleep in ThreadGroup class.
//Answer
package multithreading;

import java.lang.Thread;
import java.lang.Runnable;

public class ThreadGroup {
    static int ct = 0;
    static int threadCt = 0;

    static java.lang.ThreadGroup createThread(java.lang.ThreadGroup ob, int num, Runnable obj) {
        java.lang.ThreadGroup group;
        if (ob == null) {
            group = new java.lang.ThreadGroup(("Group " + ct++));
        } else {
            group = new java.lang.ThreadGroup(ob, "Group " + ct++);
        }
        Thread[] objArr = new Thread[num];
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = new Thread(group, obj, "Thread " + threadCt++);
            objArr[i].start();
        }
        return group;
    }

    public static void main(String[] args) {
        Runnable obj = new Runnable() {
            @Override
            public void run() {
                int i = 500;
                while (i <= 1000) {
                    try {
                        Thread.sleep(100);
                        if (i % 100 == 0)
                            System.out.println(i);
                    } catch (InterruptedException e) {
                        System.out.print("The thread is giving a exception");
                    }
                    i++;
                }
            }
        };

        java.lang.ThreadGroup groupParent = createThread(null, 2, obj);
        java.lang.ThreadGroup group = createThread(groupParent, 4, obj);
        group.setMaxPriority(8);

        System.out.println("activeCount " + group.activeCount());
        System.out.println("group name" + group.getName());
        System.out.println("group Parent name " + group.getParent().getName());
        System.out.println("getMaxPriority " + group.getMaxPriority());
    }
}
