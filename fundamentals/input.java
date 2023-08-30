//Question
    //Console input form the user.
//Answer
import java.util.*;
class Input {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in); // Scanner class object
        // int a=ob.nextInt(); //for integer value
        // float a=ob.nextFloat();
        // double a=ob.nextDouble();
        // Byte a=ob.nextByte();
        // Short a=ob.nextShort();
        // long a=ob.nextLong();
        // String a=ob.next(); //for inputing a single word
        String a = ob.nextLine(); // for inputing a sentence
        System.out.println(a);
        ob.close();
    }
}