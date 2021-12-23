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
                .forEach(System.out::print); // monkey

        /*distinct()
        The distinct() method returns a stream with duplicate values removed.
        The duplicates do not need to be adjacent to be removed. As you might
        imagine, Java calls equals() to determine whether the objects are the
        same.*/
        //Stream<T> distinct()
        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct()
                .forEach(System.out::print); // duckgoose

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

    }
}
