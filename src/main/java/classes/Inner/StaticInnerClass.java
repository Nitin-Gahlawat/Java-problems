//Question
//WAP to show Static inner Class in java.
//Answer
package classes.Inner;
class OutClass{
	static String php="Hello form Php";
	String java="Hello from Java";
	static class Inner{
		int x=200;
		void display() {
			System.out.println(php);
		}
	}	
}
public class StaticInnerClass {
	public static void main(String[] args) {
		OutClass.Inner ob=new OutClass.Inner();
		System.out.println(ob.x);
	}
}
