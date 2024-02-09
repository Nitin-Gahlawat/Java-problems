//Question 
    //WAP to show the working and method of the Hashtable(legacy class) in java.
//Answer

package collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>(Map.of(1, " A", 2, "B", 3, "C", 4, "D", 5, "E"));
        ht.get(3);

        Enumeration<Integer> e = ht.keys();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }

        ht.compute(2, (v, m) -> m + v);
        
        ht.computeIfAbsent(7, (k) -> {
            return String.valueOf((char) (65 + k));
        });
        System.out.print("\n");
        
        ht.forEach((k, v) -> {
            System.out.print(k + " " + v + "\t");
        });

    }
}
