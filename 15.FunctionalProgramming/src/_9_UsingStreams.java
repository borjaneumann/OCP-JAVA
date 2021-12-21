import java.util.stream.Stream;

public class _9_UsingStreams {

    //A stream in Java is a sequence of data. A stream pipeline consists of the
    //operations that run on a stream to produce a result.

    //In Java, the streams we have been talking about are represented by the
    //Stream<T> interface, defined in the java.util.stream package.

    //CREATE FINITE STREAMS
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();//count = 0
        Stream<Integer> singleElement = Stream.of(1);//count = 1
        Stream<Integer> fromArray = Stream.of(1,2,3);//count = 3 The method signature uses varargs, which let you specify an
        //array or individual elements.
    }

}
