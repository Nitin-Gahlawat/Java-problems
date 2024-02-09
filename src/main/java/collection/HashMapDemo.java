//Question 
    //WAP to show the use of the Hashmap(for storing Key,Value pair) in java.
//Answer
package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> tm = new HashMap<>(Map.of(1, "A", 2, "B", 3, "C", 4, "D"));

        System.out.println("************Set<Map.Entry<Integer,String>>******************");

        Set<Map.Entry<Integer, String>> ob = tm.entrySet();
        ob.forEach((x) -> {
            System.out.println(x.getKey() + " " + x.getValue());
        });
        System.out.println("**********************ForEach***********************");

        tm.forEach((x, y) -> {
            System.out.println(x + " " + y);
        });

    }
}
