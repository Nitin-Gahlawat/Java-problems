//Question
    //Converting the given seconds in days,hours,minutes,seconds.
//Answer
import java.util.Scanner;
public class DisplayTime {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter an Integer for the Seconds:");
        int second = obj.nextInt();
        int days = (second / (24 * 3600)) ;
        int hours = (second / 3600) % 24;
        int minutes = (second / 60) % 60;
        int remaningsecond = second % 60;
        System.out.printf("%d second is %d days %d hours %d minutes and %d seconds ", second, days, hours, minutes,
                remaningsecond);
        obj.close();
    }
}