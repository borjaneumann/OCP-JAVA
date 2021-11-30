package wrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {

        List<Integer> weights = new ArrayList<>();
        Integer w = 50;//Integer w = Integer.valueOf(50) Autoboxing
        weights.add(w);//50
        weights.add(Integer.valueOf(60));//[50,60] //Autoboxing before java 5.
        weights.remove(new Integer(50));//[60] new Integer is deprecated.
        double first = weights.get(0);//60.0 unboxing
        System.out.println(first);

        //Null
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
//        int h = heights.get(0);//NullPointerException
//        System.out.println(h);

        //When Autoboxing an Integer
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);//it is the indez, not number 1.
        System.out.println("Numbers: " + numbers);
    }
}
