//Question 
    //WAP to show various Bitwise method using BitSet class.
//Answer
package collection;

import java.util.BitSet;

public class BitSetDemo {
    public static void main(String[] args) {
        BitSet b1 = new BitSet();

        //Setting the even number of bits.
        for (int i = 0; i < 8; i++) {
            if (i % 2 != 0)
                b1.set(i);
        }

        System.out.println(b1.get(0));

        BitSet b2 = new BitSet();

        //Setting the odd number of bits.
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0)
                b2.set(i);
        }

        // or
        b1.or(b2);
        System.out.println(b1);

        // and
        b1.and(b2);
        System.out.println(b1);

        // xor
        b1.xor(b2);
        System.out.println(b1);

        // not
        b1.flip(0, 8);
        System.out.println(b1);
    }
}
