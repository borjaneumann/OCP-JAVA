import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _6_ConvenienceMethodsOnFunctionalInterfaces {

    /*By definition, all functional interfaces have a single abstract method. This
    doesn't mean they can have only one method, though. Several of the
    common functional interfaces provide a number of helpful default methods.*/

    //All of these facilitate
    //modifying or combining functional interfaces of the same type

    public static void main(String[] args) {

        //PREDICATE
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

        /*Now we want a Predicate for brown eggs and another for all other colors
        of eggs. We could write this by hand, as shown here:*/

        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggsColors = s -> s.contains("egg") && ! s.contains("brown");

        //It's a bit long to read
        //A better way to deal with this situation is to use two of the default
        //methods on Predicate.
        Predicate<String> brownEggs1 = egg.and(brown);
        Predicate<String> otherEggsColors1 = egg.and(brown.negate());

        //CONSUMER
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.println(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie"); // 1: Annie,2: Annie

        //FUNCTION
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined1 = after.compose(before); //3 + 1 = 4 -> 4 * 2 = 8;
        System.out.print("Function(compose): ");
        System.out.print(combined1.apply(3)); // 8
    }
}
