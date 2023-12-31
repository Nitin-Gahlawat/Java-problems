//Question
	//Show the working and releasing of resource with the help of try block.
//Answer
package exception;

import java.util.Scanner;

public class ResourceWithTry {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Call from try block");
            throw new ArithmeticException();
            //The resource will automatically close ->sc.close() as the try block closes
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}