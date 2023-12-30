//Question
    //WAP to show Example of Classes and Objects in java using Cylinder Class.
//Answer
package classes;

import java.util.Scanner;

class CylinderClass {
    private double height;
    private double radius;

    public CylinderClass(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public CylinderClass() {
        this.radius = 1;
        this.height = 1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double lidArea() {
        return Math.PI * radius * radius;
    }

    double totalSurfaceArea() {
        return height * lidPerimeter() + 2 * lidArea();
    }

    double lidPerimeter() {
        return 2 * Math.PI * radius;
    }

    double Volume() {
        return Math.PI * radius * radius * height;
    }

}

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("********Enter the radius and height of the cylinder******");
        CylinderClass ob1 = new CylinderClass(sc.nextDouble(), sc.nextInt());
        System.out.println("Total Surface Area ob1 " + ob1.totalSurfaceArea());
        System.out.println("Volume " + ob1.Volume());
        System.out.println("lid perimeter " + ob1.lidArea());
        System.out.println("lid area " + ob1.lidPerimeter());

        System.out.println("**********calling the default constructor************");
        CylinderClass ob2 = new CylinderClass();
        System.out.println("Total Surface Area ob2 " + ob2.totalSurfaceArea());
        System.out.println("Volume " + ob2.Volume());
        System.out.println("lid perimeter " + ob2.lidArea());
        System.out.println("lid area " + ob2.lidPerimeter());
        sc.close();
    }
}
