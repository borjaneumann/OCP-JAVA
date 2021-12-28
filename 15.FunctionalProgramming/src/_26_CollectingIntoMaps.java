import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _26_CollectingIntoMaps {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap( s -> s, String::length)
        );
        System.out.println(map);
        //When creating a map, you need to specify two functions. The first
        //function tells the collector how to create the key. In our example, we use
        //the provided String as the key. The second function tells the collector
        //how to create the value. In our example, we use the length of the String
        //as the value.

        /*NOTE: Returning the same value passed into a lambda is a common
        operation, so Java provides a method for it. You can rewrite s ‐> s
        as Function.identity(). It is not shorter and may or may not be
        clearer, so use your judgment on whether to use it.*/

        var ohMy1 = Stream.of("lions", "tigers", "bears");
//        Map<Integer, String> map1 = ohMy1.collect(Collectors.toMap(
//                String::length,
//                k -> k)); // BAD
        /*Running this gives an exception similar to the following:
        Exception in thread "main"
        java.lang.IllegalStateException: Duplicate key 5, KEYS CANNOT BE DUPLICATED*/

        /*Let's suppose that our requirement is to create a comma‐separated String with the animal
        names. We could write this: */
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map2 = ohMy2.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2)
        );
        System.out.println(map2); //{5=lions,bears, 6=tigers}
        System.out.println(map2.getClass()); //class java.util.HashMap

        //Suppose that we want to mandate that the code return a TreeMap instead.
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map3 = ohMy3.collect(Collectors.toMap(
                String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2,
                TreeMap::new));
        System.out.println(map3); // // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class java.util.TreeMap
    }

}
