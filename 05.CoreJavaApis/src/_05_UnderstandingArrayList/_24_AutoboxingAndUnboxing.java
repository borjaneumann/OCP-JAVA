package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _24_AutoboxingAndUnboxing {
    public static void main(String[] args) {

        /*Since Java 5, you can just type the primitive
        value, and Java will convert it to the relevant wrapper class for you. This
        is called autoboxing.
        The reverse conversion of wrapper class to primitive value is called unboxing.
         */

        List<Integer> weights = new ArrayList<>();
        Integer w = 50;//Integer w = Integer.valueOf(50) Autoboxing
        weights.add(w);//50
        weights.add(Integer.valueOf(60));//[50,60] //Autoboxing before java 5.
        weights.remove(new Integer(50));//[60] new Integer is deprecated.
        double first = weights.get(0);//60.0 unboxing
        System.out.println("First: " + first); // First: 60.0

        //Unboxing Null
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0);//NullPointerException This is a problem. Java tries to get the int value
        //of null. Since calling any method on null gives a
        //NullPointerException, that is just what we get. Be careful when you see
        //null in relation to autoboxing.
        System.out.println(h);//NullPointerException

        //When Autoboxing an Integer
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);//it is the index, not number 1.
        System.out.println("Numbers: " + numbers); //Numbers: [1]
        /*If you want to remove the 1, you can write
        numbers.remove(new Integer(1)) to force wrapper class use.
         */
    }
}
