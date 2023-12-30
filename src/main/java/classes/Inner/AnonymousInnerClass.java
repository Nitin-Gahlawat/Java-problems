//Question
    //WAP to show Anonymous inner Class in java.
//Answer
package classes.Inner;
interface One {
    void display();

    void greet();

    default void Php_hello() {
        System.out.println("Hello world from Php");
    }
}


/*
abstract class One{
	abstract void display();
	abstract void greet();
	void Php_hello() {
		System.out.println("Hello world from Php");
	}
}
*/

public class AnonymousInnerClass {
    public static void main(String[] args) {
//        Anonymous inner Class
        One a = new One() {
            @Override
            public void display() {
                System.out.println("hello world");
            }

            @Override
            public void greet() {
                System.out.println("Nice to see you");
            }
        };
        a.Php_hello();
        a.greet();
    }
}
