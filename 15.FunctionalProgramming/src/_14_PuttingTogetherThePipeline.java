import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _14_PuttingTogetherThePipeline {
    //Streams allow you to use chaining and express what you want to
    //accomplish rather than how to do so. Let's say that we wanted to get the
    //first two names of our friends alphabetically that are four characters long.

    public static void main(String[] args) {
        //Without streams
        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name:list) {
            if(name.length() == 4) {
                filtered.add(name);
            }
        }
        Collections.sort(filtered);
        var iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
        System.out.println("Without streams: " + filtered);

        //With Streams
        //With streams, the equivalent code is as follows:
        var list2 = List.of("Toby", "Anna", "Leroy", "Alex");
        list2.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);

        System.out.println("With Streams: ");
        //Before you say that it is harder to read, we can format it.
        var list3 = List.of("Toby", "Anna", "Leroy", "Alex");
        list3.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);


    }
}
