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

    scheduleAtFixedRate() and scheduleAtFixedRate()
    -------------------------------------------------
    They are similar as they both perform the same task repeatedly, after completing some initial delay. The
    difference is related to the timing of the process and when the next task starts.

     */
}
