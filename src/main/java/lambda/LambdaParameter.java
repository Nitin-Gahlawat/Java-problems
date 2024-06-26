//Question
	//Show the parameter passing to the Lambada Expression.
//Answer

package lambda;

@FunctionalInterface
interface Calculator {
	int add(int a, int b);
}

public class LambdaParameter {
	public static void main(String[] args) {
		Calculator c = (a, b) -> a + b;
		System.out.println(c.add(5, 6));
	}
}
