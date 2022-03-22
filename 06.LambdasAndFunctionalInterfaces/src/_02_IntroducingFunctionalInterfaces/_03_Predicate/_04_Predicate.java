package _02_IntroducingFunctionalInterfaces._03_Predicate;

import java.util.function.Predicate;

public class _04_Predicate {
    /*
    Checks some input and perform some conditional checks.
    It’s in the package java.util.function and the gist of it is as follows:

        - boolean
        - one argument

    public interface Predicate<T> {
            boolean test(T t);
    }
     */
    public static void main(String[] args) {
        Predicate<String> p = (s) -> s.length() > 10;
        System.out.println(p.test("More than five")); //true
        System.out.println(p.test("little")); //true
    }
}
