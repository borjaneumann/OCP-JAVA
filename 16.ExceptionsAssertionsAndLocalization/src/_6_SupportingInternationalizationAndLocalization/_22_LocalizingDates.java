package _6_SupportingInternationalizationAndLocalization;

import static java.time.format.FormatStyle.SHORT;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _22_LocalizingDates {
    public static void main(String[] args) {
        //Like numbers, date formats can vary by locale.
        /*
        Description                             Using default Locale
        -------------------------------------------------------------------------------------
        For formatting dates                    DateTimeFormatter.ofLocalizedDate(dateStyle)
        -------------------------------------------------------------------------------------
        For formatting times                    DateTimeFormatter.ofLocalizedTime(timeStyle)
        -------------------------------------------------------------------------------------
        For formatting dates and times          DateTimeFormatter.ofLocalizedDateTime(dateStyle, timeStyle)
                                                DateTimeFormatter.ofLocalizedDateTime(da
                                                DateTimeFormatter.ofLocalizedDateTime(dateTimeStyle)
         */
        /*Each method in the table takes a FormatStyle parameter, with possible
        values SHORT, MEDIUM, LONG, and FULL. For the exam, you are not required
        to know the format of each of these styles.
                What if you need a formatter for a specific locale? Easy enough—just
        append withLocale(locale) to the method call.*/

        Locale.setDefault(new Locale("en", "US"));
        var italy = new Locale("it", "IT");
        var dt = LocalDateTime.of(2020, Month.OCTOBER, 20, 15, 12, 34);
        print(DateTimeFormatter.ofLocalizedDate(SHORT),dt,italy); // 10/20/20, 20/10/20
        print(DateTimeFormatter.ofLocalizedTime(SHORT),dt,italy); // 3:12 PM, 15:12
        print(DateTimeFormatter.ofLocalizedDateTime(SHORT,SHORT),dt,italy); // 10/20/20, 3:12 PM, 20/10/20, 15:12
    }

    public static void print(DateTimeFormatter dtf, LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + ", "
                + dtf.withLocale(locale).format(dateTime));
    }
}
