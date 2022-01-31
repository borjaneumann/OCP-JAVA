import java.util.Calendar;
import java.util.List;
import java.util.concurrent.*;

public class _5_CreatingThreadsWithTheConcurrencyAPI {
    /*
    The Concurrency API includes the ExecutorService interface, which defines services that create and manage threads
     for you.

    You first obtain an instance of an ExecutorService interface, and then
    you send the service tasks to be processed. The framework includes
    numerous useful features, such as thread pooling and scheduling. It is
    recommended that you use this framework anytime you need to create and
    execute a separate task, even if you need only a single thread.

    INTRODUCING THE SINGLE‐THREAD EXECUTOR
    ======================================
    Since ExecutorService is an interface, how do you obtain an instance of
    it? The Concurrency API includes the Executors factory class that can be
    used to create instances of the ExecutorService object.

    Example:
     */
    public static class ZooInfo {
        public static void main(String[] args) {
            ExecutorService service = null;
            Runnable task1 = () ->
                    System.out.println("Printing zoo inventory");
            Runnable task2 = () -> {
                for (int i = 0; i < 3; i++)
                    System.out.println("Printing record: " + i);
            };
            try {
                service = Executors.newSingleThreadExecutor();
                System.out.println("begin");
                service.execute(task1);
                service.execute(task2);
                service.execute(task1);
                System.out.println("end");
            } finally {
                if (service != null) service.shutdown();
            }
        }
    }
    /*
    In this example, we use the Executors.newSingleThreadExecutor()
    method to create the service. Unlike our earlier example, in which we had
    three extra threads for newly created tasks, this example uses only one,
    which means that the threads will order their results. For example, the
    following is a possible output for this code snippet:

    begin
    Printing zoo inventory
    Printing record: 0
    Printing record: 1
    end
    Printing record: 2
    Printing zoo inventory

    With a single‐thread executor, results are guaranteed to be executed
    sequentially. Notice that the end text is output while our thread executor
    tasks are still running. This is because the main() method is still an
    independent thread from the ExecutorService.

     SHUTTING DOWN A THREAD EXECUTOR
     ===============================
    Once you have finished using a thread executor, it is important that you
    call the shutdown() method. A thread executor creates a non‐daemon
    thread on the first task that is executed, so failing to call shutdown() will
    result in your application never terminating.

    The shutdown process for a thread executor involves first rejecting any
    new tasks submitted to the thread executor while continuing to execute
    any previously submitted tasks. During this time, calling isShutdown()
    will return true, while isTerminated() will return false. If a new task is
    submitted to the thread executor while it is shutting down, a
    RejectedExecutionException will be thrown. Once all active tasks have
    been completed, isShutdown() and isTerminated() will both return true.

    For the exam, you should be aware that shutdown() does not actually stop
    any tasks that have already been submitted to the thread executor.

    What if you want to cancel all running and upcoming tasks? The
    ExecutorService provides a method called shutdownNow(), which
    attempts to stop all running tasks and discards any that have not been
    started yet. It is possible to create a thread that will never terminate, so any
    attempt to interrupt it may be ignored. Lastly, shutdownNow() returns a
    List<Runnable> of tasks that were submitted to the thread executor but
    that were never started.

    As you learned in Chapter 16, resources such as thread executors
    should be properly closed to prevent memory leaks. Unfortunately,
    the ExecutorService interface does not extend the AutoCloseable
    interface, so you cannot use a try‐with‐resources statement. You can
    still use a finally block, as we do throughout this chapter. While
    not required, it is considered a good practice to do so.
     */

