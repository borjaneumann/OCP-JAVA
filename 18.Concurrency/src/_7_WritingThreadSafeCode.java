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

    How do we use an atomic class? Each class includes numerous methods
    that are equivalent to many of the primitive built‐in operators that we use
    on primitives, such as the assignment operator ( =) and the increment
    operators ( ++).

    In the following example, we update our SheepManager class with an AtomicInteger:

    private AtomicInteger sheepCount = new AtomicInteger(0);
    private void incrementAndReport() {
    System.out.print(sheepCount.incrementAndGet()+" ");
    }
    Unlike our previous sample output, the numbers 1 through 10 will always be printed, although the order is still not guaranteed.

    Common atomic methods (7)
    Method name                 Description
    =====================================================================================================
    get()                       Retrieves the current value
    set()                       Sets the given value, equivalent to the assignment = operator
    getAndSet()                 Atomically sets the new value and returns the old value
    incrementAndGet()           For numeric classes, atomic pre‐increment operation equivalent to ++value
    getAndIncrement()           For numeric classes, atomic post‐increment operation equivalent to value++
    decrementAndGet()           For numeric classes, atomic pre‐decrement operation equivalent to ‐‐value
    getAndDecrement()           For numeric classes, atomic post‐decrement operation equivalent to value‐‐

    IMPROVING ACCESS WITH SYNCHRONIZED BLOCKS (MONITOR)
    ===================================================
    While atomic classes are great at protecting single variables, they aren't
    particularly useful if you need to execute a series of commands or call a
    method.
    How do we improve the results so that each worker is able to
    increment and report the results in order? The most common technique is
    to use a monitor, also called a lock, to synchronize access. A monitor is a
    structure that supports mutual exclusion, which is the property that at most
    one thread is executing a particular segment of code at a given time.

    In Java, any Object can be used as a monitor, along with the
    synchronized keyword, as shown in the following example:

    SheepManager manager = new SheepManager();
    synchronized(manager) {
        // Work to be completed by one thread at a time
    }

    This example is referred to as a synchronized block. Each thread that
    arrives will first check if any threads are in the block. In this manner, a
    thread “acquires the lock” for the monitor. If the lock is available, a single
    thread will enter the block, acquiring the lock and preventing all other
    threads from entering. While the first thread is executing the block, all
    threads that arrive will attempt to acquire the same lock and wait for the
    first thread to finish. Once a thread finishes executing the block, it will
    release the lock, allowing one of the waiting threads to proceed.

    To synchronize access across multiple threads, each thread must
    have access to the same Object. For example, synchronizing on
    different objects would not actually order the results.

    Let's revisit our SheepManager example and see whether we can improve
    the results so that each worker increments and outputs the counter in
    order. Let's say that we replaced our for() loop with the following
    implementation:

    for(int i = 0; i < 10; i++) {
        synchronized(manager) {
        service.submit(() -> manager.incrementAndReport());
        }
    }
    Does this solution fix the problem? No, it does not! Can you spot the
    problem? We've synchronized the creation of the threads but not the
    execution of the threads. In this example, each thread would be created
    one at a time, but they may all still execute and perform their work at the
    same time, resulting in the same type of output that you saw earlier.
    Diagnosing and resolving threading problems is often one of the most
    difficult tasks in any programming language.

    We now present a corrected version of the SheepManager class, which
    does order the workers.
    */

    public static class SheepManager1 {
        private int sheepCount = 0;
        private void incrementAndReport() {
            synchronized (this) {
                System.out.print((++sheepCount) + " "); // it will consistently output the following: 1 2 3 4 5 6 7 8 9 10
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(20);
            var manager = new SheepManager1();
            for (int i = 0; i < 10; i++)
                service.submit(()->manager.incrementAndReport());

        } finally {
            if (service != null) service.shutdown();
        }
    }
    /*
    Although all threads are still created and executed at the same time, they
    each wait at the synchronized block for the worker to increment and
    report the result before entering. In this manner, each zoo worker waits for
    the previous zoo worker to come back before running out on the field.
    While it's random which zoo worker will run out next, it is guaranteed that
    there will be at most one on the field and that the results will be reported
    in order.

    We could have synchronized on any object, so long as it was the same
    object. For example, the following code snippet would have also worked:

    private final Object herd = new Object();
    private void incrementAndReport() {
        synchronized(herd) {
            System.out.print((++sheepCount)+" ");
        }
    }
    */
    /*Although we didn't need to make the herd variable final, doing so
    ensures that it is not reassigned after threads start using it.
    We could have used an atomic variable along with the
    synchronized block in this example, although it is unnecessary.
    Since synchronized blocks allow only one thread to enter, we're not
    gaining any improvement by using an atomic variable if the only
    time that we access the variable is within a synchronized block.

     */






}
