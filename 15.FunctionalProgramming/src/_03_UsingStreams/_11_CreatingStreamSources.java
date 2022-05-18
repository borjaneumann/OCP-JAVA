package _03_UsingStreams;

import java.util.List;
import java.util.stream.Stream;

public class _11_CreatingStreamSources {
    //A stream in Java is a sequence of data. A stream pipeline consists of the
    //operations that run on a stream to produce a result.

    //In Java, the streams we have been talking about are represented by the
    //Stream<T> interface, defined in the java.util.stream package.

    public static void main(String[] args) {
        //CREATE FINITE STREAMS
        Stream<String> empty = Stream.empty();//count = 0
        Stream<Integer> singleElement = Stream.of(1);//count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3);//count = 3 The method signature uses varargs, which let you specify an
        //array or individual elements.

        //Java also provides a convenient way of converting a Collection to a stream
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();//This conversions are common

        //CREATING A PARALLEL STREAM
        var list2 = List.of("a", "b", "c");
        Stream<String> fromListParallel = list2.parallelStream();//Using parallel
        //streams is like setting up multiple tables of workers who are able to do the same task.

        //CREATE INFINITE STREAMS

        //Creates Stream by calling the Supplier for each element upon request -> Stream.generate(supplier);
        Stream<Double> randoms = Stream.generate(Math::random);

        /* Creates Stream by using the seed for the first element and then calling
        the UnaryOperator for each
        subsequent element upon request -> Stream.iterate(seed, unaryOperator);
         */
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        System.out.println(randoms);
        //If you call randoms.forEach(System.out::println), the program will print random
        //numbers until you kill it. Later in the chapter, you'll learn about operations
        //like limit() to turn the infinite stream into a finite stream

        /*What if you wanted just odd numbers less than 100? Java 9 introduced an
        overloaded version of iterate() that helps with just that.*/
        Stream<Integer> oddNumberUnder100 = Stream.iterate(1, // seed
                n -> n < 100, // Predicate to specify when done
                n -> n + 2); // UnaryOperator to get next value
        /*Creates Stream by using the seed for the first element and
        then calling the UnaryOperator for each subsequent element upon request.
        Stops if the Predicate returns false -> Stream.iterate(seed, predicate,
        unaryOperator);
        This method takes three parameters. Notice how they are separated by
        commas ( ,) just like all other methods. The exam may try to trick you by
        using semicolons since it is similar to a for loop.
         */

        //FINITE
        Stream.empty();//Creates Stream with zero elements

        Stream.of(1, 2, 3, 4, 5); //Creates Stream with elements listed -> Stream.of(varargs)

        var list3 = List.of("a", "v", "d");
        list3.stream(); //Creates Stream from a Collection -> coll.stream();

        list3.parallelStream(); //Creates Stream from a Collection where the stream can run in parallel ->coll.parallelStream();


    }
        /*Creating a source
        Method                  Finite or infinite?     Notes
        =================================================================================================
        Stream.empty()          Finite                  Creates Stream with zero elements
        Stream.of(varargs)      Finite                  Creates Stream with elements listed
        coll.stream()           Finite                  Creates Stream from a Collection
        coll.parallelStream()   Finite                  Creates Stream from a Collection where the stream
                                                        can run in parallel
        Stream.generate(supplier) Infinite              Creates Stream by calling the Supplier for each
                                                        element upon request

        Stream.iterate(seed,    Infinite                Creates Stream by using the seed for the first element
        unaryOperator)                                  and then calling the UnaryOperator for each
                                                        subsequent element upon request

        Stream.iterate(seed,    Finite or Infinite      Creates Stream by using the seed for the first element
        predicate,unaryOperator)                        and then calling the UnaryOperator for each
                                                        subsequent element upon request. Stops if the
                                                        Predicate returns false
         */
}
