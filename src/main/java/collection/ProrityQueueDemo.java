//Question 
    //WAP to show use of the inbuilt ProrityQueue class.
//Answer

package collection;

import java.util.List;
import java.util.PriorityQueue;

public class ProrityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.addAll(List.of(3, 10, 5, 20, 15, 30));
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);

        System.out.println("***********PriorityQueue with Comparator************");
        PriorityQueue<Integer> pqcomp = new PriorityQueue<>((o1, o2) -> {
            return (o1 < o2 ? 1 : -1);
        });
        pqcomp.addAll(List.of(3, 10, 5, 20, 15, 30));
        System.out.println(pqcomp);
        pqcomp.remove();
        System.out.println(pqcomp);

    }
}
