import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _27_CollectingUsingGrouping {

    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length) // Each value in the Map is a List of all entries that match that key.
        );
        System.out.println("Grouping by(Map): " + map); //{5=[lions, bears], 6=[tigers]}
        //Note that the function you call in groupingBy() cannot return null.
        //It does not allow null keys.

        //Suppose that we don't want a List as the value in the map and prefer a Set
        //instead. No problem. There's another method signature that lets us pass a
        //downstream collector. This is a second collector that does something
        //special with the values.
        var ohMy2 = Stream.of("elephants","bears", "cats", "dogs");
        Map<Integer, Set<String>> map2 = ohMy2.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet())
        );
        System.out.println("Grouping by(Set): " + map2); //{4=[cats, dogs], 5=[bears], 9=[elephants]}

        /*We can even change the type of Map returned through yet another
        parameter.*/
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map3 = ohMy3.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map3); // {5=[lions, bears], 6=[tigers]}

        /* What if we want to change the type of Map returned
        but leave the type of values alone as a List? There isn't a method for this
        specifically because it is easy enough to write with the existing ones.*/
        var ohMy4 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map4 = ohMy4.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));//Here it is done
        System.out.println(map4);
    }

}
