package _6_SupportingInternationalizationAndLocalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class _20_ParsingNumbers {
    public static void main(String[] args) {
        //When we parse data, we convert it from a String to a structured object or
        //primitive value. The NumberFormat.parse() method accomplishes this
        //and takes the locale into consideration.

        //For example, if the locale is the English/United States ( en_US) and the
        //number contains commas, the commas are treated as formatting symbols.
        //If the locale relates to a country or language that uses commas as a
        //decimal separator, the comma is treated as a decimal point.

        //The parse() method, found in various types, declares a checked
        //exception ParseException that must be handled or declared in the
        //method in which they are called.

        String s = "40.45";
        var en = NumberFormat.getInstance(Locale.US);
        try {
            System.out.println(en.parse(s)); // 40.45
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var fr = NumberFormat.getInstance(Locale.FRANCE);
        try {
            System.out.println(fr.parse(s)); // 40
        }catch (ParseException e) {
            e.printStackTrace();
        }

        //The parse() method is also used for parsing currency.
        // For example, we can read in the zoo's monthly income from ticket sales.
        String income = "$92,807.99";
        var cf = NumberFormat.getCurrencyInstance();
        double value = 0;
        try {
            value = (Double) cf.parse(income);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(value); // 92807.99
        //The return value of parse is a Number object. Number is the parent
        //class of all the java.lang wrapper classes, so the return value can be cast
        //to its appropriate data type. The Number is cast to a Double and then
        //automatically unboxed into a double.


    }
}
