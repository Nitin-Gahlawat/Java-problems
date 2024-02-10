//Question
	//WAP to show the various Time related classes in java.
//Answer

package datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;

public class TimeDemo {
    public static void main(String[] args) {

        System.out.println("\n*************************LocalTime******************************");

        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalTime t1=t.minusHours(3);
        System.out.println(t1);

        System.out.println("\n*************************OffsetTime*********************************");
        OffsetTime ot = OffsetTime.now();
        System.out.println(ot);

        System.out.println("\n*************************ZoneId*************************************");
        ZoneId z = ZoneId.systemDefault();
        System.out.println(z);

        System.out.println("\n*************************MonthDay***********************************");
        MonthDay md = MonthDay.now();
        System.out.println(md);

        // /******************Adding the Year to MonthDay returns LocalDate******************/
        // System.out.println(md.atYear(2000));

        System.out.println("\n*************************YearMonth**********************************");
        YearMonth ym = YearMonth.now();
        System.out.println(ym);

        System.out.println("\n*************************Year***************************************");
        Year y = Year.now();
        System.out.println(y);

        System.out.println("\n**************************Period************************************");
        Period p = Period.of(2, 2, 10);
        System.out.println(p);
        System.out.println(p.addTo(LocalDate.now()));

        System.out.println("\n*************************Instant************************************");
        /**************** Green Which mean time. *****************/
        Instant i = Instant.now();
        System.out.println(i);

        System.out.println("\n*************************Duration***********************************");
        Duration d = Duration.ofMinutes(200);
        System.out.println(d.getSeconds());

    }
}
