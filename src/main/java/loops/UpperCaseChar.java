//Question
    //WAP to accept ascii of a Character print its Lowercase and equivalent Uppercase Character.
//Answer
package loops;
import java.util.Scanner;
public class UpperCaseChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        do {
            System.out.print("Enter the ASCII code (Within the range of 97-122)\t");
            x = input.nextInt();
        }while (!(x>=97 && x<=122));
        System.out.println("The Lowercase character  is\t"+((char)x));
        System.out.println("The Uppercase equivalent is\t"+((char)(x-32)));
        input.close();
    }
}
