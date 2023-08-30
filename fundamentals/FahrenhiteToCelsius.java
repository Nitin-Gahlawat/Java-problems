//Question 
    //Convert Fahrenhite To Celsius and Celsius To Fahrenhite.
//Answer
import java.io.*;

public class FahrenhiteToCelsius {
    public static void main(String[] args) throws IOException {
        // BufferedReader for input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 1 for Fahrenhite to Celsius OR Enter 2 for Celsius to Fahrenhite OR 3 for exit  ");

        System.out.println("Enter your choice");
        int input = Integer.parseInt(br.readLine());

        //for inputing at least one value out of 1,2,3
        while (input != 1 && input != 2 && input != 3) {
            System.out.println("Try again::");
            input = Integer.parseInt(br.readLine());
        }

        //if input value is 1
        if (input == 1) {
            System.out.print("Enter Fahrenhite value ");
            double Fahrenhite = Double.parseDouble(br.readLine());
            double Celsius = (5.0 / 9) * (Fahrenhite - 32);
            System.out.println("Fahrenhite " + Fahrenhite + " is " + Celsius + " in Celsius ");
        } 
        //if input value is 2
        else if (input == 2) {
            System.out.print("Enter Celsius value ");
            double Celsius = Double.parseDouble(br.readLine());
            double Fahrenhite = (Celsius * (9 / 5.0) + 32);
            System.out.printf("Celsius %f is %f in Fahrenhite", Celsius, Fahrenhite);
        } 
        //if input value is 3
        else {
            System.exit(0);
        }
    }
}
