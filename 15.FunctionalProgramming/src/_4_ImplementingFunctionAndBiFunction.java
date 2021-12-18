import java.util.function.Function;

public class _4_ImplementingFunctionAndBiFunction {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String :: length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); //5
        System.out.println(f2.apply("Donald Duck")); //11
    }

}
