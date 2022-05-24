package _05_WorkingWithAdvancedStreamPipelineConcepts;

public class _23_CollectingResults {
    /*
    Examples of grouping/partitioning collectors
    Collector Description Return value when
    Collector Description
    passed to collect
    averagingDoubl
    e(ToDoubleFunc
    tion f)
    averagingInt(
    ToIntFunction
    f)
    averagingLong
    (ToLongFunctio
    n f)
    Calculates the average for our
    three core primitive types Double
    counting()
    Counts the number of
    elements Long
    groupingBy(Fun
    ction f)
    groupingBy(Fu
    nction f,
    Collector dc)
    groupingBy(Fu
    nction f,
    Supplier s,
    Collector dc)
    Creates a map grouping by
    the specified function with
    the optional map type
    supplier and optional
    downstream collector
    Map<K, List<T>>
    joining(CharSe
    quence cs)
    Creates a single String using
    cs as a delimiter between
    elements if one is specified
    String
    maxBy(Comparat
    or c)
    minBy(Compara
    tor c)
    Finds the largest/smallest
    elements Optional<T>
    mapping(Functi
    on f,
    Collector dc)
    Adds another level of
    collectors Collector
    partitioningBy
    (Predicate p)
    partitioningB
    y(Predicate p,
    Collector dc)
    Creates a map grouping by
    the specified predicate with
    the optional further
    downstream collector
    Map<Boolean,
    List<T>>
    summarizingDou
    ble(ToDoubleFu
    nction f)
    summarizingIn
    t(ToIntFunctio
    n f)
    summarizingLo
    ng(ToLongFunct
    ion f)
    Calculates average, min, max,
    and so on DoubleSummarySta
    tistics
    IntSummaryStatis
    tics
    LongSummaryStati
    stics
    summingDouble(
    ToDoubleFuncti
    on f)
    summingInt(To
    IntFunction f)
    summingLong(T
    oLongFunction
    f)
    Calculates the sum for our
    three core primitive types Double
    Integer
    Long
    toList()
    toSet()
    Creates an arbitrary type of
    list or set List
    Set
    toCollection(S
    upplier s)
    Creates a Collection of the
    specified type Collection
    toMap(Function
    k, Function v)
    toMap(Functio
    n k, Function
    Creates a map using functions
    to map the keys, values, an
    optional merge function, and
    an optional map type supplier
    Map
    n k, Function
    v,
    BinaryOperator
    m)
    toMap(Functio
    n k, Function
    v,
    BinaryOperator
    m, Supplier s)
    an optional map type supplier
    Collecting Using Basic Collectors
    Luckily, many of these collectors work in the same way. Let's look at an
    example.
    var ohMy = Stream.of("lions", "tigers", "bears");
    String result = ohMy.collect(Collectors.joining(", "));
    System.out.println(result); // lions, tigers, bears
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
    var ohMy = Stream.of("lions", "tigers", "bears");
    Double result =
    ohMy.collect(Collectors.averagingInt(String::length));
    System.out.println(result); // 5.333333333333333
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
    var ohMy = Stream.of("lions", "tigers", "bears");
    TreeSet<String> result = ohMy
    .filter(s -> s.startsWith("t"))
    .collect(Collectors.toCollection(TreeSet::new));
    System.out.println(result); // [tigers]
    This time we have all three parts of the stream pipeline. Stream.of() is
    the source for the stream. The intermediate operation is filter(). Finally,
    the terminal operation is collect(), which creates a TreeSet. If we didn't
    care which implementation of Set we got, we could have written
    Collectors.toSet() instead.
    At this point, you should be able to use all of the Collectors in Table
    15.13 except groupingBy(), mapping(), partitioningBy(), and toMap().
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
