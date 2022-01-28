import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _5_CreatingThreadsWithTheConcurrencyAPI {
    /*
    The Concurrency API includes the ExecutorService interface, which defines services that create and manage threads for you.

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


     */

}