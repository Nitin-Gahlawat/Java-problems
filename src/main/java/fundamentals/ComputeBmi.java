//Question
    //Calculate the BMI of a person using the formula BMI=(weight)/(height^2).
//Answer
package fundamentals;
import java.util.Scanner;
public class ComputeBmi {
	static double bmi(double height,double weight) {
        double bmi=weight/Math.pow(height, 2);
        return bmi;
	}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the height in Inches");
        double height=input.nextDouble()*0.0257;    //converting to meters
        System.out.println("Enter the weight in Pounds");
        double weight=input.nextDouble()*0.453592;    //converting to Kg
        System.out.println("The BMI of Of the person is "+ComputeBmi.bmi(height, weight));
        input.close();
    }
}
