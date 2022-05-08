package _01_WorkingWithBuiltinFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _04_ImplementingFunctionAndBiFunction {
    /*
    A Function is responsible for turning one parameter into a value of a potentially different
    type and returning it. Similarly, a BiFunction is responsible for turning
    two parameters into a value and returning it. The interfaces are defined as
    follows:

    @FunctionalInterface
    public interface Function<T, R> {
        R apply(T t);
        // omitted default and static methods
    }
    @FunctionalInterface
    public interface BiFunction<T, U, R> {
        R apply(T t, U u);
        // omitted default method
    }

     */
    public static void main(String[] args) {
        Function<String, Integer> f1 = String :: length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); //5
        System.out.println(f2.apply("Donald Duck")); //11

        //This function turns a String into an Integer. Well, technically it turns the
        //String into an int, which is autoboxed into an Integer.

        /*The types don't have to be different. The following combines two String objects and
        produces another String:*/
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "shark")); // baby shark
    }
    /*
    CREATING YOUR OWN FUNCTIONAL INTERFACES
    Java provides a built‐in interface for functions with one or two
    parameters. What if you need more? No problem. Suppose that you
    want to create a functional interface for the wheel speed of each
    wheel on a tricycle. You could create a functional interface such as
    this:

    @FunctionalInterface
    interface TriFunction<T,U,V,R> {
        R apply(T t, U u, V v);
    }
    There are four type parameters. The first three supply the types of
    the three wheel speeds. The fourth is the return type. Now suppose
    that you want to create a function to determine how fast your quad‐
    copter is going given the power of the four motors. You could create
    a functional interface such as the following:

    @FunctionalInterface
    interface QuadFunction<T,U,V,W,R> {
        R apply(T t, U u, V v, W w);
    }
    There are five type parameters here. The first four supply the types
    of the four motors. Ideally these would be the same type, but you
    never know. The fifth is the return type in this example.
    Java's built‐in interfaces are meant to facilitate the most common
    functional interfaces that you'll need. It is by no means an
    exhaustive list. Remember that you can add any functional interfaces
    you'd like, and Java matches them when you use lambdas or method
    references.
     */
}
