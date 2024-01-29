//Question
	//Show the scope of the Variable in the Lambda expression in java.
//Answer
package lambda;

@FunctionalInterface
interface one {
	public void display();
}

public class VariableScoping {
	int instance = 1000;

	// Method accepting Lambda expression
	void meth1(one lmb) {
		lmb.display();

		int ct = 0; // final or effectively final
		one obj = () -> {
			int x = 200;
			System.out.println("Hello world " + instance + " " + x + " " + ct);
		};
		obj.display();

		// ct++; //Error
	}

	public static void main(String[] args) {
		VariableScoping eg = new VariableScoping();
		eg.meth1(() -> {
			System.out.println("Good");
		});
	}
}
