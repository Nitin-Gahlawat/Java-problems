//Question 
    //WAP to show the traversal and methods of inbuilt ArrayList in java.
//Answer

//Arraylist traversal and methods
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(20);
        list1.add(20);
        list1.add(0, 5);
        ArrayList<Integer> al2 = new ArrayList<>(List.of(70, 30, 60, 50));

        System.out.println(list1);
        list1.addAll(1, al2);
        System.out.println(list1);

        System.out.println(list1.contains(70));
        list1.remove(list1.indexOf(70));
        System.out.println(list1.contains(70));

        System.out.println(list1);


        @SuppressWarnings("unchecked")
        ArrayList<Integer> list2 = (ArrayList<Integer>) list1.clone();
        System.out.println(list1.equals(list2));

        list1.clear();
        System.out.println(list1.isEmpty());

        System.out.println("***********************Elements using for loop***********************");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }

        System.out.println("\n***********************Elements using foreach loop***********************");
        for (Integer i : list2) {
            System.out.print(i + " ");
        }

        System.out.println("\n***********************Elements using for iterator***********************");
        for (Iterator<Integer> it = list2.iterator(); it.hasNext();) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\n********************Reverse Elements using List iterator*******************");
        ListIterator<Integer> i = list2.listIterator(list2.size());
        while (i.hasPrevious()) {
            Integer item = i.previous();
            System.out.print(item + " ");
        }

        System.out.println("\n********************Elements using functional opration***********************");
        list2.forEach((x) -> System.out.print(x + " "));

        System.out.println("\n**********Elements using Condtion via functional opration******************");
        list2.forEach(x -> show(x));

        System.out.println("\n" + list2);
        list2.sort((x, y) -> {
            if (x > y)
                return y;
            else
                return x;
        });
        System.out.println(list2);
    }

    static void show(int x) {
        if (x > 20)
            System.out.print(x + " ");
    }
}