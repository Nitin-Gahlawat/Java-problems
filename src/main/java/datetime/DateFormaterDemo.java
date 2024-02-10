//Question
    //Format the Date and Time Using DateTimeFormatter and also show the use of ChronoField . 
//Answer

package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class DateFormaterDemo {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        System.out.println(dtf.format(ldt));

        ZonedDateTime zdt = ZonedDateTime.now();
        dtf = DateTimeFormatter.ofPattern("hh:mm:ss dd-MM-yyyy  z Z");
        System.out.println(dtf.format(zdt));

        System.out.println(DayOfWeek.of(zdt.get(ChronoField.DAY_OF_WEEK)));

        System.out.println(zdt.get(ChronoField.DAY_OF_MONTH));

        System.out.println(zdt.get(ChronoField.AMPM_OF_DAY) == 1 ? "AM" : "PM");

        System.out.println(zdt.get(ChronoField.YEAR));

    }
}
