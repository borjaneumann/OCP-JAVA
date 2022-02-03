import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class _8_UnderstandingTheLockFramework {

    /*
    A synchronized block supports only a limited set of functionality. For
    example, what if we want to check whether a lock is available and, if it is
    not, perform some other task? Furthermore, if the lock is never available
    and we synchronize on it, we might hang forever.

    The Concurrency API includes the Lock interface that is conceptually
    similar to using the synchronized keyword, but with a lot more bells and
    whistles. Instead of synchronizing on any Object, though, we can “lock”
    only on an object that implements the Lock interface.

    Applying a ReentrantLock Interface
    ==================================
    When you need to protect a piece of code from multithreaded processing,
    create an instance of Lock that all threads have access to.
    Each thread then calls lock() before it enters the
    protected code and calls unlock() before it exits the protected code.

    For contrast, the following shows two implementations, one with a
    synchronized block and one with a Lock instance. As we'll see in the next
    section, the Lock solution has a number of features not available to the
    synchronized block.
    // Implementation #1 with a synchronized block
    Object object = new Object();
        synchronized(object) {
        // Protected code
    }

    // Implementation #2 with a Lock
    Lock lock = new ReentrantLock();
    try {
        lock.lock();
        // Protected code
    } finally {
        lock.unlock();
    }

    While certainly not required, it is a good practice to use a try/
    finally block with Lock instances. This ensures any acquired locks
    are properly released.

    These two implementations are conceptually equivalent. The
    ReentrantLock class is a simple monitor that implements the Lock
    interface and supports mutual exclusion. In other words, at most one
    thread is allowed to hold a lock at any given time.

    The ReentrantLock class ensures that once a thread has called lock() and
    obtained the lock, all other threads that call lock() will wait until the first
    thread calls unlock(). As far as which thread gets the lock next, that
    depends on the parameters used to create the Lock object.

    The ReentrantLock class contains a constructor that can be used to
    send a boolean “fairness” parameter. If set to true, then the lock
    will usually be granted to each thread in the order it was requested.
    It is false by default when using the no‐argument constructor. In
    practice, you should enable fairness only when ordering is
    absolutely required, as it could lead to a significant slowdown.

    Besides always making sure to release a lock, you also need to make sure
    that you only release a lock that you actually have. If you attempt to
    release a lock that you do not have, you will get an exception at runtime.

    Lock lock = new ReentrantLock();
    lock.unlock(); // IllegalMonitorStateException

    Lock methods(4)
    Method                      Description
    ========================================================================================
    void lock()                 Requests a lock and blocks until lock is acquired
    ----------------------------------------------------------------------------------------
    void unlock()               Releases a lock
    ----------------------------------------------------------------------------------------
    boolean tryLock()           Requests a lock and returns immediately. Returns a
                                boolean indicating whether the lock was successfully acquired
    -----------------------------------------------------------------------------------------
    boolean tryLock(long,       Requests a lock and blocks up to the specified time until
    TimeUnit)                   lock is required. Returns a boolean indicating whether
                                the lock was successfully acquired
    ------------------------------------------------------------------------------------------

    Attempting to Acquire a Lock
    ============================
    While the ReentrantLock class allows you to wait for a lock, it so far
    suffers from the same problem as a synchronized block. A thread could
    end up waiting forever to obtain a lock.

    boolean tryLock() and boolean tryLock(long,TimeUnit) make the Lock interface
    a lot safer to use than a synchronized block.

    For convenience, we'll be using the following printMessage() method for
    the code in this section:
    */
    public static void printMessage(Lock lock) {
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }

    /*
/*
    tryLock()
    =========
    The tryLock() method will attempt to acquire a lock and immediately
    return a boolean result indicating whether the lock was obtained. Unlike
    the lock() method, it does not wait if another thread already holds the
    lock. It returns immediately, regardless of whether or not a lock is
    available.
    The following is a sample implementation using the tryLock() method:
     */
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();
        if (lock.tryLock()) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }

    /*
    It could produce either message, depending on the order of execution.
   Like lock(), the tryLock() method should be used with a try/ finally
   block. Fortunately, you need to release the lock only if it was successfully
   acquired.

   It is imperative that your program always checks the return value of
   the tryLock() method. It tells your program whether the lock needs
   to be released later.
    */
    /*
    tryLock(long,TimeUnit)
    ======================
    if a lock is available, then it will
    immediately return with it. If a lock is unavailable, though, it will wait up
    to the specified time limit for the lock.

    The following code snippet uses the overloaded version of tryLock(long,TimeUnit):
    */
    public static void main2(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Thread(() -> printMessage(lock)).start();
        if (lock.tryLock(10, TimeUnit.SECONDS)) {
            try {
                System.out.println("Lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("Unable to acquire lock, doing something else");
        }
    }
    /*
    The code is the same as before, except this time one of the threads waits
    up to 10 seconds to acquire the lock.
     */


    /*
/*
    Duplicate Lock Requests
    =======================
    The ReentrantLock class maintains a counter of the number of times a
    lock has been given to a thread. To release the lock for other threads to
    use, unlock() must be called the same number of times the lock was
    granted. The following code snippet contains an error. Can you spot it?

    Lock lock = new ReentrantLock();
    if(lock.tryLock()) {    //lock once
        try {
            lock.lock();    //lock twice
            System.out.println("Lock obtained, entering protected
            code");
    } finally {
        lock.unlock();
        }
    }

    It is critical that you release a lock the same number of times it is acquired.
    For calls with tryLock(), you need to call unlock() only if the method
    returned true.

    Reviewing the Lock Framework
    ============================
    To review, the ReentrantLock class supports the same features as a
    synchronized block, while adding a number of improvements.

    - Ability to request a lock without blocking
    - Ability to request a lock while blocking for a specified amount of time
    - A lock can be created with a fairness property, in which the lock is granted
    to threads in the order it was requested.

    The Concurrency API includes other lock‐based classes, although
    ReentrantLock is the only one you need to know for the exam.

    Alternative to ReentrantLock(ReentrantReadWriteLock)
    ====================================================
    While not on the exam, ReentrantReadWriteLock is a really useful
    class. It includes separate locks for reading and writing data and is
    useful on data structures where reads are far more common than
    writes. For example, if you have a thousand threads reading data but
    only one thread writing data, this class can help you maximize
    concurrent access.


    Orchestrating Tasks With A CyclicBarrier
    =======================================
     */
    public static class LionPenManager {
        private void removeLions() {
            System.out.println("Removing lions");
        }

        private void cleanPen() {
            System.out.println("Cleaning the pen");
        }

        private void addLions() {
            System.out.println("Adding lions");
        }

        public void performTask() {
            removeLions();
            cleanPen();
            addLions();
        }

        public static void main(String[] args) {
            ExecutorService service = null;
            try {
                service = Executors.newFixedThreadPool(4);
                var manager = new LionPenManager();
                for (int i = 0; i < 4; i++)
                    service.submit(() -> manager.performTask());
            } finally {
                if (service != null) service.shutdown();
            }
        }
    }
    /*
    The following is sample output based on this implementation:
    Removing lions
    Removing lions
    Cleaning the pen
    Adding lions
    Removing lions
    Cleaning the pen
    Adding lions
    Removing lions
    Cleaning the pen
    Adding lions
    Cleaning the pen
    Adding lions

    Although within a single thread the results are ordered, among multiple
    workers the output is entirely random. We see that some lions are still
    being removed while the cage is being cleaned, and other lions are added
    before the cleaning process is finished. In our conceptual example, this
    would be quite chaotic and would not lead to a very clean cage.

    We can improve these results by using the CyclicBarrier class. The
    CyclicBarrier takes in its constructors a limit value, indicating the
    number of threads to wait for. As each thread finishes, it calls the await()
    method on the cyclic barrier. Once the specified number of threads have
    each called await(), the barrier is released, and all threads can continue.
    */
    public static class LionPenManager1 {
        private void removeLions() {System.out.println("Removing  lions");}
        private void cleanPen() {System.out.println("Cleaning the  pen");}
        private void addLions() {System.out.println("Adding lions");}
        public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
            try {
            removeLions();
            c1.await();
            cleanPen();
            c2.await();
            addLions();
            } catch (InterruptedException | BrokenBarrierException e) {
    // Handle checked exceptions here
            }
        }
    public static void main(String[] args) {
        ExecutorService service = null;
            try {
                service = Executors.newFixedThreadPool(4);
                var manager = new LionPenManager1();
                var c1 = new CyclicBarrier(4);
                var c2 = new CyclicBarrier(4,
                () -> System.out.println("*** Pen Cleaned!"));
                for (int i = 0; i < 4; i++)
                service.submit(() -> manager.performTask(c1, c2));
            } finally {
                if (service != null) service.shutdown();
            }
        }
    }
    /*
    In this example, we have updated performTask() to use CyclicBarrier
    objects. Like synchronizing on the same object, coordinating a task with a
    CyclicBarrier requires the object to be static or passed to the thread
    performing the task. We also add a try/ catch block in the
    performTask() method, as the await() method throws multiple checked
    exceptions.
    The following is sample output based on this revised implementation of our LionPenManager class:

    Removing lions
    Removing lions
    Removing lions
    Removing lions
    Cleaning the pen
    Cleaning the pen
    Cleaning the pen
    Cleaning the pen
    *** Pen Cleaned!
    Adding lions
    Adding lions
    Adding lions
    Adding lions

     */
}


