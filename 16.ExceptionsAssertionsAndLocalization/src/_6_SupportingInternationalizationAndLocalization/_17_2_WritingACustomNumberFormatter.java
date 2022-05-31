package _6_SupportingInternationalizationAndLocalization;

import java.awt.font.NumericShaper;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class _21_WritingACustomNumberFormatter {
    public static void main(String[] args) {
        //Like when working with dates, you can also create your
        //own number format strings using the DecimalFormat class, which extends
        //NumberFormat.
        //When creating a DecimalFormat object, you use a constructor rather than a factory method.
        //you need to know only about two formatting characters

        /*
        Symbol      Meaning                                                 Examples
        ---------------------------------------------------------------------------------
        #           Omit the position if no digit exists for it.            $2.2
        0           Put a 0 in the position if no digit exists for it.      $002.20
        */

        double d = 1234567.467;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println("f1: " + f1.format(d)); //1.234.567,5

        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
        System.out.println("f2: " + f2.format(d)); //001.234.567,46700

        NumberFormat f3 = new DecimalFormat("$#,###,###.##");
        System.out.println("f2: " + f3.format(d)); //$1.234.567,47

    }

}
