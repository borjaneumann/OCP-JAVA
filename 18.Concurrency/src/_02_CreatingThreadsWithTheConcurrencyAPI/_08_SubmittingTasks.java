package _02_CreatingThreadsWithTheConcurrencyAPI;

public class _08_SubmittingTasks {
    /*
    You can submit tasks to an ExecutorService instance multiple ways. The
    first method we presented, execute(), is inherited from the Executor
    interface, which the ExecutorService interface extends. The execute()
    method takes a Runnable lambda expression or instance and completes the
    task asynchronously. Because the return type of the method is void, it
    does not tell us anything about the result of the task. It is considered a
    “fire‐and‐forget” method, as once it is submitted, the results are not
    directly available to the calling thread.
    Fortunately, the writers of Java added submit() methods to the
    ExecutorService interface, which, like execute(), can be used to
    complete tasks asynchronously. Unlike execute(), though, submit()
    returns a Future instance that can be used to determine whether the task is
    complete. It can also be used to return a generic result object after the task
    has been completed.

    In practice, using the submit() method is quite similar to using the
    execute() method, except that the submit() method returns a Future
    instance that can be used to determine whether the task has completed
    execution.

    TABLE 18.1 ExecutorService methods
    Method name                                      Description
    ====================================================================================
    void execute(Runnable                           Executes a Runnable task at some
    command)                                        point in the future
    ------------------------------------------------------------------------------------
    Future<?> submit(Runnable                       Executes a Runnable task at some
    task)                                           point in the future and returns a
                                                    Future representing the task
    ------------------------------------------------------------------------------------
    <T> Future<T>                                   Executes a Callable task at some
    submit(Callable<T> task)                        point in the future and returns a
                                                    Future representing the pending
                                                    results of the task
    ------------------------------------------------------------------------------------
    <T> List<Future<T>>                             Executes the given tasks and waits
    invokeAll(Collection<?                          for all tasks to complete. Returns a
    extends Callable<T>>                            List of Future instances, in the same
    tasks) throws                                   order they were in the original
    InterruptedException                            collection
    ------------------------------------------------------------------------------------
    <T> T                                           Executes the given tasks and waits
    invokeAny(Collection<?                          for at least one to complete. Returns a
    extends Callable<T>>                            Future instance for a complete task
    tasks) throws                                   and cancels any unfinished tasks
    InterruptedException,
    ExecutionException

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
