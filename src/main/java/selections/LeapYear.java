//Question
    //WAP to Determine weather the year is a leap year or not.
//Answer
package selections;
import javax.swing.JOptionPane;
public class LeapYear {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year to check"));
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            JOptionPane.showMessageDialog(null, "The Year " + year + " is a leap year");
        } else
            JOptionPane.showMessageDialog(null, "The Year " + year + " is a not leap year");
    }
}
