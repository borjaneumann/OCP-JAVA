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

    }
}
