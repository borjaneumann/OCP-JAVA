package _01_IntroducingThreads;

public class _04_CreatingAThread {
    /*
    The simplest way to execute a thread is by using the java.lang.Thread
    class. Executing a task with Thread is a two‐step process. First, you define
    the Thread with the corresponding task to be done. Then, you start the task
    by using the Thread.start() method.

    As we will discuss later in the chapter, Java does not provide any
    guarantees about the order in which a thread will be processed once it is
    started. It may be executed immediately or delayed for a significant
    amount of time.

    Remember that order of thread execution is not often guaranteed.
    The exam commonly presents questions in which multiple tasks are
    started at the same time, and you must determine the result.
     */
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");

        System.out.println("begin");
        (new ReadInventoryThread()).run();
        (new Thread(new PrintData())).run();
        (new ReadInventoryThread()).run();
        System.out.println("end");
    }

    /*Defining the task that a Thread instance will execute can be done two
    ways in Java:
    1) Provide a Runnable object or lambda expression to the Thread
    constructor.
    2) Create a class that extends Thread and overrides the run() method.
    The following are examples of these techniques:*/
    //NUmber 1
    static class PrintData implements Runnable {
        public static void main(String[] args) {
            (new Thread(new PrintData())).start();
        }

        @Override
        public void run() { // Overrides method in Runnable
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        }
    }
    //NUmber 2
    static class ReadInventoryThread extends Thread { //less common practise
        public static void main(String[] args) {
            (new ReadInventoryThread()).start();
        }

        @Override
        public void run() { // Overrides method in Thread
            System.out.println("Printing zoo inventory");
        }
    }
    /*
    Let's try this. What is the output of the following code snippet using these two classes?
    */
    public static void main1(String[] args) { // First used thread
        System.out.println("begin");
        (new ReadInventoryThread()).start(); // Second used thread
        (new Thread(new PrintData())).start(); // Third used thread
        (new ReadInventoryThread()).start(); // Fourth used thread
        System.out.println("end");
    }
    /*
    The answer is that it is unknown until runtime. The following is just one possible output:
    begin
    Printing zoo inventory
    Printing record: 0
    end
    Printing zoo inventory
    Printing record: 1
    Printing record: 2

    This sample uses a total of four threads—the main() user thread and three
    additional threads created on lines 4–6. Each thread created on these lines
    is executed as an asynchronous task. By asynchronous, we mean that the
    thread executing the main() method does not wait for the results of each
    newly created thread before continuing.

    The opposite of this behavior is a synchronous task in which the program waits (or blocks) on
    line 4 for the thread to finish executing before moving on to the next line.
    The vast majority of method calls used in this book have been synchronous up until now.

    While the order of thread execution once the threads have been started is
    indeterminate, the order within a single thread is still linear. In particular,
    the for() loop in PrintData is still ordered. Also, begin appears before
    end in the main() method.

    CALLING RUN() INSTEAD OF START()
    ================================
    Be careful with code that attempts to start a thread by calling run() instead of start().
    Calling run() on a Thread or a Runnable does not actually start a new thread.
    While the following code snippets will compile, none will actually execute a task on a separate thread:

    System.out.println("begin");
    (new ReadInventoryThread()).run();
    (new Thread(new PrintData())).run();
    (new ReadInventoryThread()).run();
    System.out.println("end");

    Unlike the previous example, each line of this code will wait until
    the run() method is complete before moving on to the next line.
    Also unlike the previous program, the output for this code sample
    will be the same each time it is executed.

    In most situations, you should implement the Runnable interface rather than extend the Thread class.
    While previous versions of the exam were quite focused on understanding the difference
    between extending Thread and implementing Runnable, the exam now
    strongly encourages developers to use the Concurrency API.

    For the exam, you also do not need to know about other thread‐related
    methods, such as Object.wait(), Object.notify(), Thread.join(), etc.
    In fact, you should avoid them in general and use the Concurrency API as
    much as possible. It takes a large amount of skill (and some luck!) to use
    these methods correctly.

    FOR INTERVIEWS, BE FAMILIAR WITH THREAD‐CREATION OPTIONS
    =========================================================
    Despite that the exam no longer focuses on creating threads by
    extending the Thread class and implementing the Runnable
    interface, it is extremely common when interviewing for a Java
    development position to be asked to explain the difference between
    extending the Thread class and implementing Runnable.
    If asked this question, you should answer it accurately. You should
    also mention that you can now create and manage threads indirectly
    using an ExecutorService, which we will discuss in the next section.

     */

}
