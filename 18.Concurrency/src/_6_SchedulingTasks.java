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


     */
}
