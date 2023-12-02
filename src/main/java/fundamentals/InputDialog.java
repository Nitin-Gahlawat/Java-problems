//Question 
    //Implement ComputeLoan(compute the monthly payment and total payment of a loan) program using GUI.
//Answer
package fundamentals;
import javax.swing.JOptionPane;
public class InputDialog {
    public static void main(String[] args) {

        double annualInterestRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the interest rate"));

        double monthlyInterestRate = annualInterestRate / 1200;

        int numberOfYears = Integer.parseInt(JOptionPane.showInputDialog("Enter the Time in the integer"));

        double loanAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter the loan amount"));

        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        double totalPayment = monthlyPayment * numberOfYears * 12;
        String output = ("The Monthly Pay is $" + (int) (monthlyPayment * 100) / 100.0)+ ("\nThe Total Payment is $" + (int) (totalPayment * 100) / 100.0);
        JOptionPane.showMessageDialog(null, output);
    }
}
