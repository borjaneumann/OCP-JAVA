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
    }
    /*
    This code frequently outputs the first value in the serial stream, 1,
    although this is not guaranteed. The findAny() method is free to select
    any element on either serial or parallel streams.

     */
}
