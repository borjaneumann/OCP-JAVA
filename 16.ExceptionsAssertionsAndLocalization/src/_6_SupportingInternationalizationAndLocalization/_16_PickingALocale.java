package _6_SupportingInternationalizationAndLocalization;

import java.util.Locale;

public class _18_PickingALocale {
    public static void main(String[] args) {
        //While Oracle defines a locale as “a specific geographical, political, or
        //cultural region,” you'll only see languages and countries on the exam.

        Locale locale = Locale.getDefault();
        System.out.println(locale); //en_GB (The country is optional)

        // two formats for Locale objects that you are expected to remember.
        //en or en_US

        //invalid:
        // US --> Cannot have country without language
        // enUS --> Missing underscore
        // US_en --> The country and language are reversed
        // EN --> Language must be lowercase

        //As a developer, you often need to write code that selects a locale other
        //than the default one. There are three common ways of doing this.

        // 1. The first is to use the built‐in constants in the Locale class, available for some
        //common locales.
        System.out.println(Locale.JAPANESE); //ja
        System.out.println(Locale.JAPAN);  // ja_JP
        /* 2.The second way of selecting a Locale is to use the constructors to create a
        new object. You can pass just a language, or both a language and country:*/
        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN

        /*Java will let you create a Locale with an invalid language or country, such
        as xx_XX. However, it will not match the Locale that you want to use, and
        your program will not behave as expected.*/

        // 3.There's a third way that is the builder design pattern that lets you set
        // all of the properties that you care about and then build it at the end.
        // This means that you can specify the properties in any order.
        // The following two Locale values both represent en_US:

        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

        //When testing a program, you might need to use a Locale other than the default of your computer.
        System.out.println(Locale.getDefault()); // en_US
        Locale locale2 = new Locale("fr");
        Locale.setDefault(locale2); // change the default
        System.out.println("CHANGING DEFAULT: " + Locale.getDefault()); // fr

        /*Try it, and don't worry—the Locale changes for only that one Java
        program. It does not change any settings on your computer. It does not
        even change future executions of the same program.
         */

    }
}
