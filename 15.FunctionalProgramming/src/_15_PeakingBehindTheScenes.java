import java.util.List;
import java.util.stream.Stream;

public class _15_PeakingBehindTheScenes {
    /*The peek() method is useful for seeing how a stream pipeline works
    behind the scenes. Remember that the methods run against each
    element one at a time until processing is done.*/

    public static void main(String[] args) {
        var infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
            .filter(x -> x % 2 == 1)
            .forEach(System.out::println);// 135 (1, 3, 5)

        //Now what do you think this prints?
        var infinite2 = Stream.iterate(1, x -> x + 1);
        infinite2.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print); //11233455




    }
}
