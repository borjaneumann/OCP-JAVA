package _02_IntroducingFunctionalInterfaces._06_Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class _07_Comparator {
    /*
    This interface is a functional interface since it has only one
    unimplemented method. It has many static and default methods to
    facilitate writing complex comparators.
    The Comparator interface existed prior to lambdas being added to
    Java. As a result, it is in a different package. You can find
    Comparator in java.util.
    Compares its two arguments for order. Returns a negative integer, zero, or a
    positive integer as the first argument is less than, equal to, or greater than the second.
    In Java lambda expression, if there is only one statement, you may or may not use return keyword.
    You must use return keyword when lambda expression contains multiple statements.

    int compare(T o1, T o2)

     */

    public static void main(String[] args) {

        Comparator<Integer> ints = (i1,i2) -> i2-i1; //sort in descending order
        Comparator<String> strings = (s1, s2) -> s2.compareTo(s1); // sort in descending order
        Comparator<String> moreStrings = (d1, d2) -> -d1.compareTo(d2); // sort in descending order

        System.out.println(compareInt(ints));

        String nameA = "Anthony";
        String nameB = "Robert";

        Comparator<String> compareString = (a,b) -> a.compareTo(b);
        System.out.println("String comparator: " + compareString.compare(nameA, nameB));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(50);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(60);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(23);
        list1.add(23);
        list1.add(23);


        Comparator<Integer> c = (i1, i2) -> i1 - i2;
        c.compare(list.size(),list1.size());
        System.out.println(c.compare(list.size(),list1.size())); // 3
    }
    private static int compareInt(Comparator<Integer> comparator){
        return comparator.compare(40,32); //-8
    }
}
