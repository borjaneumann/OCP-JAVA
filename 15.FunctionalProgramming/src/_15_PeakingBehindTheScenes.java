import java.util.stream.Stream;

public class _15_PeakingBehindTheScenes {
    public static void main(String[] args) {
        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print); // 135

    }
}
