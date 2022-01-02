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

    }
}
