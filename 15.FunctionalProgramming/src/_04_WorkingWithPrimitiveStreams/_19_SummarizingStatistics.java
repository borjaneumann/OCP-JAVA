package _04_WorkingWithPrimitiveStreams;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class _21_SummarizingStatistics {
    //You've learned enough to be able to get the maximum value from a stream
    //of int primitives. If the stream is empty, we want to throw an exception.
    //See max example above.
    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }
    //Now we want to change the method to take an IntStream and return a
    //range. The range is the minimum value subtracted from the maximum
    //value.
    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax()-stats.getMin();//this is the range
    }

    /*Summary statistics include the following:
    * Smallest number (minimum): getMin()
    * Largest number (maximum): getMax()
    * Average: getAverage()
    * Sum: getSum()
    * Number of values: getCount()
    If the stream were empty, we'd have a count and sum of zero. The other
    methods would return an empty optional.*/

}
