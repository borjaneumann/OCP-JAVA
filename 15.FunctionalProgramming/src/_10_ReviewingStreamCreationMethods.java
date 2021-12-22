import java.util.List;
import java.util.stream.Stream;

public class _10_ReviewingStreamCreationMethods {
    public static void main(String[] args) {

        //FINITE
        Stream.empty();//Creates Stream with zero elements

        Stream.of(1,2,3,4,5); //Creates Stream with elements listed -> Stream.of(varargs)

        var list = List.of("a","v","d");
        list.stream(); //Creates Stream from a Collection -> coll.stream();

        list.parallelStream(); //Creates Stream from a Collection where the stream can run in parallel ->coll.parallelStream();

        //INFINITE
        Stream<Double> randoms = Stream.generate(Math::random); //Creates Stream by calling the Supplier for each element upon request -> Stream.generate(supplier);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);// Creates Stream by using the seed for the first element and then calling
        // the UnaryOperator for each
        // subsequent element upon request -> Stream.iterate(seed, unaryOperator);

        Stream<Integer> oddNumberUnder100 = Stream.iterate(1, n -> n < 100, n -> n + 2); //Creates Stream by using the seed for the first element and
        // then calling the UnaryOperator for each subsequent element upon request. Stops if the Predicate returns false -> Stream.iterate(seed, predicate,
        // unaryOperator);

    }
}
