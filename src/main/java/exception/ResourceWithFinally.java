//Question
	//Show the working and releasing of resource with the help of finally block.
//Answer
package exception;

import java.util.Scanner;

public class ResourceWithFinally {
	static Scanner sc;
	static void call() throws Exception {	//Exception goes to main
		try {
			sc=new Scanner(System.in);
			throw new Exception();
		}
		finally {
			System.out.println("Final message from call method");
			sc.close();			// the scanner object resource closing.
		}
	}
	public static void main(String[] args) throws Exception {	//Exception goes to JVM
		try {
			call();
		}
		finally {
			//	sc.next();	//<-not accessible as the resource is released in the above finally block.
			System.out.println("Main method Finally Called");
		}
	}
}
