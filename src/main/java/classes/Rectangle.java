//Question
	//WAP to show Example of Classes and Objects in java using Rectangle Class.
//Answer
package classes;

class RectangleClass {
	private double length;
	private double breath;
	public RectangleClass() {
		this.breath = 1;
		this.length=1;
	}
    public RectangleClass(double length, double breath) {
		this.length = length;
		this.breath = breath;
	}

    public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	double area(){
        return length*breath;
    }
    double perimeter() {
        return 2*(length+breath);
    }
    boolean isSquare() {
        return this.length == this.breath;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        RectangleClass r1=new RectangleClass(20.5,300);
        System.out.println("area  r1 "+r1.area());
        System.out.println("perimeter r1 "+r1.perimeter());


        RectangleClass r2=new RectangleClass();
        r2.setLength(10);
        r2.setBreath(50.256);
        System.out.println("area  r2 "+r2.area());
        System.out.println("perimeter r2 "+r2.perimeter());
    }
}
