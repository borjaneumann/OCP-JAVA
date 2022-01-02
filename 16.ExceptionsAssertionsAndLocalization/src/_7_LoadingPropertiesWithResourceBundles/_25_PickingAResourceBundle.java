package _7_LoadingPropertiesWithResourceBundles;

import java.util.Locale;
import java.util.ResourceBundle;

public class _25_PickingAResourceBundle {
    public static void main(String[] args) {

        Locale spanishSpain = new Locale("es", "ES");

        ResourceBundle.getBundle("Zoo");
        /*The first one uses the default locale. You are likely to use this one in
        programs that you write. Either the exam tells you what to assume as the
        default locale or it uses the second approach.*/

        ResourceBundle.getBundle("Zoo", spanishSpain);

        //Java handles the logic of picking the best available resource bundle for a
        //given key. It tries to find the most specific value.

        /*
         Picking a resource bundle for French/France with default locale English/US
        Step            Looks for               file Reason
        -------------------------------------------------------------------------------
        1               Zoo_fr_FR.properties    The requested locale
        2               Zoo_fr.properties       The language we requested with no country
        3               Zoo_en_US.properties    The default locale
        4               Zoo_en.properties       The default locale's language with no country
        5               Zoo.properties          No locale at all—the default bundle
        6               If still not found,     No locale or default bundle available
                        throw MissingResourceException.
        1. Look for the resource bundle for the requested locale, followed by the one
        for the default locale.
        2. For each locale, check language/country, followed by just the language.
        3. Use the default resource bundle if no matching locale can be found.

         */

    }
}
