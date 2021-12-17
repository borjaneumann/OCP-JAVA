import java.util.function.Predicate;

public class ImplementingPredicateAndBiPredicate {

    //Predicate is often used when filtering or matching. Both are common operations.
    // A BiPredicate is just like a Predicate except that it takes two parameters
    //instead of one.
    public static void main(String[] args) {
        //Predicate
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test("")); //true
        System.out.println(p2.test("")); //true



    }
}
