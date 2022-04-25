import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _19_UsingFlatMap {

    /*The flatMap() method exists on primitive streams as well. It works
    the same way as on a regular Stream except the method name is
    different. Here's an example:*/
    public static void main(String[] args) {
        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream()
                .flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream()
                .flatMapToLong(x -> LongStream.of(x));

    }
    //Additionally, you can create a Stream from a primitive stream. These
    //methods show two ways of accomplishing this:
    private static Stream<Integer> mapping (IntStream stream) {
        return stream.mapToObj(x -> x);
    }
    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
    /*The first one uses the mapToObj() method we saw earlier. The second one
    is more succinct. It does not require a mapping function because all it does
    is autobox each primitive to the corresponding wrapper object. The
    boxed() method exists on all three types of primitive streams.*/
}
