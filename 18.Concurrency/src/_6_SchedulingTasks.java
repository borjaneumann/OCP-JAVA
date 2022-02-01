public class _6_SchedulingTasks {
    /*
    Oftentimes in Java, we need to schedule a task to happen at some future
    time. We might even need to schedule the task to happen repeatedly, at
    some set interval.
    Like ExecutorService, we obtain an instance of
    ScheduledExecutorService using a factory method in the Executors
    class, as shown in the following snippet:
    ScheduledExecutorService service
    = Executors.newSingleThreadScheduledExecutor();
    We could store an instance of ScheduledExecutorService in an
    ExecutorService variable, although doing so would mean we'd have to
    cast the object to call any scheduled methods.

    ScheduledExecutorService methods

    Method Name                                                         Description
    =================================================================================================================================
    schedule(Callable<V>callable, long delay, TimeUnit unit)            Creates and executes a Callable task after the given delay
    ---------------------------------------------------------------------------------------------------------------------------------
    schedule(Runnable command, long delay, TimeUnit unit)               Creates and executes a Runnable task after the given delay
    ---------------------------------------------------------------------------------------------------------------------------------
    scheduleAtFixedRate(Runnable command long initialDelay,             Creates and executes a Runnable task after the given initial delay,
    long period, TimeUnit unit)                                         creating a new task every period value that passes
    -----------------------------------------------------------------------------------------------------------------------------------
    scheduleWithFixedDelay(Runnable command,long initialDelay,          Creates and executes a Runnable task after the given initial delay
    long delay, TimeUnit unit)                                          and subsequently with the given delay between the termination of
                                                                        one execution and the commencement of the next

    The delay and period parameters rely on the TimeUnit
    argument to determine the format of the value, such as seconds or
    milliseconds.

    The first two schedule() methods in Table 18.4 take a Callable or
    Runnable, respectively; perform the task after some delay; and return a
    ScheduledFuture instance. The ScheduledFuture interface is identical to
    the Future interface, except that it includes a getDelay() method that
    returns the remaining delay. The following uses the schedule() method
    with Callable and Runnable tasks:

    ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
    Runnable task1 = () -> System.out.println("Hello Zoo");
    Callable<String> task2 = () -> "Monkey";
    ScheduledFuture<?> r1 = service.schedule(task1, 10, TimeUnit.SECONDS); // Task is scheduled 10 seconds in the future
    ScheduledFuture<?> r2 = service.schedule(task2, 8, TimeUnit.MINUTES); // Task is scheduled 8 minutes in the future

    if the ScheduledExecutorService is shut down by the time
    the scheduled task execution time is reached, then these tasks will be
    discarded.

    Each of the ScheduledExecutorService methods is important and has
    real‐world applications. For example, you can use the schedule()
    command to check on the state of processing a task and send out
    notifications if it is not finished or even call schedule() again to delay
    processing.

    scheduleAtFixedRate() and scheduleWithFixedDelay()
    -------------------------------------------------
    They are similar as they both perform the same task repeatedly, after completing some initial delay. The
    difference is related to the timing of the process and when the next task starts.

    The scheduleAtFixedRate() method creates a new task and submits it to
    the executor every period, regardless of whether the previous task
    finished.
    The following example executes a Runnable task every minute, following an initial five‐minute delay:

    service.scheduleAtFixedRate(command, 5, 1, TimeUnit.MINUTES);

    The scheduleAtFixedRate() method is useful for tasks that need to be
    run at specific intervals, such as checking the health of the animals once a day

    Tip:
    Bad things can happen with scheduleAtFixedRate() if each task
    consistently takes longer to run than the execution interval. Imagine
    your boss came by your desk every minute and dropped off a piece
    of paper. Now imagine it took you five minutes to read each piece of
    paper. Before long, you would be drowning in piles of paper. This is
    how an executor feels. Given enough time, the program would
    submit more tasks to the executor service than could fit in memory,
    causing the program to crash.

    The scheduleWithFixedDelay() method creates a new ask only after the previous task has finished.
    For example, if a task runs at 12:00 and takes five minutes to finish, with a period between executions
    of two minutes, then the next task will start at 12:07.

    service.scheduleWithFixedDelay(command, 0, 2, TimeUnit.MINUTES);

    The scheduleWithFixedDelay() is useful for processes that you want to
    happen repeatedly but whose specific time is unimportant. For example,
    imagine that we have a zoo cafeteria worker who periodically restocks the
    salad bar throughout the day. The process can take 20 minutes or more,
    since it requires the worker to haul a large number of items from the back
    room. Once the worker has filled the salad bar with fresh food, he doesn't
    need to check at some specific time, just after enough time has passed for
    it to become low on stock again.

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



     */
}
