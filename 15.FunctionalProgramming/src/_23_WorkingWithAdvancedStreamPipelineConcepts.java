import java.util.ArrayList;
import java.util.Optional;

public class _23_WorkingWithAdvancedStreamPipelineConcepts {
    public static void main(String[] args) {
        //LINKING STREAMS TO THE UNDERLYING DATA
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream(); //Remember that
        //streams are lazily evaluated. This means that the stream isn't actually
        //created on  this line. An object is created that knows where to look for the
        //data when it is needed
        cats.add("KC");
        System.out.println(stream.count()); // 3

        threeDigit(Optional.of(234456));//doesn't print anything
        threeDigit(Optional.of(123));
        threeDigit(Optional.of(4));
        threeDigit(Optional.of(null));

        threeDigitFunctional(Optional.of(456));
        threeDigitFunctional(Optional.of(567890));
        threeDigitFunctional(Optional.of(4));
    }
    //CHAINING OPTIONALS
    /*Suppose that you are given an Optional<Integer> and asked to print the
    value, but only if it is a three‐digit number. Without functional
    programming, you could write the following:*/
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }
    // It works, but it contains nested if statements. That's extra complexity.
    // Let's try this again with functional programming.
    private static void threeDigitFunctional(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
//    Now suppose that we wanted to get an Optional<Integer> representing
//    the length of the String contained in another Optional. Easy enough.
//    Optional<Integer> result = optional.map(String::length);






}
