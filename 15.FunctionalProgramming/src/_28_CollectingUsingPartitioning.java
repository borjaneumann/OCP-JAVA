import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.minBy;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _28_CollectingUsingPartitioning {
    public static void main(String[] args) {
        //Partitioning is a special case of grouping. With partitioning, there are only
        //two possible groups—true and false. Partitioning is like splitting a list into
        //two parts.

        //Suppose that we are making a sign to put outside each animal's exhibit.
        //We have two sizes of signs. One can accommodate names with five or
        //fewer characters. The other is needed for longer names.
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers], true=[lions,bears]}

        //Now suppose that we've figured out how to use a
        //different font, and seven characters can now fit on the smaller sign.
        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map1 = ohMy1.collect(
                Collectors.partitioningBy(s -> s.length() <= 7)// We just change the predicate.
        );
        System.out.println(map1);

        /*As with groupingBy(), we can change the type of List to
        something else.*/
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map2 = ohMy2.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map2); // {false=[], true=[lions, tigers,bears]}
        //Unlike groupingBy(), we cannot change the type of Map that gets
        //returned. However, there are only two keys in the map, so does it really
        //matter which Map type we use? we can do sth else instead
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map3 = ohMy3.collect(
                groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map3); // {5=2, 6=1}

        //Finally, there is a mapping() collector that lets us go down a level and add
        //another collector. Suppose that we wanted to get the first letter of the first
        //animal alphabetically of each length.
        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map4 = ohMy4.collect(
                groupingBy(
                        String::length,
                        mapping(
                                s -> s.charAt(0),
                                minBy((a, b) -> a - b))
                )
        );
        System.out.println(map4);//{5=Optional[b], 6=Optional[t]}

        //We will tell you that it is the most complicated thing you need to understand for the exam.
       /* You might see collectors used with a static import to make the code
        shorter. The exam might even use var for the return value and less
        indentation than we used. This means that you might see something like
        this:*/
        var ohMy5 = Stream.of("lions", "tigers", "bears");
        var map5 = ohMy5.collect(groupingBy(String::length, //var map5 no key value indicattion
                mapping(s -> s.charAt(0), minBy((a, b) -> a -b))));
        System.out.println(map5); // {5=Optional[b], 6=Optional[t]}

        /*it is important to recognize the collector names because you might not
        have the Collectors class name to call your attention to it.
        There is one more collector called reducing(). You don't need to
        know it for the exam. It is a general reduction in case all of the
        previous collectors don't meet your needs.
         */

    }
}
