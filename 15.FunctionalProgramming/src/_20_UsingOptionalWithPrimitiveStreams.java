import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class _20_UsingOptionalWithPrimitiveStreams {

    public static void main(String[] args) {
        var stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();
        /*The return type is not the Optional you have become accustomed to
        using. It is a new type called OptionalDouble. Why do we have a separate
        type, you might wonder? Why not just use Optional<Double>? The
        difference is that OptionalDouble is for a primitive and
        Optional<Double> is for the Double wrapper class. Working with the
        primitive optional class looks similar to working with the Optional class
        itself.*/
        optional.ifPresent(System.out::println); //5.5
        System.out.println(optional.getAsDouble()); //5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); //5.5

    }

}
