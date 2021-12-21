import java.util.List;
import java.util.stream.Stream;

public class _9_UsingStreams {

    //A stream in Java is a sequence of data. A stream pipeline consists of the
    //operations that run on a stream to produce a result.

    //In Java, the streams we have been talking about are represented by the
    //Stream<T> interface, defined in the java.util.stream package.

    public static void main(String[] args) {
        //CREATE FINITE STREAMS
        Stream<String> empty = Stream.empty();//count = 0
        Stream<Integer> singleElement = Stream.of(1);//count = 1
        Stream<Integer> fromArray = Stream.of(1,2,3);//count = 3 The method signature uses varargs, which let you specify an
        //array or individual elements.

        //Java also provides a convenient way of converting a Collection to a stream
        var list = List.of("a","b","c");
        Stream<String> fromList = list.stream();//This conversions are common

        //CREATING A PARALLEL STREAM
        var list2 = List.of("a", "b", "c");
        Stream<String> fromListParallel = list2.parallelStream();//Using parallel
        //streams is like setting up multiple tables of workers who are able to do the same task.





    }

}
