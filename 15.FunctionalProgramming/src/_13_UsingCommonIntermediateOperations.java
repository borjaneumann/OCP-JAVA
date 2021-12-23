import java.util.List;
import java.util.stream.Stream;

public class _13_UsingCommonIntermediateOperations {
    //Unlike a terminal operation, an intermediate operation produces a stream
    //as its result. An intermediate operation can also deal with an infinite
    //stream simply by returning another infinite stream. Since elements are
    //produced only as needed, this works fine.

    public static void main(String[] args) {
        //filter()
        /*The filter() method returns a Stream with elements that match a given expression.
        Stream<T> filter(Predicate<? super T> predicate)
        This operation is easy to remember and powerful because we can pass any
        Predicate to it. For example, this filters all elements that begin with the
        letter m:*/
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::println); // monkey

        /*distinct()
        The distinct() method returns a stream with duplicate values removed.
        The duplicates do not need to be adjacent to be removed. As you might
        imagine, Java calls equals() to determine whether the objects are the
        same.*/
        //Stream<T> distinct()
        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct()
                .forEach(System.out::print); // duckgoose
        System.out.println();
        /*limit() and skip()
        The limit() and skip() methods can make a Stream smaller, or they
        could make a finite stream out of an infinite stream. The method
        signatures are shown here:
        Stream<T> limit(long maxSize)
        Stream<T> skip(long n)
        The following code creates an infinite stream of numbers counting from 1.
        The skip() operation returns an infinite stream starting with the numbers
        counting from 6, since it skips the first five elements. The limit() call
        takes the first two of those. Now we have a finite stream with two
        elements, which we can then print with the forEach() method.*/
        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);
        s2.skip(5)
                .limit(2)
                .forEach(System.out::print); // 67

        System.out.println();
        /*map()
        The map() method creates a one‐to‐one mapping from the elements in the
        stream to the elements of the next step in the stream.
        <R> Stream<R> map(Function<? super T, ? extends R> mapper)
        This one looks more complicated than the others you have seen. It uses the
        lambda expression to figure out the type passed to that function and the
        one returned. The return type is the stream that gets returned.
        The map() method on streams is for transforming data. Don't
        confuse it with the Map interface, which maps keys to values.
        As an example, this code converts a list of String objects to a list of
        Integer objects representing their lengths.*/
        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        s3.map(String::length)
                .forEach(System.out::print); // 676

        System.out.println();
        /*flatMap()
        The flatMap() method takes each element in the stream and makes any
        elements it contains top‐level elements in a single stream. This is helpful
        when you want to remove empty elements from a stream or you want to
        combine a stream of lists. We are showing you the method signature for
        consistency with the other methods, just so you don't think we are hiding
        anything. You aren't expected to be able to read this:
                <R> Stream<R> flatMap(
                Function<? super T, ? extends Stream<? extends R>> mapper)
        This gibberish basically says that it returns a Stream of the type that the
        function contains at a lower level. Don't worry about the signature. It's a
        headache.*/
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream())
                .forEach(System.out::println);
        //Bonobo
        //Mama Gorilla
        //Baby Gorilla


    }
}
