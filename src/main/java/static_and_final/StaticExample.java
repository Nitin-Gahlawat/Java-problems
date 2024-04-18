//Question
	//WAP to show the properties and Scope of static keyword in java.
//Answer
package static_and_final;
class Example {
	static String str = "hello world";
	String abc = "Java programing";

	void nonStaticMethod() {
		System.out.println("************Call `from nonStaticMethod **********");
		System.out.println(str);
		System.out.println(abc);
	}

	static void staticMethod() {
		System.out.println("************* Call from staticMethod ***********");
		System.out.println(str);
//		System.out.println(abc);	//<--Error
	}
}

public class StaticExample {
	public static void main(String[] args) {
		System.out.println("Calling a static member: "+Example.str);
		Example obj = new Example();
		obj.nonStaticMethod();
		//Static members only one copy is maintained.

		obj.nonStaticMethod();
		obj.str="Python programing";		//<-value changed of String str.
		
		Example obj1 = new Example();
		obj1.nonStaticMethod();
		obj1.nonStaticMethod();				//<-Reflected in another object.

		//Hence, Static members are called with the help of the class name.
		//Example.staticMethod();
		//Example.str
		System.out.println("Calling a static member: "+Example.str);
	}
	
}
