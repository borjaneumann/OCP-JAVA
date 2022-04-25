import java.util.Optional;

public class _9_DealingWithAnEmptyOptional {

    //The remaining methods allow you to specify what to do if a value isn't
    //present.
    public static Optional<Double> average (int... scores) {
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> opt = average(); //The value is not present then the code below is executed.
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(()->Math.random()));

        //Alternatively, we can have the code throw an exception if the Optional is empty.
        Optional<Double> opt1 = average();
        System.out.println(opt1.orElseThrow()); //Throws NoSuchElementException

        //Alternatively, we can have the code throw an exception if the Optional is
        //empty.
        Optional<Double> opt3 = average();
        System.out.println(opt3.orElseThrow(() -> new IllegalStateException())); //Supplier creates an exception that should be thrown.
        //We dont use the word throw, orElseThrow takes care of it.

        //Does it compile?
        //System.out.println(opt.orElseGet(() -> new IllegalStateException()));//nope it is expecting to return Double

        //Does it compile?
        Optional<Double> opt4 = average(90,70);
        System.out.println(opt4.orElse(Double.NaN)); //80
        System.out.println(opt4.orElseGet(()->Math.random()));//80
        System.out.println(opt4.orElseThrow());//80

    }

}
