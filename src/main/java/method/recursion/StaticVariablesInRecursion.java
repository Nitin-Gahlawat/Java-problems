//Question
    //Show the use of static variables in recursion.
//Answer
package method.recursion;

public class StaticVariablesInRecursion {

	static int x = 0;

	static int  staticfun(int n) {
		if(n>0) {
			x++;
			return staticfun(n-1)+x;
		}
		return 0;
	}

	static int  instancefun(int n) {
		if(n>0) {
			return instancefun(n-1)+n;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int a=5;
		System.out.println(instancefun(a));	//15
		System.out.println(staticfun(a));	//25
	}
}
