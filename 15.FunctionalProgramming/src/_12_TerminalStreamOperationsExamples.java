import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class _12_TerminalStreamOperationsExamples {

    public static void main(String[] args) {
        //Count()
        //The count() method determines the number of elements in a finite stream.
        //. The count() method is a reduction because it looks at each
        //element in the stream and returns a single value.
        //long count()
        Stream<String> s = Stream.of("monkey", "gorilla", "bonono");
        System.out.println(s.count()); // 3

        //min() and max()
        //The min() and max() methods allow you to pass a custom comparator and
        //find the smallest or largest value in a finite stream according to that sort
        //order. Like the count() method, min() and max() hang on an infinite
        //stream because they cannot be sure that a smaller or larger value isn't
        //coming later in the stream. Both methods are reductions because they
        //return a single value after looking at the entire stream.
        //Optional<T> min(Comparator<? super T> comparator)
        //Optional<T> max(Comparator<? super T> comparator)
        Stream<String> t = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = t.min((s1, s2) -> s1.length()- s2.length());
        min.ifPresent(System.out::println); // ape

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
        //Since the stream is empty, the comparator is never called, and no value is
        //present in the Optional.
        /*What if you need both the min() and max() values of the same
        stream? For now, you can't have both, at least not using these
        methods. Remember, a stream can have only one terminal operation.
        Once a terminal operation has been run, the stream cannot be used again.*/

        //findAny() and findFirst()
        //The findAny() and findFirst() methods return an element of the stream
        //unless the stream is empty. If the stream is empty, they return an empty
        //Optional. This is the first method you've seen that can terminate with an
        //infinite stream.
        /*These methods are terminal operations but not reductions. The reason is
        that they sometimes return without processing all of the elements. This
        means that they return a value based on the stream but do not reduce the
        entire stream into one value.*/
        //Optional<T> findAny()
        //Optional<T> findFirst()
        Stream<String> u = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        u.findAny().ifPresent(System.out::println); // monkey(usually)
        infinite.findAny().ifPresent(System.out::println); // chimp

        //allMatch(), anyMatch(), and noneMatch()
        /*The allMatch(), anyMatch(), and noneMatch() methods search a stream
        and return information about how the stream pertains to the predicate.
        These may or may not terminate for infinite streams. It depends on the
        data. Like the find methods, they are not reductions because they do not
        necessarily look at all of the elements.*/
        //boolean anyMatch(Predicate <? super T> predicate)
        //boolean allMatch(Predicate <? super T> predicate)
        //boolean noneMatch(Predicate <? super T> predicate)

        //This example checks whether animal names begin with letters:
        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite2.anyMatch(pred)); // true //If we called allMatch(), it would run until we killed the program.
        //Remember that allMatch(), anyMatch(), and noneMatch() return a
        //boolean. By contrast, the find methods return an Optional because
        //they return an element of the stream.

        //forEach()
        //Like in the Java Collections Framework, it is common to iterate over the
        //elements of a stream. As expected, calling forEach() on an infinite stream
        //does not terminate. Since there is no return value, it is not a reduction.
        //void forEach(Consumer<? super T> action)
        Stream<String> a = Stream.of("Monkey", "Gorilla", "Bonobo");
        a.forEach(System.out::print); // MonkeyGorillaBonobo
        //Notice that you can't use a traditional for loop on a stream.
        Stream<Integer> loop = Stream.of(1);
        //for (Integer i : loop) {} // DOES NOT COMPILE
        //While forEach() sounds like a loop, it is really a terminal operator for
        //streams. Streams cannot be used as the source in a for‐each loop to run
        //because they don't implement the Iterable interface.

        //reduce()
        /*The reduce() method combines a stream into a single object. It is a
        reduction, which means it processes all elements. The three method signatures are these:
        T reduce(T identity, BinaryOperator<T> accumulator)
        Optional<T> reduce(BinaryOperator<T> accumulator)
        <U> U reduce(U identity,
                BiFunction<U,? super T,U> accumulator,
                BinaryOperator<U> combiner)*/
        //The most common way of doing a reduction is to start with an initial value
        // and keep merging it with the next value.
        //concatenate an array of String objects into a single String without functional programming
        System.out.println();
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";//identity
        for (var sArray: array) {
            result = result + sArray;
        }
        System.out.println(result); // wolf

        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (l, c) -> l + c);
        System.out.println(word); // wolf

        //Method reference
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", String::concat);
        System.out.println(word1); // wolf

        //Let's try another one. Can you write a reduction to multiply all of the
        //Integer objects in a stream?
        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (c, b) -> c*b)); // 90
        //When you don't specify an identity, an Optional is returned because there might not
        //be any data.
        BinaryOperator<Integer> op = (k, b) -> k * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90
        //counts number of characters
        Stream<String> numberOfCharacters = Stream.of("w", "o", "l", "f!");
        int length = numberOfCharacters.reduce(0, (i, sw) -> i+sw.length(), (q, b) -> q+b);
        System.out.println(length); // 5
        /*The first parameter ( 0) is the value for the initializer. If we had an empty
        stream, this would be the answer. The second parameter is the
        accumulator. Unlike the accumulators you saw previously, this one
        handles mixed data types. In this example, the first argument, i, is an
        Integer, while the second argument, s, is a String. It adds the length of
        the current String to our running total. The third parameter is called the
        combiner, which combines any intermediate totals. In this case, a and b
        are both Integer values.
        The three‐argument reduce() operation is useful when working with
        parallel streams because it allows the stream to be decomposed and
        reassembled by separate threads. For example, if we needed to count the
        length of four 100‐character strings, the first two values and the last two
        values could be computed independently. The intermediate result (200 +
        200) would then be combined into the final value.*/




    }
}
