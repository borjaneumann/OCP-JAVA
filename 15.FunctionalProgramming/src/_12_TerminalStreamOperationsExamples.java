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
    }
}
