//Question
        //WAP to convert Bits into Bytes.
//Answer
package fundamentals;
import java.util.Scanner;
public class ConvertBitIntoBytes {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Number in Bits: ");
        long x=input.nextLong();
        System.out.printf("%d bits is %d Bytes and %d bits",x,x/8,x%8);
        input.close();
    }
}
