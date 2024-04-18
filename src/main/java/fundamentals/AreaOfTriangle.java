//Question 
    //WAP that prompts the user to enter Base and Height of a triangle and display its Area.
//Answer

package fundamentals;
import java.util.*;
public class AreaOfTriangle {
	static double area(double height,double base) {
        double area=height*base*0.5;
        return area;
	}
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the height of the triangle:=");
        double height=obj.nextDouble();
        System.out.println("Enter the base of the triangle:=");
        double base=obj.nextDouble();
        obj.close();
        System.out.println("The area of the triangle is "+AreaOfTriangle.area(height,base));
    }
}
