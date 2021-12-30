package _5_WorkingWithDatesAndTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class CreatingDatesAndTimes {

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




    }

}
