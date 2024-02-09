//Question 
    //WAP to show the use of the inbuilt TreeMap in java.
//Answer
package collection;

import java.util.Collection;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>(Map.of(1,"A",2,"B",3,"C",4,"D"));
        tm.put(6,"F");
        tm.put(7,"G");
            
        System.out.println(tm);

        Map.Entry<Integer,String> me=tm.ceilingEntry(5);
        System.out.println(me.getKey()+" "+me.getValue());

        
        tm.forEach((x,y)->{
            System.out.println(x+" "+y);
        });

        //Print the value of a map using the forEach
        NavigableSet<Integer> ns=tm.descendingKeySet();
        for (Integer nsval : ns) {
            System.out.print("("+nsval+","+tm.get(nsval)+")");
        }
        System.out.print("\n");
        
        Collection<String> c=tm.values();
        System.out.println(c);


    }
}
