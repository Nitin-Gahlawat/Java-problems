//Question 
    //WAP that Display the radix of the inputted number.
//Answer
package selections;

import java.util.Scanner;

public class RadixOfNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        String n=input.next();
        if(n.matches("[01]+"))
            System.out.println("Binary");
        else if (n.matches("[0-7]+"))
            System.out.println("Octal");
        else if(n.matches("[0-9]+"))
            System.out.println("Decimal");
        else if(n.matches("[0-9A-Fa-f]+"))
            System.out.println("HexDecimal");
        else
            System.out.println("Invalid number");
        input.close();
    }
}
