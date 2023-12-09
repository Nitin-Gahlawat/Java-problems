//Question 
    //WAP that display various Series like Arithmetic progression,Geometric progression,Fibonacci Series.
//Answer
package loops;

public class Series {
	static void arithmeticProgression(int a,int d,int n){
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\t",a);
			a=a+d;
		}
		System.out.print("\n");
	}
	static void geometricProgression(int a,int r,int n){
		for (int i = 0; i < n; i++) {
			System.out.printf("%d\t",a);
			a=a*r;
		}
		System.out.print("\n");
	}
	static void fibonacci(int n){
		int a=0,b=1,c;
		System.out.printf(a+"\t"+b+"\t");
		for (int i = 0; i < n-2; i++) {
			c=a+b;
			a=b;b=c;
			System.out.printf("%d\t",c);
		}
		System.out.print("\n");
	}
	
	
	public static void main(String[] args) {
		arithmeticProgression(1,10,5);
		geometricProgression(1,10,5);
		fibonacci(5);

	}
	
	
}
