//Question 
    //WAP that display grade based on marks.
//Answer
package selections;

import java.util.Scanner;

public class GradeForMarks {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int avg=(a+b+c)/3;
        if(avg>=90)
            System.out.println("A");
        else if (avg<90 && avg>=80)
            System.out.println("B");
        else if(avg<80 && avg>=70)
            System.out.println("C");
        else if(avg<70 && avg>=60)
            System.out.println("D");
        else
            System.out.println("Fail");
        input.close();
    }
}
