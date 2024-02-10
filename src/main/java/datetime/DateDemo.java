//Question
	//WAP to show the various Date related classes.
//Answer

package datetime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalDate ld1=LocalDate.now(Clock.systemDefaultZone());
        System.out.println(ld1);

        LocalDate d=LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(d);

        System.out.println("of");
        LocalDate d1=LocalDate.of(2020, Month.NOVEMBER, 10);
        System.out.println(d1);

        LocalDate d2=LocalDate.ofEpochDay(1); //form 1-1-1970
        System.out.println(d2);

        LocalDate d3=LocalDate.parse("2020-10-03");
        System.out.println(d3);

        LocalDate newld=ld.plusMonths(10);
        System.out.println(newld);

    }
}
