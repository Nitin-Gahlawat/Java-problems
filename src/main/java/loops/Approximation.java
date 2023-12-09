//Question 
    //WAP that Finds the approximation value of sin and cos series using loops.
//Answer
package loops;

public class Approximation {
	//sin(x)=x-(x^3/3!)+(x^5/5!)-(x^7/7!)+......n times
	static double sin(double x,int n) {
		int sign=1;
		double result=0,fact=1,power=x;
		for(int i=1;i<=2*n;i=i+2) { //1,3,5,7 ... 2*n
			fact=fact*i;
			result+=((power*sign)/fact);
			sign=sign*(-1);
			power=power*x*x;
			fact=fact*(i+1);
		}
		return result;
	}
	
	//cos(x)=1-(x^2/2!)+(x^4/4!)-(x^6/6!)+......n times
	static double cos(double x,int n) {
		int sign=-1;
		double result=1,fact=1,power=1;
		for(int i=2;i<2*n;i=i+2) { //1,3,5,7 ... 2*n
			fact=fact*i;
			power=power*x*x;
			result+=((power*sign)/fact);
			sign=sign*(-1);
			fact=fact*(i+1);
		}
		return result;
	}
	public static void main(String[] args) {
		double angle=Math.toRadians(45);
		System.out.println(Math.sin(angle));
		System.out.println(sin(angle,20));
		System.out.println(cos(angle,20));
		System.out.println(Math.cos(angle));
	}
}
