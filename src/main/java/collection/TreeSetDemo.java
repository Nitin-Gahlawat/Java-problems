//Question 
    //WAP to show the use of the inbuilt TreeSet in java.
//Answer

package collection;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>(List.of(5, 2, 2, 1, 5, 3, 8));

        System.out.println(ts.higher(5));
        System.out.println(ts.ceiling(5));

        System.out.println(ts.lower(2));
        System.out.println(ts.floor(2));

        System.out.println(ts);
        Iterator<Integer> it = ts.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.print("\n");

    }
}
