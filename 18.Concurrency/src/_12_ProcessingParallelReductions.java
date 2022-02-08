import java.util.List;

public class _12_ProcessingParallelReductions {
    /*
    PROCESSING PARALLEL REDUCTIONS
    ==============================
    Besides possibly improving performance and modifying the order of
    operations, using parallel streams can impact how you write your
    application. Reduction operations on parallel streams are referred to as
    parallel reductions. The results for parallel reductions can be different
    from what you expect when working with serial streams.
    Performing Order‐Based Tasks
    Since order is not guaranteed with parallel streams, methods such as
    findAny() on parallel streams may result in unexpected behavior. Let's
    take a look at the results of findAny() applied to a serial stream.
    */
    public static void main(String[] args) {
        System.out.print(List.of(1,2,3,4,5,6) // 1
                .stream()
                .findAny().get());
        System.out.println();
        System.out.print(List.of(1,2,3,4,5,6)
                .parallelStream()
                .findAny().get()); // 4 is the task that finishes first.
    }
    /*
    This code frequently outputs the first value in the serial stream, 1,
    although this is not guaranteed. The findAny() method is free to select
    any element on either serial or parallel streams.

    With a parallel stream, the JVM can create any number of threads to
    process the stream. When you call findAny() on a parallel stream, the
    JVM selects the first thread to finish the task and retrieves its data.

    The result is that the output could be 4, 1, or really any value in the stream.
    You can see that with parallel streams, the results of findAny() are not as
    predictable



     */
}