    /*
    SUBMITTING TASKS
    ================
    You can submit tasks to an ExecutorService instance multiple ways. The
    first method we presented, execute(), is inherited from the Executor
    interface, which the ExecutorService interface extends. The execute()
    method takes a Runnable lambda expression or instance and completes the
    task asynchronously.Because the return type of the method is void, it
    does not tell us anything about the result of the task. It is considered a
    “fire‐and‐forget” method.
    the writers of Java added submit() methods to the
    ExecutorService interface, which, like execute(), can be used to
    complete tasks asynchronously.

    submit() returns a Future instance that can be used to determine whether the task is
    complete. It can also be used to return a generic result object after the task
    has been completed.

    In practice, using the submit() method is quite similar to using the
    execute() method, except that the submit() method returns a Future
    instance that can be used to determine whether the task has completed
    execution.

    ExecutorService methods(5)
    Method name                             Description
    ===================================================================================
    void execute(Runnable command)          Executes a Runnable task at some point in the future
    _________________________________________________________________________________________
    Future<?> submit(Runnable task)         Executes a Runnable task at some point in the future
                                            and returns a Future representing the task
    -----------------------------------------------------------------------------------------
    <T> Future<T> submit(Callable<T> task)  Executes a Callable task at some point in the future
                                            and returns a Future representing the pending results of the task
    -----------------------------------------------------------------------------------------
    <T> List<Future<T>>invokeAll(Collection<?   Executes the given tasks and waits for all tasks to complete. Returns a
    extends Callable<T>>tasks) throws           List of Future instances, in the same order they were in the original
    InterruptedException                        collection
    ------------------------------------------------------------------------------------------
    <T> T invokeAny(Collection<?            Executes the given tasks and waits for at least one to complete. Returns a
    extends Callable<T>> tasks) throws      Future instance for a complete task and cancels any unfinished tasks
    InterruptedException,
    ExecutionException
    ----------------------------------------------------------------------------------------------

    SUBMITTING TASKS: EXECUTE() VS. SUBMIT()
    ========================================
    As you might have noticed, the execute() and submit() methods
    are nearly identical when applied to Runnable expressions. The
    submit() method has the obvious advantage of doing the same thing
    execute() does, but with a return object that can be used to track
    the result. Because of this advantage and the fact that execute()
    does not support Callable expressions, we tend to prefer submit()
    over execute(), even if you don't store the Future reference.
    Therefore, we use submit() in the majority of the examples in this
    chapter.

    For the exam, you need to be familiar with both execute() and
    submit(), but in your own code we recommend submit() over
    execute() whenever possible.

    WAITING FOR RESULTS
    ===================
    As mentioned in the previous section, the submit() method
    returns a java.util.concurrent.Future<V> instance that can be used to
    determine this result.

    Future<?> future = service.submit(() -> System.out.println("Hello"));

    The Future type is actually an interface. Future methods
    Method name                     Description
    ==============================================================================================================
    boolean isDone()                Returns true if the task was completed, threw an exception, or was cancelled
    --------------------------------------------------------------------------------------------------------------
    boolean isCancelled()           Returns true if the task was cancelled before it completed normally
    --------------------------------------------------------------------------------------------------------------
    boolean cancel(boolean          Attempts to cancel execution of the task and returns true if it was
    mayInterruptIfRunning)          successfully cancelled or false if it could not be cancelled or is complete
    --------------------------------------------------------------------------------------------------------------
    V get()                         Retrieves the result of a task, waiting endlessly if it is not yet available
    --------------------------------------------------------------------------------------------------------------
    V get(long timeout,             Retrieves the result of a task, waiting the specified amount of time.
    TimeUnit unit)                  If the result is not ready by the time the timeout is reached, a checked
    TimeoutException
                                    will be thrown.
    --------------------------------------------------------------------------------------------------------------

    The following is an updated version of our earlier polling example
    CheckResults class, which uses a Future instance to wait for the results:

     */
    public static class CheckResults {
        private static int counter = 0;

        public static void main(String[] unused) throws Exception {
            ExecutorService service = null;
            try {
                service = Executors.newSingleThreadExecutor();
                Future<?> result = service.submit(() -> {
                    for (int i = 0; i < 500; i++)
                        CheckResults.counter++;
                });
                result.get(10, TimeUnit.SECONDS);
                System.out.println("Reached!");
            } catch (TimeoutException e) {
                System.out.println("Not reached in time");
            } finally {
                if (service != null) service.shutdown();
            }
        }
    }
    /*
    This example is similar to our earlier polling implementation, but it does
    not use the Thread class directly. In part, this is the essence of the
    Concurrency API: to do complex things with threads without having to
    manage threads directly. It also waits at most 10 seconds, throwing a
    TimeoutException on the call to result.get() if the task is not done.
    What is the return value of this task? As Future<V> is a generic interface,
    the type V is determined by the return type of the Runnable method. Since
    the return type of Runnable.run() is void, the get() method always
    returns null when working with Runnable expressions.

    The Future.get() method can take an optional value and enum type
    java.util.concurrent.TimeUnit. We present the full list of TimeUnit
    values in the table below in increasing order of duration. Numerous methods in
    the Concurrency API use the TimeUnit enum.

    TimeUnit values
    Enum name                   Description
    ================================================================================
    TimeUnit.NANOSECONDS        Time in one‐billionth of a second (1/1,000,000,000)
    TimeUnit.MICROSECONDS       Time in one‐millionth of a second (1/1,000,000)
    TimeUnit.MILLISECONDS       Time in one‐thousandth of a second (1/1,000)
    TimeUnit.SECONDS            Time in seconds
    TimeUnit.MINUTES            Time in minutes
    TimeUnit.HOURS              Time in hours
    TimeUnit.DAYS               Time in days
     */

