//Question 
    //Convert Fahrenheit To Celsius and Celsius To Fahrenheit.
//Answer
package selections;
import java.io.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) throws IOException {
        // BufferedReader for input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1 for Fahrenheit to Celsius OR Enter 2 for Celsius to Fahrenheit OR 3 for exit  ");

        System.out.println("Enter your choice");
        int input = Integer.parseInt(br.readLine());

        //for inputting at least one value out of 1,2,3
        if (input != 1 && input != 2 && input != 3) {
            System.out.println("Wrong Input");
        }

        //if input value is 1
        if (input == 1) {
            System.out.print("Enter Fahrenheit value ");
            double Fahrenheit = Double.parseDouble(br.readLine());
            double Celsius = (5.0 / 9) * (Fahrenheit - 32);
            System.out.println("Fahrenheit " + Fahrenheit + " is " + Celsius + " in Celsius ");
        } 
        //if input value is 2
        else if (input == 2) {
            System.out.print("Enter Celsius value ");
            double Celsius = Double.parseDouble(br.readLine());
            double Fahrenheit = (Celsius * (9 / 5.0) + 32);
            System.out.printf("Celsius %f is %f in Fahrenheit", Celsius, Fahrenheit);
        } 
        //if input value is 3
        else {
            System.exit(0);
        }
    }
}
