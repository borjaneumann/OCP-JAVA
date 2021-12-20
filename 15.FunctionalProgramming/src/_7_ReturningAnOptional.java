import java.util.Optional;

public class _7_ReturningAnOptional {

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
    public static void main(String[] args) {


        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty
    }
}
