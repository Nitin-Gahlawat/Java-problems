//Question
    //WAP to Input a number from the user and print its  Multiplication table.
//Answer
package loops;
import java.util.Scanner;
public class MultiTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of which you want to print the table");
        int x = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", x, i, i * x);
        }
        input.close();
    }
}
