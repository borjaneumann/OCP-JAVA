package _05_WorkingWithAdvancedStreamPipelineConcepts;

public class _23_0_CollectingResults {
    /*
    Examples of grouping/partitioning collectors

    Collector                           Description               Return value when passed to collect
    =============================================================================================
    averagingDouble(ToDoubleFunction f) Calculates the average
    averagingInt(ToIntFunction f)       for our three core                  Double
    averagingLong(ToLongFunction f)     primitive types
    --------------------------------------------------------------------------------------------------
    counting()                          Counts the number of                Long
                                        elements
    --------------------------------------------------------------------------------------------------
    groupingBy(Function f)              Creates a map grouping by
    groupingBy(Function f,              the specified function with
        Collector dc)                   the optional map type               Map<K, List<T>>
    groupingBy(Function f,              supplier and optional
    Supplier s,Collector dc)            downstream collector
    --------------------------------------------------------------------------------------------------
    joining(CharSequence cs)            Creates a single String using
                                        cs as a delimiter between           String
                                        elements if one is specified
    --------------------------------------------------------------------------------------------------
    maxBy(Comparator c)                 Finds the largest/smallest          Optional<T>
    minBy(Comparator c)                 elements
    --------------------------------------------------------------------------------------------------
    mapping(Function f,Collector dc)    Adds another level of collectors    Collector
    --------------------------------------------------------------------------------------------------
    partitioningBy(Predicate p)         Creates a map grouping by
    partitioningBy(Predicate p,         the specified predicate with        Map<Boolean,List<T>>
        Collector dc)                   the optional further
                                        downstream collector
    --------------------------------------------------------------------------------------------------
    summarizingDouble(ToDoubleFunction f)   Calculates average, min, max,   DoubleSummaryStatistics
    summarizingInt(ToIntFunction f)         and so on                       IntSummaryStatistics
    summarizingLong(ToLongFunction f)                                       LongSummaryStatistics
    --------------------------------------------------------------------------------------------------
    summingDouble(ToDoubleFunction f)   Calculates the sum for our          Double
    summingInt(To IntFunction f)        three core primitive types          Integer
    summingLong(ToLongFunction f)                                           Long
    --------------------------------------------------------------------------------------------------
    toList()                            Creates an arbitrary type of        List
    toSet()                             list or set                         Set
    --------------------------------------------------------------------------------------------------
    toCollection(Supplier s)            Creates a Collection of the         Collection
                                        specified type
    --------------------------------------------------------------------------------------------------
    toMap(Function k, Function v)       Creates a map using functions
    toMap(Function k, Function v,       to map the keys, values, an         Map
        BinaryOperator m)               optional merge function, and
    toMap(Function k, Function v,       an optional map type supplier
    BinaryOperator m, Supplier s)


    Collecting into Maps
    Code using Collectors involving maps can get quite long. We will build
    it up slowly. Make sure that you understand each example before going on
    to the next one. Let's start with a straightforward example to create a map
    from a stream.
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<String, Integer> map = ohMy.collect(
    Collectors.toMap(s -> s, String::length));
    System.out.println(map); // {lions=5, bears=5, tigers=6}
    When creating a map, you need to specify two functions. The first
    function tells the collector how to create the key. In our example, we use
    the provided String as the key. The second function tells the collector
    how to create the value. In our example, we use the length of the String
    as the value.
    Returning the same value passed into a lambda is a common
    operation, so Java provides a method for it. You can rewrite s ‐> s
    as Function.identity(). It is not shorter and may or may not be
    clearer, so use your judgment on whether to use it.
    Now we want to do the reverse and map the length of the animal name to
    the name itself. Our first incorrect attempt is shown here:
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map = ohMy.collect(Collectors.toMap(
    String::length,
    k -> k)); // BAD
    Running this gives an exception similar to the following:
    Exception in thread "main"
    java.lang.IllegalStateException: Duplicate key 5
    What's wrong? Two of the animal names are the same length. We didn't
    tell Java what to do. Should the collector choose the first one it
    encounters? The last one it encounters? Concatenate the two? Since the
    collector has no idea what to do, it “solves” the problem by throwing an
    exception and making it our problem. How thoughtful. Let's suppose that
    our requirement is to create a comma‐separated String with the animal
    names. We could write this:
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map = ohMy.collect(Collectors.toMap(
    String::length,
    k -> k,
    (s1, s2) -> s1 + "," + s2));
    System.out.println(map); // {5=lions,bears,
    6=tigers}
    System.out.println(map.getClass()); // class java.util.HashMap
    It so happens that the Map returned is a HashMap. This behavior is not
    guaranteed. Suppose that we want to mandate that the code return a
    TreeMap instead. No problem. We would just add a constructor reference
    as a parameter.
    var ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
    String::length,
    k -> k,
    (s1, s2) -> s1 + "," + s2,
    TreeMap::new));
    System.out.println(map); // // {5=lions,bears,
    6=tigers}
    System.out.println(map.getClass()); // class java.util.TreeMap
    This time we got the type that we specified. With us so far? This code is
    long but not particularly complicated. We did promise you that the code
    would be long!
    Collecting Using Grouping, Partitioning, and Mapping
    Great job getting this far. The exam creators like asking about
    groupingBy() and partitioningBy(), so make sure you understand these
    sections very well. Now suppose that we want to get groups of names by
    their length. We can do that by saying that we want to group by length.
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, List<String>> map = ohMy.collect(
    Collectors.groupingBy(String::length));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    The groupingBy() collector tells collect() that it should group all of the
    elements of the stream into a Map. The function determines the keys in the
    Map. Each value in the Map is a List of all entries that match that key.
    Note that the function you call in groupingBy() cannot return null.
    It does not allow null keys.
    Suppose that we don't want a List as the value in the map and prefer a Set
    instead. No problem. There's another method signature that lets us pass a
    downstream collector. This is a second collector that does something
    special with the values.
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Integer, Set<String>> map = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    Collectors.toSet()));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    We can even change the type of Map returned through yet another
    parameter.
    var ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, Set<String>> map = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    TreeMap::new,
    Collectors.toSet()));
    System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    This is very flexible. What if we want to change the type of Map returned
    but leave the type of values alone as a List? There isn't a method for this
    specifically because it is easy enough to write with the existing ones.
    var ohMy = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, List<String>> map = ohMy.collect(
    Collectors.groupingBy(
    String::length,
    TreeMap::new,
    Collectors.toList()));
    System.out.println(map);
    Partitioning is a special case of grouping. With partitioning, there are only
    two possible groups—true and false. Partitioning is like splitting a list into
    two parts.
    Suppose that we are making a sign to put outside each animal's exhibit.
    We have two sizes of signs. One can accommodate names with five or
    fewer characters. The other is needed for longer names. We can partition
    the list according to which sign we need.
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map = ohMy.collect(
    Collectors.partitioningBy(s -> s.length() <= 5));
    System.out.println(map); // {false=[tigers], true=[lions,
    bears]}
    Here we passed a Predicate with the logic for which group each animal
    name belongs in. Now suppose that we've figured out how to use a
    different font, and seven characters can now fit on the smaller sign. No
    worries. We just change the Predicate.
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Boolean, List<String>> map = ohMy.collect(
    Collectors.partitioningBy(s -> s.length() <= 7));
    System.out.println(map); // {false=[], true=[lions, tigers,
    bears]}
    Notice that there are still two keys in the map—one for each boolean
    value. It so happens that one of the values is an empty list, but it is still
    there. As with groupingBy(), we can change the type of List to
    something else.
    var ohMy = Stream.of("lions", "tigers", "bears");
    Map<Boolean, Set<String>> map = ohMy.collect(
    Collectors.partitioningBy(
    s -> s.length() <= 7,
    Collectors.toSet()));
    System.out.println(map); // {false=[], true=[lions, tigers,
    bears]}
    Unlike groupingBy(), we cannot change the type of Map that gets
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
    Collectors.mapping(
    s -> s.charAt(0),
    Collectors.minBy((a, b) -> a -b))));
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
