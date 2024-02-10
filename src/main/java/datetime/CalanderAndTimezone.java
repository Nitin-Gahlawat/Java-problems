//Question
    //WAP to show the use of Calendar and TimeZone Related API.
//Answer

package datetime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalanderAndTimezone {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Present YEAR\t" + gc.get(Calendar.YEAR));
        System.out.println("Present DAY\t" + gc.get(Calendar.DAY_OF_WEEK)); // Starts from 2
        System.out.println("Present DATE\t" + gc.get(Calendar.DATE));
        System.out.println("Present MONTH\t" + gc.get(Calendar.MONTH)); // Starts from 0
        System.out.println("Present HOUR\t" + gc.get(Calendar.HOUR));
        System.out.println("Present MINUTE\t" + gc.get(Calendar.MINUTE));
        System.out.println("Present SECOND\t" + gc.get(Calendar.SECOND));

        System.out.printf("Cheack for leap year (of %d)\t %b\n", gc.get(Calendar.YEAR), gc.isLeapYear(Calendar.YEAR));

        // print all Available Time Zones
        // String[] arr=TimeZone.getAvailableIDs();
        // System.out.println(Arrays.toString(arr));

        TimeZone tz = TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println(tz.getDisplayName());
        System.out.println(tz.getID());

    }
}
