package _7_LoadingPropertiesWithResourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class _26_SelectingResourceBundleValues {
    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale); // The default locale is en_US, and the requested locale is en_CA.
        System.out.print(rb.getString("hello"));
        System.out.print(". ");
        System.out.print(rb.getString("name"));
        System.out.print(" ");
        System.out.print(rb.getString("open"));
        System.out.print(" ");
        System.out.print(rb.getString("visitors"));

         /*Line 12 doesn't find a match for the key hello in Zoo_en_CA.properties,
        so it goes up the hierarchy to Zoo_en.properties. Line 14 doesn't find a
        match for name in either of the first two properties files, so it has to go all
        the way to the top of the hierarchy to Zoo.properties. Line 16 has the
        same experience as line 12, using Zoo_en.properties. Finally, line 18 has
        an easier job of it and finds a matching key in Zoo_en_CA.properties.*/


    }



}
