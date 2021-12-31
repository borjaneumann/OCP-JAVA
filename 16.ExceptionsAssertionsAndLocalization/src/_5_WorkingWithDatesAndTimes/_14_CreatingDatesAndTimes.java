package _5_WorkingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZonedDateTime;

public class _14_CreatingDatesAndTimes {

    /*
    Date and time types
    class                   Description                             Example
    -------------------------------------------------------------------------
    java.time.LocalDate     Date with day, month, year              Birth date
    java.time.LocalTime     Time of day                             Midnight
    java.time.LocalDateTime Day and time with no time zone          10a.m. next Monday
    java.time.ZonedDateTime Date and time with a specific time zone 9 a.m. EST on 2/20/2021


     */
    public static void main(String[] args) {
        //now() is the static method
        System.out.println(LocalDate.now()); // 2021-12-30
        System.out.println(LocalTime.now()); // 11:29:53.665172600
        System.out.println(LocalDateTime.now()); //2021-12-30T11:29:53.665172600
        System.out.println(ZonedDateTime.now()); //2021-12-30T11:29:53.665172600+01:00[Europe/Berlin]

        //Using the of() methods. Creating Dates
        LocalDate date1 = LocalDate.of(2020, Month.DECEMBER,30);
        LocalDate date2 = LocalDate.of(2020, 12,30);

        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        //You can combine dates and times in multiple ways.
        var dt1 = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15,
                30);
        LocalDate date = LocalDate.of(2020, Month.OCTOBER, 20);
        LocalTime time = LocalTime.of(6, 15);
        var dt2 = LocalDateTime.of(date, time);

    }

}
