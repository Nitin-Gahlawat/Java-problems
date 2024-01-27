//Question
    //Show the various operation on Integer data with Integer Wrapper Class.
//Answer
package lang_package;

import java.lang.Integer;

public class IntegerClass {
    public static void main(String[] args) {
        int i = 10; // primitive type of variable

        Integer x = Integer.valueOf(i); // Boxing
        System.out.println("Boxing " + x);

        Integer m = i; // Auto Boxing
        System.out.println("Auto Boxing " + m);

        int k = x.intValue(); // Unboxing
        System.out.println("Unboxing " + k);

        int j = x; // Auto unboxing
        System.out.println("Auto unboxing " + j);

        System.out.println(Integer.toBinaryString(i));

        System.out.println(Integer.decode("-10"));

        System.out.println(Integer.rotateLeft(i, 4));

    }
}
