//Question
    //WAP to Calculate the simple interest based on the Values Input Given By the User.
//Answer
package fundamentals;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the Principle Amount");
        int principleAmount=input.nextInt();

        System.out.println("Enter the Rate of Interest");
        int rate=input.nextInt();

        System.out.println("Enter the Time Duration");
        int time=input.nextInt();

        //int * int * might exceed the limit of the integer
        double simpleInterest= principleAmount *(rate /100.0)*time;

        System.out.println("The Simple Interest for is "+simpleInterest);
        System.out.println("The Amount after Interest is "+(simpleInterest+principleAmount));
        input.close();
    }
}
