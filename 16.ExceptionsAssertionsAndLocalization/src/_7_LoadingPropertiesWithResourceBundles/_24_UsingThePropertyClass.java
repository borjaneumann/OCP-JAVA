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
        System.out.println("Props: "+ props.getProperty("camel")); // null
        System.out.println("Props: "+ props.getProperty("camel", "Bob")); // Bob

        /*If a key were passed that actually existed, both statements would have
        printed it. This is commonly referred to as providing a default, or backup
        value, for a missing key.

        The Properties class also includes a get() method, but only getProperty() allows
        for a default value. For example, the following call is invalid since get() takes
        only a single parameter:
         */

        props.get("open"); // 10am  takes only one parameter
        //props.get("open", "The zoo will be open soon"); // DOES NOT COMPILE

        //USING THE PROPERTY METHODS

        /* A Properties object isn't just similar to a Map; it actually inherits
        Map<Object,Object>. Despite this, you should use the getProperty() and setProperty() methods
        when working with a Properties object, rather than the get()/ put() methods.
        Besides supporting default values, it also ensures you don't add data to the
        Properties object that cannot be read.*/

        var props1 = new Properties();
        props1.put("tigerAge", "4");
        props1.put("lionAge", 5);
        System.out.println("Props1: "+ props1.getProperty("tigerAge")); // 4
        System.out.println("Props1: "+ props1.getProperty("lionAge"));  // null // only Strings!!

        //The point is to avoid using the get/put() methods when working with Properties objects.
    }
}
