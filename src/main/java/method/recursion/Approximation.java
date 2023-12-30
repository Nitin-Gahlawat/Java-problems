//Question
    //WAP to find Approximation of various series (taylor,sin,cos).
//Answer
package method.recursion;

public class Approximation {
	private static double sign=1,fact=1,power=0;

	// e^x=1+(x/1)+(x^2/2!)+(x^3/3!) ... +n times
	static double taylor(double x,double n) {
		if(n==0){
			fact=1;
			power=1;
			return 1;
		}
		else {
			double r=taylor(x,n-1);
			power=power*x;
			fact=fact*n;
			return r+(power/fact);
		}
	}
	
	// e^x=1+(x/1)+(x^2/2!)+(x^3/3!) ... +n times
	private static double answer=1;
	static double taylorHornerRule(double x,double n) {
		if(n==0)
			return answer;
		else
			answer=(1+(x/n)*answer);
		return taylorHornerRule(x,n-1);
	}
	
	//sin(x)=x-(x^3/3!)+(x^5/5!)-(x^7/7!)+......n times
	static double sin(double x,int n) {
		if(n==1) {
			power=x;
			return x;
		}
		double r=sin(x,n-1);
		for (int i = (2*n-1)-1; i <= (2*n-1); i++) {	//2,3 //4,5 //6,7
			fact*=i;
			power=power*x;
		}
		sign=sign*(-1);
		return r+(power*(sign)/fact);
		
	}

	//cos(x)=1-(x^2/2!)+(x^4/4!)-(x^6/6!)+......n times
	static double cos(double x,int n) {
		if(n==1) {
			sign=1;
			fact=1;
			power=1;
			return 1;
		}
		double r=cos(x,n-1);
		for (int i = (2*(n-1)-1); i <= 2*(n-1); i++) {	//1,2 //3,4 //5,6
			fact*=i;
			power=power*x;
		}
		sign=sign*(-1);
		return r+(power*(sign)/fact);
		
	}
	public static void main(String[] args) {
		double angle=Math.toRadians(45);
		System.out.println(Math.sin(angle));
		System.out.println(sin(angle,20));
		System.out.println(cos(angle,20));
		System.out.println(Math.cos(angle));
		System.out.println(taylor(1,4));
		System.out.println(taylorHornerRule(1, 4));
	}
}
