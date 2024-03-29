package _02_ReturningAnOptional;

import java.util.Calendar;
import java.util.Optional;

public class _8_CreatingAnOptional {

    //How do we express this “we don't know” or “not applicable” answer in
    //Java? We use the Optional type.
    public static Optional<Double> average (int... scores) {

        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }
    //You can see that one Optional contains a value and the other is empty.
    //Normally, we want to check whether a value is there and/or get it out of
    //the box. Here's one way to do that:

    public static void main(String[] args) {
        //EXAMPLE 1
        System.out.println("Example 1: " + average(90, 100)); // Optional[95.0]
        System.out.println("Example 1: " + average()); // Optional.empty

        //EXAMPLE 2
        Optional<Double> opt = average(90,100);
        if (opt.isPresent()){
            System.out.println("Example 2: " + opt.get());//95.0 //it prints it out.
        }

        //EXAMPLE 3
        //What if we didn't do the check and the Optional was empty?
        Optional<Double> optNotChecking = average();
        System.out.println(opt.get()); //java.util.NoSuchElementException: No value present

        //EXAMPLE 4
        /*When creating an Optional, it is common to want to use empty() when
        the value is null. You can do this with an if statement or ternary
        operator.*/
        String value = "anyValue";
        Optional o = (value == null) ? Optional.empty(): Optional.of(value);

        //If value is null, o is assigned the empty Optional. Otherwise, we wrap
        //the value. Since this is such a common pattern, Java provides a factory
        //method to do the same thing
        Optional factory = Optional.ofNullable(value);
        //Calendar c = Calendar.getInstance(); factory method example

        //get() and ifPresent() need an if statement
        //The following lines can be written in one single line.

        //ifPresent(Consumer c), isPresent(), orElse(T other), orElseGet(Supplier s), orElseThrow(), orElseThrow(Supplier s)

        //Instead of using an if statement, which we used when checking the average earlier, we can
        //specify a Consumer to be run when there is a value inside the Optional. When there isn't, the method simply skips running the Consumer

        Optional<Double> opt2 = average(90,100,70);
        opt2.ifPresent(System.out::println);

        //Using ifPresent() better expresses our intent. We want something done
        //if a value is present. You can think of it as an if statement with no else.


    }
}
