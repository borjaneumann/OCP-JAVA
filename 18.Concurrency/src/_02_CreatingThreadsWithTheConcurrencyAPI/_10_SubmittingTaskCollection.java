package _02_CreatingThreadsWithTheConcurrencyAPI;

public class _10_SubmittingTaskCollection {
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
