//Question
	//WAP to show the various DateTime related classes in java.
//Answer


package datetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class DateTimeDemo {
    public static void main(String[] args) {

        System.out.println("\n*************************LocalDateTime******************************");

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        LocalDateTime dt1 = dt.plusDays(200);
        System.out.println(dt1);

        System.out.println("\n*************************ZonedDateTime******************************");
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);

        System.out.println("\n*************************OffsetDateTime*****************************");
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);
    }
}
