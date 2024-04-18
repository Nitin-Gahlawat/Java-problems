//Question 
    //WAP to show methods of the LinkedHashMap in java.
//Answer

package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(5, 0.75f, true);
        lhm.putAll(Map.of(1, "A", 2, "B", 3, "C", 4, "D", 5, "E"));

        // Accessing the elements to change the ordering of the elements
        lhm.get(2);
        lhm.get(4);
        lhm.get(1);

        System.out.println(lhm);


        //remove the element if the element count is greater than 3.
        LinkedHashMap<Integer, Integer> lhm2 = new LinkedHashMap<Integer, Integer>(5, 0.80f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {
                return size() > 3;
            }
        };

        lhm2.putAll(Map.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5));
        System.out.println(lhm2);

    }
}
