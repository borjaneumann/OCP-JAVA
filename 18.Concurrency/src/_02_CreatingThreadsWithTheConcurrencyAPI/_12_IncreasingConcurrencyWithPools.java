package _02_CreatingThreadsWithTheConcurrencyAPI;

public class _12_IncreasingConcurrencyWithPools {
    /*
    INCREASING CONCURRENCY WITH POOL
    ================================
    All of our examples up until now have been with single‐thread executors
    which, while interesting, weren't particularly useful.

    We now present three additional factory methods in the Executors class
    that act on a pool of threads, rather than on a single thread. A thread pool
    is a group of pre‐instantiated reusable threads that are available to perform
    a set of arbitrary tasks.

    Executors factory methods
    Method                                      Description
    ========================================================================================================
    ExecutorService newSingleThreadExecutor()   Creates a single‐threaded executor that uses a single
                                                worker thread operating off an unbounded queue.
                                                Results are processed sequentially in the order in which
                                                they are submitted.
    ---------------------------------------------------------------------------------------------------------
    ScheduledExecutorService                    Creates a single‐threaded executor that can schedule
    newSingleThreadScheduledExecutor()          commands to run after a given delay or to execute periodically
    ----------------------------------------------------------------------------------------------------------
    ExecutorService newCachedThreadPool()       Creates a thread pool that creates new threads as needed
                                                but will reuse previously constructed threads when they
                                                are available
    ----------------------------------------------------------------------------------------------------------
    ExecutorService newFixedThreadPool(int)     Creates a thread pool that reuses a fixed number of
                                                threads operating off a shared unbounded queue
    ----------------------------------------------------------------------------------------------------------
    ScheduledExecutorService                    Creates a thread pool that can schedule commands to run
    newScheduledThreadPool(int)                 after a given delay or to execute periodically
    ------------------------------------------------------------------------------------------------------------

    these methods return the same instance types,
    ExecutorService and ScheduledExecutorService, that we used earlier in
    this chapter. In other words, all of our previous examples are compatible
    with these new pooled‐thread executors!

    The difference between a single‐thread and a pooled‐thread executor is
    what happens when a task is already running. While a single‐thread
    executor will wait for a thread to become available before running the next
    task, a pooled‐thread executor can execute the next task concurrently. If
    the pool runs out of available threads, the task will be queued by the
    thread executor and wait to be completed.

    The newFixedThreadPool() takes a number of threads and allocates them
    all upon creation. As long as our number of tasks is less than our number
    of threads, all tasks will be executed concurrently. If at any point the
    number of tasks exceeds the number of threads in the pool, they will wait
    in a similar manner as you saw with a single‐thread executor. In fact,
    calling newFixedThreadPool() with a value of 1 is equivalent to calling
    newSingleThreadExecutor().

    The newCachedThreadPool() method will create a thread pool of
    unbounded size, allocating a new thread anytime one is required or all
    existing threads are busy. This is commonly used for pools that require
    executing many short‐lived asynchronous tasks. For long‐lived processes,
    usage of this executor is strongly discouraged, as it could grow to
    encompass a large number of threads over the application life cycle.

    The newScheduledThreadPool() is identical to the
    newFixedThreadPool() method, except that it returns an instance of
    ScheduledExecutorService and is therefore compatible with scheduling
    tasks.

    CHOOSING A POOL SIZE
    ====================
    In practice, choosing an appropriate pool size requires some thought.
    In general, you want at least a handful more threads than you think
    you will ever possibly need. On the other hand, you don't want to
    choose so many threads that your application uses up too many
    resources or too much CPU processing power. Oftentimes, the
    number of CPUs available is used to determine the thread pool size
    using this command:
     */
    public static void main(String[] args) {
        int processors = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors:" + processors); //12
    }
    /*
    It is a common practice to allocate threads based on the number of CPUs.
     */
}
