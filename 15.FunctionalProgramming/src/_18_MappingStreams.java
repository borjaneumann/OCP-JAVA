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

        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
        intStream.forEach(System.out::println);//7,4

        //The function mappings are intuitive here. They take the
        //source type and return the target type

    }

}
