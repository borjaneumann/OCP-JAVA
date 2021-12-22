import java.util.Optional;
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


    }
}
