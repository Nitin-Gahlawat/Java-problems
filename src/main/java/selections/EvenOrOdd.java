//Question 
    //WAP that display a number is odd or even.
//Answer
package selections;
import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=input.nextInt();
        if(n%2==0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is Odd");
            input.close();
    }
}