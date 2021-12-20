import java.util.function.Predicate;

public class _6_ConvenienceMethodsOnFunctionalInterfaces {

    /*By definition, all functional interfaces have a single abstract method. This
    doesn't mean they can have only one method, though. Several of the
    common functional interfaces provide a number of helpful default methods.*/

    //All of these facilitate
    //modifying or combining functional interfaces of the same type

    public static void main(String[] args) {
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
    }
}
