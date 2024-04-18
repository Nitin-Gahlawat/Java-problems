//Question 
    //WAP to show the use of the Arrays wrapper class.
//Answer
package collection;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        Integer[] a = { 2, 4, 6, 8, 1, 3, 5, 7 };
        Integer[] b = { 2, 4, 6, 8, 1, 3, 5, 7 };

        Integer[] c = Arrays.copyOf(a, 4);
        System.out.println(Arrays.toString(c));

        Arrays.fill(c, 10);
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.compare(a, b));

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 3));

        Arrays.sort(b, (i, o) -> {
            if (i < o)
                return 1;
            if (i > 0)
                return -1;
            return 0;
        });
        System.out.println(Arrays.toString(b));

    }
}
