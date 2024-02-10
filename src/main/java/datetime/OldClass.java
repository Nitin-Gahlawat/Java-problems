//Question
	//Show the use of Old Date time API(java.util.Date).
//Answer

package datetime;

import java.util.Date;

public class OldClass {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {
        Date d = new Date();

        System.out.println("Today`s Day is " + d.getDay()); // Starts from 0

        System.out.println("Today`s Date is " + d.getDate());

        System.out.println("Present Month is " + d.getMonth()); // Starts from 0

        System.out.println("Present Year is " + d.getYear()); // Starts from 1900

        System.out.println("Present Minutes is " + d.getMinutes());

        System.out.println("Present Seconds is " + d.getSeconds());

        System.out.println("TimezoneOffset is " + d.getTimezoneOffset());

    }

}