import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        //Make sense? Let's try a few more examples to make sure that you
        //understand this well. What do you think the following does?
        Stream.generate(() -> "Elsa") //Elsa is repeated infinitely.
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
        //It actually hangs until you kill the program or it throws an exception after
        //running out of memory. The foreman has instructed sorted() to wait until
        //everything to sort is present. That never happens because there is an
        //infinite stream. What about this example?
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2) //sorted() needs a finite list to sort
                .sorted()
                .forEach(System.out::println);
        //This one prints Elsa twice.

        //what do you think this does?
        Stream.generate(()->"Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach((System.out::println));
        //The filter doesn't allow anything through, so limit() never sees two elements

        //You can even chain two pipelines together.
        long count = Stream.of("goldfish", "finch")
                .filter(s->s.length()>5)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println(count); //1
        //Lines 30–32 are one pipeline, and lines 33 and 34 are another. For the first
        //pipeline, line 30 is the source, and line 32 is the terminal operation. For
        //the second pipeline, line 33 is the source, and line 34 is the terminal
        //operation. Now that's a complicated way of outputting the number 1!

        //You can even rewrite the code in your head to have a variable in between so it isn't
        //as long and complicated. Our prior example can be written as follows:
        List<String> helper = Stream.of("goldfish","finch")
                .filter(s-> s.length()>5)
                .collect(Collectors.toList());
        long count1 = helper.stream().count();
        System.out.println(count1);


    }
}
