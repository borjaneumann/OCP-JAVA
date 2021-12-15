package _6_GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class _6_UpperBoundedWildcards {

    // Let's try to write a method that adds up the total of a list of numbers.
    // ArrayList<Number> list = new ArrayList<Integer>();// DOES NOT COMPILE

    //Instead we need to use wildcard
    List< ? extends Number> list = new ArrayList<Integer>();

    //IMPORTANT!!
    //The upper‐bounded wildcard says that any class that extends Number or
    //Number itself can be used as the formal parameter type:

    public static long total (List<? extends Number> list) {
        long count = 0;
        for (Number number: list)
            count +=number.longValue();
        return count;
    }

    //type erasure total method
//    public static long total(List list) {
//        long count = 0;
//        for (Object obj: list) {
//            Number number = (Number) obj;
//            count += number.longValue();
//        }
//        return count;
//    }

    //Something interesting happens when we work with upper bounds or
    //unbounded wildcards. The list becomes logically immutable and therefore
    //cannot be modified. Technically, you can remove elements from the list,
    //but the exam won't ask about this.

    static class Sparrow extends Bird { }
    static class Bird { }
    public static void main(String[] args) {
       List<? extends Bird> birds = new ArrayList<Bird>();
//       birds.add(new Sparrow()); // DOES NOT COMPILE we cannot add elements it is immutable
//        birds.add(new Bird()); // DOES NOT COMPILE we cannot add elements it is immutable
    }
}
