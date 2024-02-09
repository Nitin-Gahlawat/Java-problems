//Question 
    //WAP to show the use of the LinkedHashSet in java.
//Answer
package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // LinkedHashSet is implemented using linkedList.
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(Set.of("A", "B", "C", "D"));
        lhs.add("B");
        System.out.println(lhs);

    }
}
