import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _25_CollectingUsingBasicCollectors {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions","tigers", "bears");
        String result =ohMy.collect(Collectors.joining(", "));
        System.out.println(result); //  lions, tigers, bears

        //Notice how the predefined collectors are in the Collectors class rather
        //than the Collector interface. collectors -> class, collector -> interface

        //What is the average length of the three animal names?
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Double result2 = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(result2); // 5.333333333333333

       /* Often, you'll find yourself interacting with code that was written without
        streams. This means that it will expect a Collection type rather than a
        Stream type. No problem. You can still express yourself using a Stream
        and then convert to a Collection at the end, for example:*/
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3); // [tigers]

    }

}
