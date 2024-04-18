//Question 
    //Write a menu-driven program for performing Arithmetic Operations.
//Answer
package selections;

import java.util.Scanner;

public class ArithmeticMenuDriven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number A\t");
        int A = input.nextInt();
        System.out.print("Enter number B\t");
        int B = input.nextInt();
        System.out.println("Enter the operation \n1.ADD \n2.SUB \n3.MUL \n4.DIV\t");
        System.out.println("Enter your choice");
        String op = input.next().toUpperCase();
        switch (op) {
            case "ADD":
                System.out.println(A + B);
                break;
            case "SUB":
                System.out.println(A - B);
                break;
            case "MUL":
                System.out.println(A * B);
                break;
            case "DIV":

                try {
                    System.out.println(A / B);
                    
                } catch (ArithmeticException e) {
                   System.out.println("Enter a valid number for dividing");
                }
                break;
            default:
                System.out.println("Enter a valid statement");
                break;
        }
        input.close();
    }
}
