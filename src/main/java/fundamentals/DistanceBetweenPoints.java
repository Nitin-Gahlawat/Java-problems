//Question
    //WAP to input two points from the user and Display Distance between them.
//Answer
package fundamentals;
import java.util.Scanner;
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter X1 and Y1\t");
        float x1=input.nextFloat();
        float y1=input.nextFloat();
        System.out.print("Enter X2 and Y2\t");
        float x2=input.nextFloat();
        float y2=input.nextFloat();
        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The Distance between the points is "+distance);
        input.close();
    }
}
