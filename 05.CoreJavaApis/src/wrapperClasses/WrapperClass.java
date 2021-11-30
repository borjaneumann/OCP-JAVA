package wrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {

        //Used to convert primitives into objects and vice versa. Why needed, we will need to deal with objects when
        //working with collections, serialization...
        List<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(false);
        list1.add(true);
        list1.add(false);
        System.out.println(list1);

        int number = 3;
        Integer integer = number;
        System.out.println(integer);

        boolean s = true;
        Boolean t = s;
        System.out.println(t.booleanValue());

        boolean a = Boolean.parseBoolean("true");
        Boolean booleanWrapper = Boolean.valueOf("true");
        System.out.println("boolean: " + a);
        System.out.println("BooleanWrapper: " + booleanWrapper);

        int primitive = Integer.parseInt("123");//convert string into an int
        Integer wrapper = Integer.valueOf("123"); // convert String into wrapper class
        System.out.println("int: " + primitive);
        System.out.println("IntegerWrapper: " + wrapper);
    }
}
