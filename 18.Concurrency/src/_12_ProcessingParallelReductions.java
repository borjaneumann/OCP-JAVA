import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

    You can see other problems if we use an identity parameter that is not
    truly an identity value. For example, what do you expect the following code to output?

    System.out.println(List.of("w","o","l","f")
    .parallelStream()
    .reduce("X", String::concat)); // XwXoXlXf

    On a serial stream, it prints Xwolf, but on a parallel stream the result is
    XwXoXlXf. As part of the parallel process, the identity is applied to
    multiple elements in the stream, resulting in very unexpected data

    SELECTING A REDUCE() METHOD
    ===========================
    Although the one‐ and two‐argument versions of reduce() do
    support parallel processing, it is recommended that you use the
    three‐argument version of reduce() when working with parallel
    streams. Providing an explicit combiner method allows the JVM to
    partition the operations in the stream more efficiently.

    Combining Results with collect()
    ================================
    Like reduce(), the Stream API includes a three‐argument version of
    collect() that takes accumulator and combiner operators, along with a
    supplier operator instead of an identity.
    <R> R collect(Supplier<R> supplier,
    BiConsumer<R, ? super T> accumulator,
    BiConsumer<R, R> combiner)
    Also, like reduce(), the accumulator and combiner operations must be
    able to process results in any order. In this manner, the three‐argument
    version of collect() can be performed as a parallel reduction, as shown
    in the following example:
    */
    public static class CombiningResultsWithCollect{
        public static void main(String[] args) {
            Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
            SortedSet<String> set =
                    stream.collect(ConcurrentSkipListSet::new,
                            Set::add,
                            Set::addAll);
            System.out.println(set); // [f, l, o, w]
        }
    }
   /*
    Recall that elements in a ConcurrentSkipListSet are sorted according to
    their natural ordering. You should use a concurrent collection to combine
    the results, ensuring that the results of concurrent threads do not cause a
    ConcurrentModificationException.

    Performing parallel reductions with a collector requires additional
    considerations. For example, if the collection into which you are inserting
    is an ordered data set, such as a List, then the elements in the resulting
    collection must be in the same order, regardless of whether you use a
    serial or parallel stream. This may reduce performance, though, as some
    operations are unable to be completed in parallel

    Performing a Parallel Reduction on a Collector
    ==============================================
    While we covered the Collector interface we didn't go into
    detail about its properties. Every Collector instance defines a
    characteristics() method that returns a set of
    Collector.Characteristics attributes. When using a Collector to
    perform a parallel reduction, a number of properties must hold true.
    Otherwise, the collect() operation will execute in a single‐threaded
    fashion.

    Requirements for Parallel Reduction with collect()
    ---------------------------------------------------
    * The stream is parallel.
    * The parameter of the collect() operation has the Characteristics.CONCURRENT characteristic.
    * Either the stream is unordered or the collector has the characteristic Characteristics.UNORDERED.

    For example, while Collectors.toSet() does have the UNORDERED
    characteristic, it does not have the CONCURRENT characteristic. Therefore,
    the following is not a parallel reduction even with a parallel stream:

    stream.collect(Collectors.toSet()); // Not a parallel reduction

    The Collectors class includes two sets of static methods for retrieving
    collectors, toConcurrentMap() and groupingByConcurrent(), that are
    both UNORDERED and CONCURRENT.

    toConcurrentMap()
     */
    static class ParallelReductionWithCollectToConcurrentMap {
       public static void main(String[] args) {
           Stream<String> ohMy = Stream.of("lions", "tigers","bears").parallel();
           ConcurrentMap<Integer,String> map = ohMy.collect(
                   Collectors.toConcurrentMap(
                           String::length,
                           k-> k,
                           (s1,s2) -> s1 + "," + s2)
           );
           System.out.println(map); // {5=bears,lions, 6=tigers}
           System.out.println(map.getClass()); // class java.util.concurrent.ConcurrentHashMap
       }
    }
    /*
    We use a ConcurrentMap reference, although the actual class returned is
    likely ConcurrentHashMap. The particular class is not guaranteed; it will
    just be a class that implements the interface ConcurrentMap.

    groupingByConcurrent()
    */
    static class ParallelReductionWithCollectGroupingByConcurrent{
        public static void main(String[] args) {
            var ohmy = Stream.of("lions","tigers","bears").parallel();
            ConcurrentMap<Integer, List<String>> map = ohmy.collect(
                    Collectors.groupingByConcurrent(String::length)
            );
            System.out.println(map); //{5=[bears, lions], 6=[tigers]}
        }
    }
    /*
    As before, the returned object can be assigned a ConcurrentMap reference

    ENCOURAGING PARALLEL PROCESSING
    ===============================
    Guaranteeing that a particular stream will perform reductions in
    parallel, as opposed to single‐threaded, is often difficult in practice.
    For example, the one‐argument reduce() operation on a parallel
    stream may perform concurrently even when there is no explicit
    combiner argument. Alternatively, you may expect some collectors
    to perform well on a parallel stream, resorting to single‐threaded
    processing at runtime.

    The key to applying parallel reductions is to encourage the JVM to
    take advantage of the parallel structures, such as using a
    groupingByConcurrent() collector on a parallel stream rather than
    a groupingBy() collector. By encouraging the JVM to take
    advantage of the parallel processing, we get the best possible
    performance at runtime.
     */
    /*
    AVOIDING STATEFUL OPERATIONS
    ============================
    Side effects can appear in parallel streams if your lambda expressions are
    stateful. A stateful lambda expression is one whose result depends on any
    state that might change during the execution of a pipeline. On the other
    hand, a stateless lambda expression is one whose result does not depend
    on any state that might change during the execution of a pipeline.

    Let's try an example. Imagine we require a method that keeps only even
    numbers in a stream and adds them to a list. Also, we want ordering of the
    numbers in the stream and list to be consistent. The following
    addValues() method accomplishes this:
     */
    public static class AvoidingStatefulOperations {

        public static List<Integer> addValues(IntStream source) {
            var data = Collections.synchronizedList(
                    new ArrayList<Integer>()
            );
            source.filter(s -> s % 2 == 0)
                    .forEach(i->{data.add(i);}); //STATEFUL : DON'T DO THIS!
            return data;
        }

        public static void main(String[] args) {
            var list = addValues(IntStream.range(1,11)); //[2, 4, 6, 8, 10]
            System.out.println("Non Parallel List: " + list);

            //But what if someone else wrote an implementation that passed our method
            //a parallel stream?
            var parallelList = addValues(IntStream.range(1, 11).parallel());
            System.out.println("Parallel List: " + parallelList); //[6, 8, 10, 2, 4] Order is not guaranteed
        }
    }

}
