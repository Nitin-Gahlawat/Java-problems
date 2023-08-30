//Question
    //WAP to display the current time in GMT(Greenwich mean Time) in the format hour:minute:second.
//Answer
public class ShowCurrentTime {
    public static void main(String[] args) {
        // total milisecond since 1970
        long totalMilliseconds = System.currentTimeMillis();

        // total second since midnight Jan 1,1970
        long totalsecond = totalMilliseconds / 1000;

        // computing current second
        long currentsecond = totalsecond % 60;

        // obtain the total minutes
        long totalminute = totalsecond / 60;

        // computer the current minutes in the hour
        long currentminute = totalminute % 60;

        // Obtain the total hours
        long totalhour = totalminute / 60;

        // computing the current hour
        long currenthour = totalhour % 24;

        // display result
        System.out.printf("Current time is %d:%d:%d GMT", currenthour, currentminute, currentsecond);

    }
}
