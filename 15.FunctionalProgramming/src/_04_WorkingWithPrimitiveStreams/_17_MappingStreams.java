package _04_WorkingWithPrimitiveStreams;

import java.util.ArrayList;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class _17_MappingStreams {
    //Another way to create a primitive stream is by mapping from another
    //stream type

    public static void main(String[] args) {
        //Mapping methods between types of streams
        /*Source stream class       To create Stream To Create DoubleStream To create IntStream To create LongStream
        ============================================================================================================
        Stream<T>                   map()            mapToDouble()          mapToInt()          mapToLong()
        DoubleStream                mapToObject()    map()                  mapToInt()          mapToLong()
        IntStream                   mapToObject()    mapToDouble()          map()               mapToLong()
        LongStream                  mapToObject()    mapToDouble()          mapToInt()          map()
         */

        /* mapping to the same type you started with is just called
        map(). When returning an object stream, the method is mapToObj().
        Beyond that, it's the name of the primitive type in the map method name.

         */
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);//7,4

        //The function mappings are intuitive here. They take the
        //source type and return the target type

        //Function parameters when mapping between types of streams
        /*Source stream class       To create Stream To Create DoubleStream To create IntStream To create LongStream
        ============================================================================================================
        Stream<T>                   Function<T,R>     ToDoubleFunction<T>   ToIntFunction<T>    ToLongFunction<T>
        DoubleStream                DoubleFunction<R> DoubleUnaryOperator   DoubleToIntFunction DoubleToLongFunction
        IntStream                   IntFunction<R>    IntToDoubleFunction   IntUnaryOperator    IntToLongFunction
        LongStream                  LongFunction<R>   LongToDoubleFunction  LongToIntFunction   LongUnaryOperator
         */
        /* you can start by thinking about the source and target types.
        When the target type is an object, you drop the To from the name. When
        the mapping is to the same type you started with, you use a unary operator
        instead of a function for the primitive streams.
         */


    /*The flatMap() method exists on primitive streams as well. It works
    the same way as on a regular Stream except the method name is
    different. Here's an example:*/

        var integerList = new ArrayList<Integer>();
        IntStream ints = integerList.stream()
                .flatMapToInt(x -> IntStream.of(x));
        DoubleStream doubles = integerList.stream()
                .flatMapToDouble(x -> DoubleStream.of(x));
        LongStream longs = integerList.stream()
                .flatMapToLong(x -> LongStream.of(x));

    }
    //Additionally, you can create a Stream from a primitive stream.
    //These methods show two ways of accomplishing this:

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
