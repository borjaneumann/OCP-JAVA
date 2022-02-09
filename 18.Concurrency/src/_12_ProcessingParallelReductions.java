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

    Any stream operation that is based on order, including findFirst(),
    limit(), or skip(), may actually perform more slowly in a parallel
    environment. This is a result of a parallel processing task being forced to
    coordinate all of its threads in a synchronized‐like fashion.
    On the plus side, the results of ordered operations on a parallel stream will
    be consistent with a serial stream. For example, calling
    skip(5).limit(2).findFirst() will return the same result on ordered
    serial and parallel streams.

    CREATING UNORDERED STREAMS
    ==========================
    All of the streams with which you have been working are considered
    ordered by default. It is possible to create an unordered stream from
    an ordered stream, similar to how you create a parallel stream from a
    serial stream:
    List.of(1,2,3,4,5,6).stream().unordered();
    This method does not actually reorder the elements; it just tells the
    JVM that if an order‐based stream operation is applied, the order can
    be ignored. For example, calling skip(5) on an unordered stream
    will skip any 5 elements, not the first 5 required on an ordered
    stream.
    For serial streams, using an unordered version has no effect, but on
    parallel streams, the results can greatly improve performance.
    List.of(1,2,3,4,5,6).stream().unordered().parallel();
    Even though unordered streams will not be on the exam, if you are
    developing applications with parallel streams, you should know
    when to apply an unordered stream to improve performance.

    Combining results with reduce()
    -------------------------------
    Identity, accumulator and combiner.

    <U> U reduce(U identity,
    BiFunction<U,? super T,U> accumulator,
    BinaryOperator<U> combiner)

    We can concatenate a list of char values, using the reduce() method, as
    shown in the following example:

    System.out.println(List.of('w', 'o', 'l', 'f')
    .parallelStream()
    .reduce("",
    (s1,c) -> s1 + c,
    (s2,s3) -> s2 + s3)); // wolf

    The naming of the variables in this stream example is not accidental.
    We used c for char, whereas s1, s2, and s3 are String values.
    On parallel streams, the reduce() method works by applying the
    reduction to pairs of elements within the stream to create intermediate
    values and then combining those intermediate values to produce a final
    result. Put another way, in a serial stream, wolf is built one character at a
    time. In a parallel stream, the intermediate values wo and lf are created
    and then combined

    With parallel streams, we now have to be concerned about order. What if
    the elements of a string are combined in the wrong order to produce wlfo
    or flwo? The Stream API prevents this problem, while still allowing
    streams to be processed in parallel, as long as you follow one simple rule:
    make sure that the accumulator and combiner work regardless of the order
    they are called in. For example, if we add numbers, we can do so in any
    order.

    While the requirements for the input arguments to the reduce()
    method hold true for both serial and parallel streams, you may not
    have noticed any problems in serial streams because the result was
    always ordered. With parallel streams, though, order is no longer
    guaranteed, and any argument that violates these rules is much more
    likely to produce side effects or unpredictable results.

    Let's take a look at an example using a problematic accumulator. In
    particular, order matters when subtracting numbers; therefore, the
    following code can output different values depending on whether you use
    a serial or parallel stream. We can omit a combiner parameter in these
    examples, as the accumulator can be used when the intermediate data
    types are the same.

    System.out.println(List.of(1,2,3,4,5,6)
    .parallelStream()
    .reduce(0, (a,b) -> (a - b))); // PROBLEMATIC ACCUMULATOR

    It may output ‐21, 3, or some other value.







     */
}
