//Question 
    //Input the marks of n subjects from the user and find the average of the student marks.
//Answer
package fundamentals;
import java.util.Scanner;

public class ComputeAverage {
	static double avg(int n,double[] marks) {
		double total=0;
        for (int i = 0; i < n; i++)
            total+=marks[i];
        return total/n;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] marks = new double[n];
        for (int i = 0; i < n; i++) {
        	 marks[i]=sc.nextDouble();
        }
        System.out.println("The Average of marks is "+ComputeAverage.avg(n, marks));
        sc.close();
    }
}
