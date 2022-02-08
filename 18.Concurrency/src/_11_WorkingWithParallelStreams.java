import java.util.List;

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

    2) Calling parallelStream() on a Collection Object

    The second way to create a parallel stream is from a Java Collection
    class. The Collection interface includes a method parallelStream() that
    can be called on any collection and returns a parallel stream. The
    following creates the parallel stream directly from the List object:

    Stream<Integer> s3 = List.of(1,2).parallelStream();

    The Stream interface includes a method isParallel() that can be
    used to test if the instance of a stream supports parallel processing.
    Some operations on streams preserve the parallel attribute, while
    others do not. For example, the Stream.concat(Stream s1, Stream
    s2) is parallel if either s1 or s2 is parallel. On the other hand,
    flatMap() creates a new stream that is not parallel by default,
    regardless of whether the underlying elements were parallel.

    PERFORMING A PARALLEL DECOMPOSITION
    ===================================
    As you may have noticed, creating the parallel stream is the easy part. The
    interesting part comes in performing a parallel decomposition.

    A parallel decomposition is the process of taking a task, breaking it up into smaller
    pieces that can be performed concurrently, and then reassembling the
    results. The more concurrent a decomposition, the greater the performance
    improvement of using parallel streams.

    let's define a reusable function that “does work” just by waiting for five seconds.
     */
    private static int doWork (int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }return input;
    }
    // Now let's use this method with a serial stream.
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        List.of(1,2,3,4,5)
//                .stream()
//                .map(w->doWork(w))
//                .forEach(s-> System.out.println(s + " ")); // 1 2 3 4 5
//
//        System.out.println();
//        var timeTaken = (System.currentTimeMillis()-start)/1000;
//        System.out.println("Time: " + timeTaken + " seconds"); // Time: 25 seconds

        //Now with parallel streams
        long parallelStart = System.currentTimeMillis();
        List.of(6,7,8,9,10)
                .parallelStream()
                .map(w->doWork(w))
                .forEach(s -> System.out.println(s + " ")); //9 , 7, 6, 10, 8 (the results come at the same time)

        System.out.println();
        var parallelTimeTaken = (System.currentTimeMillis()-parallelStart)/1000;
        System.out.println("Time: " + parallelTimeTaken + " seconds"); // Time: 5 seconds

        /*
        With a parallel stream, the map() and forEach() operations are applied
        concurrently.

        As you can see, the results are no longer ordered or predictable. The map()
        and forEach() operations on a parallel stream are equivalent to submitting
        multiple Runnable lambda expressions to a pooled thread executor and
        then waiting for the results.

        What about the time required? In this case, our system had enough CPUs
        for all of the tasks to be run concurrently. If you ran this same code on a
        computer with fewer processors, it might output 10 seconds, 15 seconds,
        or some other value. The key is that we've written our code to take
        advantage of parallel processing when available, so our job is done.

         */

    }
}
