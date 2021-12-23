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

    }
}
