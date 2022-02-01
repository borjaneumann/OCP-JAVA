import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _7_WritingThreadSafeCode {

    /*Thread‐safety is the property of an object that guarantees safe execution
    by multiple threads at the same time. Since threads run in a shared
    environment and memory space, how do we prevent two threads from
    interfering with each other? We must organize access to data so that we
    don't end up with invalid or unexpected results.*/

    /* UNDERSTANDING THREAD‐SAFETY
    ===============================
    Imagine that our zoo has a program to count sheep, preferably one that
    won't put the zoo workers to sleep! Each zoo worker runs out to a field,
    adds a new sheep to the flock, counts the total number of sheep, and runs
    back to us to report the results. We present the following code to represent
    this conceptually, choosing a thread pool size so that all tasks can be run
    concurrently:
     */
    public static class SheepManager {
        private int sheepCount = 0;
        private void incrementAndReport() {
            System.out.print((++sheepCount) + " "); // One possible output: 3 10 1 7 9 5 8 6 4 2
        }
        public static void main(String[] args) {
            ExecutorService service = null;
            try {
                service = Executors.newFixedThreadPool(20);
                SheepManager manager = new SheepManager();
                for (int i = 0; i < 10; i++) {
                    service.submit(() -> manager.incrementAndReport());
                }
            } finally {
                if(service != null)
                    service.shutdown();
            }
        }
    }
    /*
    What does this program output? You might think it will output numbers
    from 1 to 10, in order, but that is far from guaranteed. It may output in a
    different order. Worse yet, it may print some numbers twice and not print
    some numbers at all!

    So, what went wrong? In this example, we use the pre‐increment ( ++)
    operator to update the sheepCount variable. A problem occurs when two
    threads both execute the right side of the expression, reading the “old”
    value before either thread writes the “new” value of the variable. The two
    assignments become redundant; they both assign the same new value, with
    one thread overwriting the results of the other.

    both threads read and write the same
    values, causing one of the two ++sheepCount operations to be lost.
    Therefore, the increment operator ++ is not thread‐safe. As you will see
    later in this chapter, the unexpected result of two tasks executing at the
    same time is referred to as a race condition.

    Conceptually, the idea here is that some zoo workers may run faster on
    their way to the field but more slowly on their way back and report late.
    Other workers may get to the field last but somehow be the first ones back
    to report the results.

    PROTECTING DATA WITH ATOMIC CLASSES
    ===================================
    One way to improve our sheep counting example is to use the java.util.concurrent.atomic package.

    The reason why the increment operator ++ is not thread‐safe is that the operation is not
    atomic, carrying out two tasks, read and write, that can be interrupted by other threads.

    Atomic is the property of an operation to be carried out as a single unit of
    execution without any interference by another thread. A thread‐safe
    atomic version of the increment operator would be one that performed the
    read and write of the variable as a single operation, not allowing any other
    threads to access the variable during the operation.

    Any thread trying to access the sheepCount variable while an atomic operation
    is in process will have to wait until the atomic operation on the variable is
    complete. Conceptually, this is like setting a rule for our zoo workers that
    there can be only one employee in the field at a time, although they may
    not each report their result in order.

    Atomic classes
    Class Name                      Description
    =========================================================================================
    AtomicBoolean                   A boolean value that may be updated atomically
    AtomicInteger                   An int value that may be updated atomically
    AtomicLong                      A long value that may be updated atomically

     */
}
