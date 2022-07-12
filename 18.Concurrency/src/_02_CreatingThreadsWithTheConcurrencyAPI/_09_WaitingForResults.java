package _02_CreatingThreadsWithTheConcurrencyAPI;

import java.util.concurrent.*;

public class _09_WaitingForResults {
    /*
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
                System.out.println(result);
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
}
