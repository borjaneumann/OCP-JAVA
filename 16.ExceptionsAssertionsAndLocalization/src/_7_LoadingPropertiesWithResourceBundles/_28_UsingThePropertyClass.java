package _7_LoadingPropertiesWithResourceBundles;

import java.util.Properties;

public class _28_UsingThePropertyClass {
    public static void main(String[] args) {

        //When working with the ResourceBundle class, you may also come across
        //the Properties class. It functions like the HashMap class that you learned
        //in “Generics and Collections,” except that it uses String values for the keys and values.
        // Let's create one and set some bobbvalues.

        var props = new Properties();
        props.setProperty("name", "Our zoo");
        props.setProperty("open", "10am");

        //The Properties class is commonly used in handling values that may not exist.
        System.out.println(props.getProperty("camel")); // null
        System.out.println(props.getProperty("camel", "Bob")); // Bob

        /*If a key were passed that actually existed, both statements would have
        printed it. This is commonly referred to as providing a default, or backup
        value, for a missing key.

        The Properties class also includes a get() method, but only getProperty() allows
        for a default value. For example, the following call is invalid since get() takes
        only a single parameter:
         */

        props.get("open"); // 10am  takes only one parameter
        //props.get("open", "The zoo will be open soon"); // DOES NOT COMPILE


    }
}
