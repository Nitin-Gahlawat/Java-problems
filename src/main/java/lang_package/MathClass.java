//Question
	//Show the various Method of the Math Class in Java.
//Answer
package lang_package;

import java.lang.Math;

public class MathClass {
	public static void main(String[] args) {
		System.out.println("Absolute value of -125 :-" + Math.abs(-125));
		
		System.out.println("Cube root of 27 :-" + Math.cbrt(27));
		
		System.out.println("Random number between 0 and 1 :-" + Math.random());
		
		System.out.println("Maximum between 45.2,45.3 :-" + Math.max(45.2, 45.3));
		System.out.println("Minimum between 12,56.3 :-" + Math.min(12, 56.3));
		
		System.out.println("45 Degrees to Radians :-" + Math.toRadians(45));
		System.out.println("45 Radians to Degrees :-" + Math.toDegrees(45));
		
		System.out.println("2 to the Power 4 is :-" + Math.pow(2, 4));

		System.out.println("floor division of 10 and 7 :-" + Math.floorDiv(10, 7));

		System.out.println("e^1 :-" + Math.exp(1));
		System.out.println("log(10)base 10 :-" + Math.log10(10));

		System.out.println("decrementExact throws exception if under flow :-" + Math.decrementExact(45));
		System.out.println("multiplyExact throws exception if over flow :-" + Math.multiplyExact(4, 450));

		System.out.println("tan of radian 45 :-" + Math.tan(Math.toRadians(45)));
		System.out.println("atan of radian 45 :-" + Math.atan(Math.toRadians(45)));
		System.out.println("tanh of 20 :-" + Math.tanh(20));

	}
}
