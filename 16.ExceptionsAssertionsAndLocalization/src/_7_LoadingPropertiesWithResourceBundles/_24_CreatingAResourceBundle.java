package _7_LoadingPropertiesWithResourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class _24_CreatingAResourceBundle {
    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        Locale englishCanada = new Locale("en", "CA");
        Locale frenchCanada = new Locale("fr", "CA");

        //We're going to update our application to support the four locales listed
        //previously. If we don't have a country‐specific resource bundle, Java
        //will use a language‐specific one.

        //The filenames match the name of our resource bundle, Zoo. They are then
        //followed by an underscore ( _), target locale, and .properties file
        //extension.
        printWelcomeMessage(us);
        printWelcomeMessage(france);

    }
    public static void printWelcomeMessage (Locale locale) {
        var rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello") + ". " + rb.getString("open"));
    }
}
