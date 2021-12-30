package _5_WorkingWithDatesAndTimes;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class _3_StandardDateTimeSymbols {
    /*
    Symbol      Meaning             Examples
    y           Year                20,2020
    M           Month               1, 01, Jan, January
    d           Day                 5, 05
    h           Hour                9, 09
    m           Minute              45
    s           Second              52
    a           a.m./p.m.           AM, PM
    z           Time Zone Name      Eastern Standard Time, EST
    Z           Time Zone Offset    ‐0400
     */
    public static void main(String[] args) {

        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);

        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dt.format(formatter1)); //   10/20/2020 06:15:30
        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-_dd");
        System.out.println(dt.format(formatter2)); //   10_2020_-_20
        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
        System.out.println(dt.format(formatter3)); // 6:15 EST //Exception in thread "main" java.time.DateTimeException:
        //Unable to extract ZoneId from temporal 2020-10-20T06:15:30

        /*As you saw in the previous example, you need to make sure the format
        String is compatible with the underlying date/time type.*/
    }
}
