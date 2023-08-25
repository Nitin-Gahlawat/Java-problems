//Question
    //WAP a program to sum first n Natural Number digits.
//Answer 
import java.util.Scanner;
public class SumOfNumbers{
    public static void main(String[] args) {
        System.out.println("Enter the number grater than 0 ");
        Scanner obj=new Scanner(System.in);
        int item,sum=0;
        do{
            item=obj.nextInt();
        }while(item<0);
        for (int i = 1; i <= item; i++) {
            sum+=i;
        }
        System.out.println("The sum of 1 to "+item+" is "+sum);
        obj.close();
    }
}