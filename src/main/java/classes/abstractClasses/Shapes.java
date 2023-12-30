//Question
	//WAP to show Example of Dynamic dispatch and Abstract class.
//Answer
package classes.abstractClasses;
abstract class Shape
{
	abstract double area();
	abstract double perimeter();
}
class CircleShape extends Shape{

	private final double radius;
	CircleShape(double r){
		radius=r;
	}
	@Override
	double area() {
		return Math.PI*radius*radius;
	}

	@Override
	double perimeter() {
		return 2*Math.PI*radius;
	}
	
}
class RectangleShape extends Shape{

	public RectangleShape(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}
	public RectangleShape(double length) {
		this.length = length;
		this.breath = 20;
	}

	private final double length;
	private final double breath;
	@Override
	double area() {
		return length*breath;
	}

	@Override
	double perimeter() {
		return 2*(length+breath);
	}
	
}
public class Shapes {
	public static void main(String[] args) {
		Shape ob=new CircleShape(45);
		System.out.println(ob.area());
		Shape obj=new RectangleShape(50.0);
		System.out.println(obj.area());
	}
}
