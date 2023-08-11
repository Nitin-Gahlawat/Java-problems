//Question
    //WAP to display the sales tax with two digits after decimal point
//Answer
import java.util.Scanner;
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Purchase amount");
        double parchaseamount=input.nextDouble();
        double tax=parchaseamount*0.06;
        System.out.println("Salse tax is $"+(int)(tax*100)/100.0);  //important
        input.close();
    }
}
