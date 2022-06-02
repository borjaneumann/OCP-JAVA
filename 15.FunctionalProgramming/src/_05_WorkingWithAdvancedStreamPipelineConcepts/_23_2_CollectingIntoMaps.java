package _05_WorkingWithAdvancedStreamPipelineConcepts;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _23_2_CollectingIntoMaps {
    public static void main(String[] args) {
        /*
    Code using Collectors involving maps can get quite long. We will build
    it up slowly. Make sure that you understand each example before going on
    to the next one. Let's start with a straightforward example to create a map
    from a stream.*/
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length));
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    /*
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
    the name itself. Our first incorrect attempt is shown here:*/

    var ohMy2 = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map2 = ohMy.collect(Collectors.toMap(
    String::length,k -> k)); // BAD
    /*
    Running this gives an exception similar to the following:
    Exception in thread "main" java.lang.IllegalStateException: Duplicate key 5

    What's wrong? Two of the animal names are the same length. We didn't
    tell Java what to do. Should the collector choose the first one it
    encounters? The last one it encounters? Concatenate the two? Since the
    collector has no idea what to do, it “solves” the problem by throwing an
    exception and making it our problem. How thoughtful. Let's suppose that
    our requirement is to create a comma‐separated String with the animal
    names. We could write this:*/

    var ohMy3 = Stream.of("lions", "tigers", "bears");
    Map<Integer, String> map3 = ohMy.collect(Collectors.toMap(
    String::length,
    k -> k,
    (s1, s2) -> s1 + "," + s2));
    System.out.println(map); // {5=lions,bears,6=tigers}
    System.out.println(map.getClass()); // class java.util.HashMap
    /*
    It so happens that the Map returned is a HashMap. This behavior is not
    guaranteed. Suppose that we want to mandate that the code return a
    TreeMap instead. No problem. We would just add a constructor reference
    as a parameter.*/

    var ohMy4 = Stream.of("lions", "tigers", "bears");
    TreeMap<Integer, String> map4 = ohMy.collect(Collectors.toMap(
    String::length,
    k -> k,
    (s1, s2) -> s1 + "," + s2,
    TreeMap::new));
    System.out.println(map); // // {5=lions,bears,6=tigers}
    System.out.println(map.getClass()); // class java.util.TreeMap
        /*
    This time we got the type that we specified. With us so far? This code is
    long but not particularly complicated. We did promise you that the code
    would be long!
     */
    }

}
