package _7_LoadingPropertiesWithResourceBundles;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class _27_FormattingMessages {
    public static void main(String[] args) {
        /* Often, we just want to output the text data from a resource bundle, but
        sometimes you want to format that data with parameters. In real programs,
        it is common to substitute variables in the middle of a resource bundle
        String. The convention is to use a number inside braces such as {0}, {1},
        etc. The number indicates the order in which the parameters will be
        passed. Although resource bundles don't support this directly, the
        MessageFormat class does.
         */

        Locale.setDefault(new Locale("en","US") );
        ResourceBundle rb = ResourceBundle.getBundle("Hello");
        String format = rb.getString("helloByName");
        System.out.print(MessageFormat.format(format,"Tammy", "Henry"));
    }

}
