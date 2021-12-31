package _6_SupportingInternationalizationAndLocalization;

import java.text.NumberFormat;
import java.util.Locale;

public class _23_SpecifyingALocaleCategory {
    /*
    When you call Locale.setDefault() with a locale, several display and
    formatting options are internally selected. If you require finer‐grained
    control of the default locale, Java actually subdivides the underlying
    formatting options into distinct categories, with the Locale.Category
    enum.
     */

    //you should be familiar with the two enum values
    /*
    Value                                   Description
    -------------------------------------------------------------------------------------------------
    DISPLAY                                 Category used for displaying data about the locale
    FORMAT                                  Category used for formatting dates, numbers, or currencies
    */

    /*
    When you call Locale.setDefault() with a locale, both the DISPLAY and
    FORMAT are set together. Let's take a look at an example:

     */
    public static void printCurrency( Locale locale, double money) {
        System.out.println(NumberFormat.getCurrencyInstance().format(money)
        + ", " + locale.getDisplayLanguage());
    }

    public static void main(String[] args) {
        var spain = new Locale("es","ES");
        var money =1.23;
        //Print with Default locale
        Locale.setDefault(new Locale("en","US"));
        printCurrency(spain,money); // $1.23, Spanish

        // Print with default locale and selected locale display
        Locale.setDefault(Locale.Category.DISPLAY, spain);
        printCurrency(spain, money); // $1.23, español

        // Print with default locale and selected locale format
        Locale.setDefault(Locale.Category.FORMAT, spain);
        printCurrency(spain, money); // 1,23 €, español

    }




}
