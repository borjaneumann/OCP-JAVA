public class CreatingPrimitiveStreams {

    /*Here are three types of primitive streams.
    IntStream: Used for the primitive types int, short, byte, and char
    LongStream: Used for the primitive type long
    DoubleStream: Used for the primitive types double and float*/

    public static void main(String[] args) {

    /*Method                      Primitive stream        Description
    - OptionalDouble            IntStream               The arithmetic mean of the elements
    average()                   LongStream
                                DoubleStream

    - Stream<T> boxed()         IntStream               A Stream<T> where T is the wrapper class associated
                                LongStream              with the primitive value
                                DoubleStream

    - OptionalInt max()         IntStream               The maximum element of the stream
    - OptionalLong max()        LongStream              The maximum element of the stream
    - OptionalDouble max()      DoubleStream            The maximum element of the stream

    - OptionalInt min()         IntStream               The minimum element of the stream
    - OptionalLong min()        LongStream              The minimum element of the stream
    - OptionalDouble min()      DoubleStream            The minimum element of the stream

    - IntStream range(int a, int b)     IntStream       Returns a primitive stream from a (inclusive) to b (exclusive)
    - LongStream range(long a, long b)  LongStream      Returns a primitive stream from a (inclusive) to b (exclusive)

    - IntStream rangeClosed(int a, int b)     IntStream       Returns a primitive stream from a (inclusive) to b (inclusive)
    - LongStream rangeClosed(long a, long b)  LongStream      Returns a primitive stream from a (inclusive) to b (inclusive)

    - int sum()                 IntStream               Returns the sum of the elements in the stream
    - long sum()                LongStream              Returns the sum of the elements in the stream
    - double sum()              DoubleStream            Returns the sum of the elements in the stream

    - IntSummaryStatistics summaryStatistics()      IntStream   Returns an object containing numerous
    - LongSummaryStatistics summaryStatistics()     LongStream  stream statistics such as the average,
    - DoubleSummaryStatistics summaryStatistics()   DoubleStream min, max, etc.
        */
    }

}
