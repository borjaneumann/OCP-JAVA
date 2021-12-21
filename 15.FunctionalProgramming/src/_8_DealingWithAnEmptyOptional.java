import java.util.Optional;

public class _8_DealingWithAnEmptyOptional {

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
    }

}
