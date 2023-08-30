//Question
    //WAP to compute the monthly payment and total payment of a loan.
//Anaswer
import java.util.Scanner;
public class ComputeLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the interest rate");

        double annualInterestRate = input.nextDouble();

        double monthlyIntrestRate = annualInterestRate / 1200;

        System.out.println("enter the time in the integer");

        int numberOfYears = input.nextInt();

        System.out.println("enter the loan amount");

        double loanAmount = input.nextDouble();

        double monthlyPayment = loanAmount * monthlyIntrestRate
                / (1 - (1 / Math.pow(1 + monthlyIntrestRate, numberOfYears * 12)));

        double totalPayment = monthlyPayment * numberOfYears * 12;
        System.out.println("the monthly pay is $" + (int)(monthlyPayment*100)/100.0);

        System.out.println("the total payment is $" + (int) (totalPayment * 100) / 100.0);
        input.close();
    }
}
