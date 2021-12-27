import java.util.stream.Stream;

public class _16_WorkingWithPrimitiveStreams {

    //Java actually includes other stream classes besides Stream that you can
    //use to work with select primitives: int, double, and long. Let's take a
    //look at why this is needed. Suppose that we want to calculate the sum of
    //numbers in a finite stream.

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3);
        System.out.println(stream.reduce(0,(s,n) -> s + n)); //6

        //There is another way of doing that, shown here:
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream1.mapToInt(x -> x).sum()); // 6
        //This time, we converted our Stream<Integer> to an IntStream and asked
        //the IntStream to calculate the sum for us. An IntStream has many of the
        //same intermediate and terminal methods as a Stream but includes
        //specialized methods for working with numeric data. The primitive streams
        //know how to perform certain common operations automatically.

    }

}
