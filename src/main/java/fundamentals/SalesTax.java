//Question
    //WAP to display the sales tax with two digits after decimal point.
//Answer
package fundamentals;
import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Purchase amount");
        double purchaseamount=input.nextDouble();
        double tax=purchaseamount*0.06;
        System.out.println("Sale tax is $"+(int)(tax*100)/100.0);  //important
        input.close();
    }
}
