//Question
    //WAP to find Exponent of m^n using recursion.
//Answer
package method.recursion;

public class Exponent {
	
	static int ExponentRecursion(int m,int n) {
		if(n==0)
			return 1;
		return m*ExponentRecursion(m,n-1);
	}
	
	static int EfficientExponent(int m,int n) {
		if(n==0)
			return 1;
		if(n%2!=0)
			return m*EfficientExponent(m*m,(n-1)/2);
		else 
			return EfficientExponent(m*m,n/2);
	}
	
	public static void main(String[] args) {
		System.out.println(ExponentRecursion(2, 9));
		System.out.println(EfficientExponent(2,9));
	}
}
