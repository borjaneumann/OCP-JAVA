package _5_WorkingWithDatesAndTimes;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class _15_2_AddingCustomTextValues {

    public static void main(String[] args) {
        //One way to address this would be to break the formatter up into multiple
        //smaller formatters and then concatenate the results.
        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 6, 15, 30);
        var f1 = DateTimeFormatter.ofPattern("MMMM dd, yyyy ");
        var f2 = DateTimeFormatter.ofPattern(" hh:mm");
        System.out.println(dt.format(f1) + "at" + dt.format(f2)); //20, 2020 at 06:15

        //You can escape the text by surrounding it with a pair of single quotes ( ').
        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
        System.out.println(dt.format(f)); // October 20, 2020 at 06:15

        //if you need to display a single quote in the output Java supports this by putting two single
        //quotes next to each other.
        var g1 = DateTimeFormatter.ofPattern("MMMM dd', Party''s at' hh:mm");
        System.out.println(dt.format(g1)); // October 20, Party's at 06:15
        var g2 = DateTimeFormatter.ofPattern("'System format, hh:mm: 'hh:mm");
        System.out.println(dt.format(g2)); // System format, hh:mm:06:15
        var g3 = DateTimeFormatter.ofPattern("'NEW! 'yyyy', yay!'");
        System.out.println(dt.format(g3)); // NEW! 2020, yay!

        //Throwing exception
        DateTimeFormatter.ofPattern("The time is hh:mm"); // Exception thrown
        DateTimeFormatter.ofPattern("'Time is: hh:mm: "); // Exception thrown

    }
}
