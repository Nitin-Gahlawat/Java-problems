//Question
    //Calculate the BMI of a person using the formula BMI=(weight)/(height^2)
//Answer
import java.util.Scanner;
public class ComputeBmi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the height in Inches");
        double height=input.nextDouble()*0.0257;    //converting to meters
        System.out.println("Enter the weight in Pounds");
        double weight=input.nextDouble()*0.45359237;    //converting to pounds
        double bmi=weight/Math.pow(height, 2);
        System.out.println("The BMI of Of the person is "+bmi);
        input.close();
    }
}
