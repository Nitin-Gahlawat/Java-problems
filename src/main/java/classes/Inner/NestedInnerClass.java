//Question
	//WAP to show Nested inner class in java.
//Answer
package classes.inner;

class Outer{
	int x=10;
	class Inner{
		int y=20;
		void innerDisplay() {
			System.out.println("innerDisplay value of x "+x);
			System.out.println("innerDisplay value of y "+y);
		}
	}
	void outerDisplay() {
		System.out.println("Outer display value of x "+x);
		Inner i=new Inner();
		System.out.println("Outer display value of y using inner object "+i.y);
		i.innerDisplay();
	}
}
public class NestedInnerClass {
	public static void main(String[] args) {
		System.out.println("***************Using outer Display*************");
		Outer out=new Outer();
		out.outerDisplay();
		System.out.println("------------------------------------------------");
		System.out.println("***************Using inner Display**************");
		Outer.Inner i=out.new Inner();
		i.innerDisplay();
		System.out.println("------------------------------------------------");
	}
}
