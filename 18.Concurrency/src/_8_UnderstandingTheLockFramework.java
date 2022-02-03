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
        new Thread(()-> printMessage(lock)).start();
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



     */

}
