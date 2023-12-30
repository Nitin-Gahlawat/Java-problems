//Question
    //Show various type of recursion (Tail Recursion,Head Recursion,Tree Recursion,Indirect Recursion,Nested Recursion).
//Answer
package method.recursion;

public class TypeOfRecursion {
	void tailRecursion(int n){
		if(n>0) {
			System.out.printf("%d\t",n);
			tailRecursion(n-1);
		}
	}
	void headRecursion(int n){
		if(n>0) {
			headRecursion(n-1);
			System.out.printf("%d\t",n);
		}
	}
	void treeRecursion(int n) {
		if(n>0) {
			System.out.printf("%d\t",n);
			treeRecursion(n-1);
			treeRecursion(n-1);
		}
	}
	static void indirectRecursion_A(int n) {
		if(n>0) {
			System.out.printf("%d\t",n);
			indirectRecursion_B(n-1);
		}
	}
	static void indirectRecursion_B(int n) {
		if(n>0) {
			System.out.printf("%d\t",n);
			indirectRecursion_A(n/2);
		}
	}
	static int nestedRecursion(int n) {
		if(n>=100) {
			return n-10;
		}
		else
			return nestedRecursion(nestedRecursion(n+11));
	}
    public static void main(String[] args) {
    	System.out.println(nestedRecursion(90));
	}
}