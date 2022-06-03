package _05_WorkingWithAdvancedStreamPipelineConcepts;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _23_3_CollectingUsingGrouping_PartitioningAndMapping {
    public static void main(String[] args) {
    /*
    The exam creators like asking about groupingBy() and partitioningBy(),
    so make sure you understand these sections very well.
    Now suppose that we want to get groups of names by
    their length. We can do that by saying that we want to group by length.
    */
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map = ohMy.collect(
    Collectors.groupingBy(String::length));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    /*
    The groupingBy() collector tells collect() that it should group all of the
    elements of the stream into a Map. The function determines the keys in the
    Map. Each value in the Map is a List of all entries that match that key.
    Note that the function you call in groupingBy() cannot return null.
    It does not allow null keys.
    Suppose that we don't want a List as the value in the map and prefer a Set
    instead. No problem. There's another method signature that lets us pass a
    downstream collector. This is a second collector that does something
    special with the values.
    */
    var ohMy1 = Stream.of("lions", "tigers", "bears");
    Map<Integer, Set<String>> map1 = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    Collectors.toSet()));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}

    //We can even change the type of Map returned through yet another parameter.

    var ohMy2 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Set<String>> map2 = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    TreeMap::new,
    Collectors.toSet()));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    /*
    This is very flexible. What if we want to change the type of Map returned
    but leave the type of values alone as a List? There isn't a method for this
    specifically because it is easy enough to write with the existing ones.*/

    var ohMy3 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, List<String>> map3 = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    TreeMap::new,
    Collectors.toList()));
    System.out.println(map);

    /*Partitioning is a special case of grouping. With partitioning, there are only
    two possible groups—true and false. Partitioning is like splitting a list into
    two parts.
    Suppose that we are making a sign to put outside each animal's exhibit.
    We have two sizes of signs. One can accommodate names with five or
    fewer characters. The other is needed for longer names. We can partition
    the list according to which sign we need.*/

    var ohMy4 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map4 = ohMy.collect(
    Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map); // {false=[tigers], true=[lions,bears]}

    /*Here we passed a Predicate with the logic for which group each animal
    name belongs in. Now suppose that we've figured out how to use a
    different font, and seven characters can now fit on the smaller sign. No
    worries. We just change the Predicate.*/

    var ohMy5 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map5 = ohMy.collect(
    Collectors.partitioningBy(s -> s.length() <= 7));
    System.out.println(map); // {false=[], true=[lions, tigers,bears]}

    /*Notice that there are still two keys in the map—one for each boolean
    value. It so happens that one of the values is an empty list, but it is still
    there. As with groupingBy(), we can change the type of List to
    something else.*/

    var ohMy6 = Stream.of("lions", "tigers", "bears");
    Map<Boolean, Set<String>> map6 = ohMy.collect(
    Collectors.partitioningBy(
    s -> s.length() <= 7,
    Collectors.toSet()));
    System.out.println(map); // {false=[], true=[lions, tigers,bears]}

    /*Unlike groupingBy(), we cannot change the type of Map that gets
    returned. However, there are only two keys in the map, so does it really
    matter which Map type we use?
    Instead of using the downstream collector to specify the type, we can use
    any of the collectors that we've already shown. For example, we can group
    by the length of the animal name to see how many of each length we have.

    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Long> map = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    Collectors.counting()));
    System.out.println(map); // {5=2, 6=1}

    DEBUGGING COMPLICATED GENERICS
    ==============================
    When working with collect(), there are often many levels of
    generics, making compiler errors unreadable. Here are three useful
    techniques for dealing with this situation:
    Start over with a simple statement and keep adding to it. By making
    one tiny change at a time, you will know which code introduced the
    error.
    Extract parts of the statement into separate statements. For example,
    try writing Collectors.groupingBy(String::length,
    Collectors.counting());. If it compiles, you know that the
    problem lies elsewhere. If it doesn't compile, you have a much
    shorter statement to troubleshoot.
    Use generic wildcards for the return type of the final statement; for
    example, Map<?, ?>. If that change alone allows the code to
    compile, you'll know that the problem lies with the return type not
    being what you expect.
    Finally, there is a mapping() collector that lets us go down a level and add
    another collector. Suppose that we wanted to get the first letter of the first
    animal alphabetically of each length. Why? Perhaps for random sampling.
    The examples on this part of the exam are fairly contrived as well. We'd
    write the following:

    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Optional<Character>> map = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    Collectors.mapping(s -> s.charAt(0),Collectors.minBy((a, b) -> a -b))));
    System.out.println(map); // {5=Optional[b], 6=Optional[t]}

    We aren't going to tell you that this code is easy to read. We will tell you
    that it is the most complicated thing you need to understand for the exam.
    Comparing it to the previous example, you can see that we replaced
    counting() with mapping(). It so happens that mapping() takes two
    parameters: the function for the value and how to group it further.
    You might see collectors used with a static import to make the code
    shorter. The exam might even use var for the return value and less
    indentation than we used. This means that you might see something like
    this:

    var ohMy = Stream.of("lions", "tigers", "bears");
    var map = ohMy.collect(groupingBy(String::length,
    mapping(s -> s.charAt(0), minBy((a, b) -> a -b))));
    System.out.println(map); // {5=Optional[b], 6=Optional[t]}

    The code does the same thing as in the previous example. This means that
    it is important to recognize the collector names because you might not
    have the Collectors class name to call your attention to it.
    There is one more collector called reducing(). You don't need to
    know it for the exam. It is a general reduction in case all of the
    previous collectors don't meet your needs.
         */
    }
}
