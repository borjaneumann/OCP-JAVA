package _6_SupportingInternationalizationAndLocalization;

import java.text.NumberFormat;
import java.util.Locale;

public class _19_LocalizingNumbers {
    public static void main(String[] args) {
        //The java.text package includes the needed classes.
        // The following sections cover how to format numbers, currency, and dates based on the locale.

        //The first step to formatting or parsing data is the same:
        // obtain an instance of a NumberFormat (factory methods).

    /*Description                               Using default Locale and a specified Locale
    ---------------------------------------------------------------------------------------
    A general‐purpose formatter                 NumberFormat.getInstance()
                                                NumberFormat.getInstance(locale)
    ---------------------------------------------------------------------------------------
    Same as getInstance                         NumberFormat.getNumberInstance()
                                                NumberFormat.getNumberInstance(locale)
    ---------------------------------------------------------------------------------------
    For formatting monetary amounts             NumberFormat.getCurrencyInstance()
                                                NumberFormat.getCurrencyInstance(locale)
    ---------------------------------------------------------------------------------------
    For formatting percentages                  NumberFormat.getPercentInstance()
                                                NumberFormat.getPercentInstance(locale)
    ---------------------------------------------------------------------------------------
    Rounds decimal values before displaying     NumberFormat.getIntegerInstance()
                                                NumberFormat.getIntegerInstance(locale)
     */
    /*Once you have the NumberFormat instance, you can call format() to turn a
    number into a String, or you can use parse() to turn a String into a
    number.
    The format classes are not thread‐safe. Do not store them in instance
    variables or static variables*/

        //FORMATTING NUMBERS
        //When we format data, we convert it from a structured object or primitive
        //value into a String. The NumberFormat.format() method formats the
        //given number based on the locale associated with the NumberFormat
        //object.

        int attendeesPerYear = 3_200_000;
        int attendeesPerMonth = 3_200_000 / 12;

        var us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(attendeesPerMonth)); //266,666
        var gr = NumberFormat.getInstance(Locale.GERMANY);
        System.out.println(gr.format(attendeesPerMonth)); //266.666
        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(ca.format(attendeesPerMonth)); //266 666

        //FORMATTING CURRENCY

        double price = 48;
        var myLocale = NumberFormat.getCurrencyInstance();
        System.out.println(myLocale.format(price));
        var myLocale2 = NumberFormat.getCurrencyInstance(Locale.JAPAN);
        System.out.println(myLocale2.format(price));
        Locale es = new Locale.Builder()
                .setRegion("ES")
                .setLanguage("es")
                .build();
        var myLocale3 = NumberFormat.getCurrencyInstance(es);
        System.out.println(myLocale3.format(price));

        //In the real world, use int or BigDecimal for money and not double.



    }


}