    /*Introducing Callable
    The java.util.concurrent.Callable functional interface is similar to
    Runnable except that its call() method returns a value and can throw a
    checked exception. The following is the definition of the Callable
    interface:
    @FunctionalInterface public interface Callable<V> {
        V call() throws Exception;
    }

    The Callable interface is often preferable over Runnable, since it allows
    more details to be retrieved easily from the task after it is completed.

    That said, we use both interfaces throughout this chapter, as they are
    interchangeable in situations where the lambda does not throw an
    exception and there is no return type. Luckily, the ExecutorService
    includes an overloaded version of the submit() method that takes a
    Callable object and returns a generic Future<T> instance.
    Unlike Runnable, in which the get() methods always return null, the
    get() methods on a Future instance return the matching generic type
    (which could also be a null value).
     */
    public static class AddData {
        public static void main(String[] args) throws Exception {
            ExecutorService service = null;
            try {
                service = Executors.newSingleThreadExecutor();
                Future<Integer> result = service.submit(() -> 30 + 11);
                System.out.println(result.get()); //41
            } finally {
                if (service != null) service.shutdown();
            }
        }
    }
    /*The results could have also been obtained using Runnable and some
    shared, possibly static, object, although this solution that relies on
    Callable is a lot simpler and easier to follow.
     */

    /*
    Waiting for All Tasks to Finish

    After submitting a set of tasks to a thread executor, it is common to wait
    for the results. As you saw in the previous sections, one solution is to call
    get() on each Future object returned by the submit() method. If we don't
    need the results of the tasks and are finished using our thread executor,
    there is a simpler approach.

    First, we shut down the thread executor using the shutdown() method.
    Next, we use the awaitTermination() method available for all thread
    executors. The method waits the specified time to complete all tasks,
    returning sooner if all tasks finish or an InterruptedException is
    detected. You can see an example of this in the following code snippet:

    ExecutorService service = null;
    try {
        service = Executors.newSingleThreadExecutor();
        // Add tasks to the thread executor
        …
    } finally {
        if(service != null) service.shutdown();
    }
    if(service != null) {
    service.awaitTermination(1, TimeUnit.MINUTES);
    // Check whether all tasks are finished
    if(service.isTerminated()) System.out.println("Finished!");
    else System.out.println("At least one task is still
    running");
    }

    In this example, we submit a number of tasks to the thread executor and
    then shut down the thread executor and wait up to one minute for the
    results. Notice that we can call isTerminated() after the
    awaitTermination() method finishes to confirm that all tasks are actually
    finished.

    If awaitTermination() is called before shutdown() within the same
    thread, then that thread will wait the full timeout value sent with
    awaitTermination().

     */

    /*
    Submitting Tasks Collections
    ============================
     invokeAll() and invokeAny() methods execute synchronously and take a Collection of tasks.

     The invokeAll() method executes all tasks in a provided collection and
    returns a List of ordered Future instances, with one Future instance
    corresponding to each submitted task, in the order they were in the
    original collection.

    public static void sumittingTasksCollections() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        System.out.println("begin");
        Callable<String> task = () -> "result";
        List<Future<String>> list = service.invokeAll(
                List.of(task, task, task));
        for (Future<String> future : list) {
            System.out.println(future.get());
        }
        System.out.println("end");
    }
    In this example, the JVM waits on line 23 for all tasks to finish before
    moving on to line 25. Unlike our earlier examples, this means that end will
    always be printed last. Also, even though future.isDone() returns true
    for each element in the returned List, a task could have completed
    normally or thrown an exception.
    On the other hand, the invokeAny() method executes a collection of tasks
    and returns the result of one of the tasks that successfully completes
    execution, cancelling all unfinished tasks. While the first task to finish is
    often returned, this behavior is not guaranteed, as any completed task can
    be returned by this method.

    20: ExecutorService service = …
    21: System.out.println("begin");
    22: Callable<String> task = () -> "result";
    23: String data = service.invokeAny(List.of(task, task,
    task));
    24: System.out.println(data);
    25: System.out.println("end");

    As before, the JVM waits on line 23 for a completed task before moving
    on to the next line. The other tasks that did not complete are cancelled.
    For the exam, remember that the invokeAll() method will wait
    indefinitely until all tasks are complete, while the invokeAny() method
    will wait indefinitely until at least one task completes. The
    ExecutorService interface also includes overloaded versions of
    invokeAll() and invokeAny() that take a timeout value and TimeUnit
    parameter.

    */
}