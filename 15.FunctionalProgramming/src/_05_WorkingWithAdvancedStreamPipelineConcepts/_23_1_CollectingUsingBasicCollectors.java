package _05_WorkingWithAdvancedStreamPipelineConcepts;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _23_1_CollectingUsingBasicCollectors {
    public static void main(String[] args) {

    //Luckily, many of these collectors work in the same way. Let's look at an example.

    var ohMy = Stream.of("lions", "tigers", "bears");
    String result = ohMy.collect(Collectors.joining(", "));
    System.out.println(result); // lions, tigers, bears

    /*
    Notice how the predefined collectors are in the Collectors class rather
    than the Collector interface. This is a common theme, which you saw
    with Collection versus Collections. In fact, you'll see this pattern again
    in Chapter 20, “NIO.2,” when working with Paths and Path, and other
    related types.
    We pass the predefined joining() collector to the collect() method. All
    elements of the stream are then merged into a String with the specified
    delimiter between each element. It is important to pass the Collector to
    the collect method. It exists to help collect elements. A Collector
    doesn't do anything on its own.
    Let's try another one. What is the average length of the three animal
    names?
    */
    var ohMy1 = Stream.of("lions", "tigers", "bears");
    Double result1 =
    ohMy.collect(Collectors.averagingInt(String::length));
    System.out.println(result); // 5.333333333333333
        /*
    The pattern is the same. We pass a collector to collect(), and it performs
    the average for us. This time, we needed to pass a function to tell the
    collector what to average. We used a method reference, which returns an
    int upon execution. With primitive streams, the result of an average was
    always a double, regardless of what type is being averaged. For collectors,
    it is a Double since those need an Object.

    Often, you'll find yourself interacting with code that was written without
    streams. This means that it will expect a Collection type rather than a
    Stream type. No problem. You can still express yourself using a Stream
    and then convert to a Collection at the end, for example:
    */
    var ohMy3 = Stream.of("lions", "tigers", "bears");
    TreeSet<String> result3 = ohMy
    .filter(s -> s.startsWith("t"))
    .collect(Collectors.toCollection(TreeSet::new));
    System.out.println(result); // [tigers]
    /*
    This time we have all three parts of the stream pipeline. Stream.of() is
    the source for the stream. The intermediate operation is filter(). Finally,
    the terminal operation is collect(), which creates a TreeSet. If we didn't
    care which implementation of Set we got, we could have written
    Collectors.toSet() instead.
     */
    }
}
