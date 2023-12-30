//Question
    //WAP to find sum and factorial using recursion.
//Answer
package method.recursion;
public class operationsOnSeries {
	static int sum(int n) {
		if(n<=0)
			return 0;
		else
			return n+sum(n-1);
	}
	static int factorial(int n) {
		if(n<=0)
			return 1;
		else
			return n*factorial(n-1);
	}
	static int fibonacci(int n){
		if(n<=1)
			return n;
		return fibonacci(n-2)+fibonacci(n-1);
	}
	private static int arr[];
	private static void setArrVal(int n) {
		arr=new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=-1;
		}
	}
	static int Efficientfibonacci(int n) {
		if(arr==null) {
			setArrVal(n+1);
		}
		if(n<=1) {
			arr[n]=n;
			return n;
		}
		else {
			if(arr[n-1]==-1)
				arr[n-1]=Efficientfibonacci(n-1);
			if(arr[n-2]==-1)
				arr[n-2]=Efficientfibonacci(n-2);
			arr[n]=arr[n-1]+arr[n-2];
		}
		return arr[n];
	}
	static int nCr(int n,int r) {
		if(r==1 || (n-r)==1)
			return n;
		if(n==r || r==0)
			return 1;
		return nCr(n-1,r-1)+nCr(n-1,r);
					
	}
	static void towerOfHanoi(int n,int a,int b,int c) {
		if(n>0) {
			towerOfHanoi(n-1, a, c,b);
			System.out.printf("from %d to %d\n",a,c);
			towerOfHanoi(n-1,b,a, c);
		}
					
	}
	public static void main(String[] args) {
		
		towerOfHanoi(3,1,2,3);
		nCr(4,2);
		Efficientfibonacci(5);
	}
}
