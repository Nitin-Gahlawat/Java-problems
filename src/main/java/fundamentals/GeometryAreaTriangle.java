//Question 
    //WAP that prompts the user to enter three points of a triangle and display its area.
//Answer
package fundamentals;
import java.util.Scanner;
public class GeometryAreaTriangle {
    static double calcluateSideLength(double x1, double y1, double x2, double y2) {
        return Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);
    }
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x1 and y1");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        System.out.println("Enter x2 and y2");
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        System.out.println("Enter x3 and y3");
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        double side1 = calcluateSideLength(x1, y1, x2, y2);
        double side2 = calcluateSideLength(x2, y2, x3, y3);
        double side3 = calcluateSideLength(x3, y3, x1, y1);
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
        System.out.println("The area of triangle is " + (float) area);
        input.close();
    }
}