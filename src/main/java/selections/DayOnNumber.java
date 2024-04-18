//Question 
    //WAP that prompts the user to enter a number and then display the week Day Accordingly.
//Answer

package selections;

import java.util.Scanner;

public class DayOnNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number(1-7) ");
        int n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;    
            default:
                System.out.println("Invalid value");
                break;
        }
        input.close();
    }
}
