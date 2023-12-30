//Question
    //WAP to show Example of Classes and Objects in java using Circle Class.
//Answer
package classes;

class CircleClass{
	private double radius;
    public CircleClass(double radius) {
		this.radius = radius;
	}
    public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area(){
        return Math.PI*radius*radius;
    }
	public double perimeter(){
        return 2*Math.PI*radius;
    }
	public double circumference(){
        return perimeter();
    }
}
public class Circle{
    public static void main(String[] args) {
        CircleClass c1=new CircleClass(7);
        System.out.println("Area c1 "+c1.area());
        System.out.println("perimeter c1 "+c1.perimeter());
        System.out.println("circumference c1 "+c1.circumference());

        CircleClass c2=new CircleClass(14);
        System.out.println("Area c2 "+c2.area());
        System.out.println("perimeter c2 "+c2.perimeter());
        System.out.println("circumference c2 "+c2.circumference());
    }
}