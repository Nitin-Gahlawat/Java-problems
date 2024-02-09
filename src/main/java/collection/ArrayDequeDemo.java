//Question 
    //WAP to show the Array Deque(Double Ended Queue) use as a Stack and Queue in java.
//Answer

package collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>(10);

        // Stack -->inserting at the top and deleting from the top

        System.out.println("\n*****************Stack******************");

        dq.push(50);
        dq.push(600);
        dq.push(690);

        System.out.println("Inserted elements(from the LHS) " + dq);
        System.out.print("Removing the element (Form the LHS) ");

        while (dq.peek() != null) {
            System.out.print(dq.pop() + " ");
        }

        // Queue -->Inserting at the rare view and deleting from the front end

        System.out.println("\n*****************Queue******************");
        dq.addLast(56);
        dq.addLast(60);
        dq.addLast(80);

        System.out.println("Inserted elements(From the RHS) " + dq);
        System.out.print("Removing the element (Form the LHS) ");
        
        while (dq.peek() != null) {
            System.out.print(dq.remove() + " ");
        }

    }
}