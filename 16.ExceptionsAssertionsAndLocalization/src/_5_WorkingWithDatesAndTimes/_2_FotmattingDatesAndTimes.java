package _5_WorkingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class _2_FotmattingDatesAndTimes {
    public static void main(String[] args) {
        //The date and time classes support many methods to get data out of them.

        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getMonth()); // OCTOBER
        System.out.println(date.getYear()); // 2020
        System.out.println(date.getDayOfYear()); // 294

        //Java provides a class called DateTimeFormatter to display standard formats.
        LocalDate date1 = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dt = LocalDateTime.of(date1, time);
        System.out.println("formatted: " + date1.format(DateTimeFormatter.ISO_LOCAL_DATE)); //2020-10-20
        System.out.println("formatted: " + time.format(DateTimeFormatter.ISO_LOCAL_TIME)); //11:12:34
        System.out.println("formatted: " + dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); //2020-10-20T11:12:34

        // For example, each of the following will produce an exception at runtime
        // since it attempts to format a date with a time value, and vice versa:
//        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_DATE));

        //custom format using a date format String.
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // October 20, 2020 at 11:12

    }
}
