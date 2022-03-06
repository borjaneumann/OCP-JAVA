package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _23_WrapperClass {
    public static void main(String[] args) {

        /*Up to now, we’ve only put String objects in the ArrayList. What
        happens if we want to put primitives in? Each primitive type has a
        wrapper class, which is an object type that corresponds to the primitive.

        Used to convert primitives into objects and vice versa.
        Why needed? we will need to deal with objects when
        working with collections, serialization...

        Primitive type  Wrapper class    Example of creating
        -------------------------------------------------------------------
        boolean         Boolean          Boolean.valueOf(true)
        byte            Byte             Byte.valueOf((byte) 1)
        short           Short            Short.valueOf((short) 1)
        int             Integer          Integer.valueOf(1)
        long            Long             Long.valueOf(1)
        float           Float            Float.valueOf((float) 1.0)
        double          Double           Double.valueOf(1.0)
        char            Character        Character.valueOf('c')

        Each wrapper class also has a constructor. It works the same way as
        valueOf() but isn’t recommended for new code. The valueOf() allows
        object caching. Remember how a String could be shared when the value
        is the same? The wrapper classes are immutable and take advantage of
        some caching as well.
        */



        List<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(false);
        list1.add(true);
        list1.add(false);
        System.out.println(list1); // [true, false, true, false]

        int number = 3;
        Integer integer = number;
        System.out.println(integer);//3

        boolean s = true;
        Boolean t = s;
        System.out.println(t.booleanValue());//true

        /*PARSE METHODS
        The parse methods, such as parseInt(), return a primitive, and the valueOf()
        method returns a wrapper class. This is easy to remember because
        the name of the returned primitive is in the method name. Here’s an example:
         */

        boolean a = Boolean.parseBoolean("true");
        Boolean booleanWrapper = Boolean.valueOf("true");
        System.out.println("boolean: " + a);//boolean: true
        System.out.println("BooleanWrapper: " + booleanWrapper);//BooleanWrapper: true

        int primitive = Integer.parseInt("123");//convert string into an int
        Integer wrapper = Integer.valueOf("123"); // convert String into wrapper class
        System.out.println("int: " + primitive);//int: 123
        System.out.println("IntegerWrapper: " + wrapper);//IntegerWrapper: 123

        /*
        If the String passed in is not valid for the given type, Java throws
        NumberFormatException

        The Character class doesn’t participate in the parse/valueOf methods. Since
        a String consists of characters, you can just call charAt() normally.

        Wrapper class   Converting String to a primitive    Converting String to a wrapper class
        ----------------------------------------------------------------------------------------
        Boolean         Boolean.parseBoolean("true")        Boolean.valueOf("TRUE")
        Byte            Byte.parseByte("1")                 Byte.valueOf("2")
        Short           Short.parseShort("1")               Short.valueOf("2")
        Integer         Integer.parseInt("1")               Integer.valueOf("2")
        Long            Long.parseLong("1")                 Long.valueOf("2")
        Float           Float.parseFloat("1")               Float.valueOf("2.2")
        Double          Double.parseDouble("1")             Double.valueOf("2.2")
        Character       None                                None

        WRAPPER CLASSES AND NULL
        When we presented numeric primitives in Chapter 2, we mentioned
        they could not be used to store null values. One advantage of a
        wrapper class over a primitive is that because it’s an object, it can be
        used to store a null value. While null values aren’t particularly
        useful for numeric calculations, they are quite useful in data-based
        services.

        For example, if you are storing a user’s location data using
        (latitude,longitude), it would be a bad idea to store a missing point
        as (0,0) since that refers to an actual location off the coast of Africa
        where the user could theoretically be.
         */
    }
}
