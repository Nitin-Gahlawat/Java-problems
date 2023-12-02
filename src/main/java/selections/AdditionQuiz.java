//Question
    //WAP to make a quiz using two random numbers.
//Answer
package selections;
import java.util.Scanner;
public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (Math.random() * 10);
        Scanner sc = new Scanner(System.in);
        System.out.println("What is " + number1 + "+" + number2 + " ?");
        int answer = sc.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        sc.close();
    }
}