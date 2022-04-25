import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _18_MappingStreams {
    //Another way to create a primitive stream is by mapping from another
    //stream type

    public static void main(String[] args) {
        //Mapping methods between types of streams
        /*Source stream class       To create Stream To Create DoubleStream To create IntStream To create LongStream
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

    }

}
