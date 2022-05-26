package _01_WorkingWithBuiltinFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _05_ImplementingUnaryOperatorAndBinaryOperator {

    @FunctionalInterface
    public interface UnaryOperator<T> extends Function<T, T> { }
    @FunctionalInterface
    public interface BinaryOperator<T> extends BiFunction<T, T, T>
    {
// omitted static methods
    }
public static void main(String[] args) {
//    T apply(T t); // UnaryOperator
//    T apply(T t1, T t2); // BinaryOperator

    UnaryOperator<String> u1 = String::toUpperCase;
    UnaryOperator<String> u2 = x -> x.toUpperCase();
    System.out.println(u1.apply("chirp")); // CHIRP
    System.out.println(u2.apply("chirp")); // CHIRP
    //This prints CHIRP twice. We don't need to specify the return type in the
    //generics because UnaryOperator requires it to be the same as the
    //parameter

    BinaryOperator<String> b1 = String::concat;
    BinaryOperator<String> b2 = (string, toConcat) -> string.concat(toConcat);
    System.out.println(b1.apply("Mollie ", "Smith")); // baby chick
    System.out.println(b2.apply("baby ", "pig")); // baby chick

    //Notice that this does the same thing as the BiFunction example. The code
    //is more succinct, which shows the importance of using the correct
    //functional interface. It's nice to have one generic type specified instead of
    //three.

    }
}
