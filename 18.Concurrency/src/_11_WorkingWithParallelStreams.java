public class _11_WorkingWithParallelStreams {
    /*
    One of the most powerful features of the Stream API is built‐in
    concurrency support. Up until now, all of the streams with which you have
    worked have been serial streams.

    A serial stream is a stream in which the
    results are ordered, with only one entry being processed at a time.
    A parallel stream is a stream that is capable of processing results
    concurrently (at the same time), using multiple threads.

    Using a parallel stream can change not only the performance of your
    application but also the expected results. As you shall see, some
    operations also require special handling to be able to be processed in a
    parallel manner.

    The number of threads available in a parallel stream is proportional
    to the number of available CPUs in your environment.

    CREATING PARALLEL STREAMS
    =========================

    2 Ways:

    1) Calling parallel() on an Existing Stream

    The first way to create a parallel stream is from an existing stream. You
    just call parallel() on an existing stream to convert it to one that
    supports multithreaded processing, as shown in the following code:

    Stream<Integer> s1 = List.of(1,2).stream();
    Stream<Integer> s2 = s1.parallel();

    Be aware that parallel() is an intermediate operation that operates on the
    original stream. For example, applying a terminal operation to s2 also
    makes s1 unavailable for further use.



     */
}
