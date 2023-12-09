//Question
    //WAP of sum and factorial first n Natural Number digits.
//Answer 
package loops;
public class operationsOnSeries{
    public static int factorial(int n) {
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact*=i;
		}
		 return fact;
	}
    public static int sum(int n) {
		int fact=1;
		for (int i = 1; i <=n; i++) {
			fact=+i;
		}
		 return fact;
	}

    public static void main(String[] args) {
       factorial(5);
       sum(5);
    }
}