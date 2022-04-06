package _01_WorkingWithBuiltinFunctionalInterfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _3_ImplementingPredicateAndBiPredicate {

    //Predicate is often used when filtering or matching. Both are common operations.
    // A BiPredicate is just like a Predicate except that it takes two parameters
    //instead of one.
    public static void main(String[] args) {
        //Predicate
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("Hi")); //true
        System.out.println(p2.test("")); //true

        //BiPredicate
        BiPredicate<String, String> b3 = String::startsWith;
        BiPredicate<String, String> b4 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b3.test("chicken", "chick")); //true
        System.out.println(b4.test("chicken", "chick")); //true



    }
}
