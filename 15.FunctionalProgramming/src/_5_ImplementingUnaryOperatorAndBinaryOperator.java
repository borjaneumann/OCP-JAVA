import java.util.function.BiFunction;
import java.util.function.Function;

public class _5_ImplementingUnaryOperatorAndBinaryOperator {

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

}



}
