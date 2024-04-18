//Question
	//WAP to show the overview of the lambda expression.
//Answer


package lambda;

@FunctionalInterface
interface Sun {
	public String temperature();
}

public class LambdaExpression {
	public static void main(String[] args) {
		Sun s = () -> {
			System.out.println("The Sun is very Hot");
			return "Above 100 Degrees";
		};
		System.out.println(s.temperature());
	}
}
