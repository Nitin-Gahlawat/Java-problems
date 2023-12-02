//Question
    //WAP to generate a random number and make a guessing quiz using that number.
//Answer
package loops;
import java.util.Scanner;
class GuessNumber {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner obj = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Enter a number between 1-100");
            guess = obj.nextInt();
            if (guess == number)
                System.out.println("YES,the number is " + guess);
            else if (number < guess)
                System.out.println("Your guess is too high");
            else
                System.out.println("your guess is too low");
        } while (number != guess);

        obj.close();
    }
}