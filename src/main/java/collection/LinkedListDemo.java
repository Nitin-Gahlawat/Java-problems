//Question 
    //WAP to show the use of the LinkedList in java.
//Answer

package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList <Integer> ll=new LinkedList<>();
        ll.addAll(List.of(70,650,54,20,01));
        ll.add(70);
        ll.addLast(140);

        System.out.println(ll);
        
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());


        System.out.println("********************Elements using for descending iterator********************");

        for(Iterator<Integer>it=ll.descendingIterator();it.hasNext();){
            System.out.print(it.next()+" ");
        }

    }
}
