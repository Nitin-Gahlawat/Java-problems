//Question
	//Show the parameter passing to the Lambada Expression.
//Answer

package lambda;

@FunctionalInterface
interface Calculater {
	int add(int a, int b);
}

public class LambdaParameter {
	public static void main(String[] args) {
		Calculater c = (a, b) -> a + b;
		System.out.println(c.add(5, 6));
	}
}
