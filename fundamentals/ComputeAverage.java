//Question 
    //input the marks of n subjects from the user and find the average of the student marks
//Answer

import java.util.Scanner;

public class ComputeAverage {
    public static void main(String[] args) {
        int temp = 0,total=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            marks[i] = temp;
        }
        for (int i = 0; i < n; i++)
            total+=marks[i];
        System.out.println("The Average of marks is "+total/n);
        sc.close();
    }
}
