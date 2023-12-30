//Question
	//WAP to show Example of Dynamic dispatch and Inheritance in java.
//Answer
package classes;

class RectangleSuper{
	double length;
	double breath;
	RectangleSuper() {
		length=breath=1;
	}
	RectangleSuper(double length,double breath) {
		this.length=length;
		this.breath=breath;
	}
	double rectangleArea() {
		return length*breath;
	}
}
class CuboidSub extends RectangleSuper{
	double height;
	CuboidSub(){
		this.height=1;
	}
	CuboidSub(double l,double b,double h){
		super(l,b);
		this.height=h;
	}
	double volume() {
		return length*breath*height;
	}
}
public class MoreDimension {
	public static void main(String[] args) {
		CuboidSub ob=new CuboidSub(4,5,6);	
		System.out.println(ob.rectangleArea());	
		/*
		 * Dynamic dispatch
		 * *************************
		 * Base Class Reference holding a subclass Object in java
		 * and Can call Only Base Class And Override method.
		 */
		RectangleSuper object=new CuboidSub(4,5,6);	
		System.out.println(object.rectangleArea());
//		System.out.println(object.volume());	/*****Error*****/
		
	}
	
}
