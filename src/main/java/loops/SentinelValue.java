//Question
    //WAP to show the use of sentinel value in a loop.
//Answer
package loops;
import java.util.Scanner;
public class SentinelValue {
    public static void main(String[] args) {
        int sum=0,val=10,ct=0;
        System.out.println("(The input ends if it is 0:)");
        Scanner input=new Scanner(System.in);
        while (val>0) {
            ct++;
            System.out.println("Enter the "+ct+" Value:");
            val=input.nextInt();
            sum+=val;
        }
        System.out.println("The sum is "+sum);
        input.close();
    }
}
