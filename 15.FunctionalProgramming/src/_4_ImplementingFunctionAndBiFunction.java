import java.util.function.Function;

public class _4_ImplementingFunctionAndBiFunction {
    public static void main(String[] args) {
        Function<String, Integer> f1 = String :: length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck")); //5
        System.out.println(f2.apply("Donald Duck")); //11

        //This function turns a String into an Integer. Well, technically it turns the
        //String into an int, which is autoboxed into an Integer.
    }

}
