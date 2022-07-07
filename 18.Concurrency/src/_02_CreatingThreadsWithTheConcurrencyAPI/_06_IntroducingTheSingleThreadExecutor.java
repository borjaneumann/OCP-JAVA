package _02_CreatingThreadsWithTheConcurrencyAPI;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class _06_IntroducingTheSingleThreadExecutor {
    /*
    Java includes the Concurrency API to handle the complicated work of
    managing threads for you. The Concurrency API includes the
    ExecutorService interface, which defines services that create and manage
    threads for you.
    You first obtain an instance of an ExecutorService interface, and then
    you send the service tasks to be processed. The framework includes
    numerous useful features, such as thread pooling and scheduling. It is
    recommended that you use this framework anytime you need to create and
    execute a separate task, even if you need only a single thread.

    INTRODUCING THE SINGLE‐THREAD EXECUTOR
    ======================================
    Since ExecutorService is an interface, how do you obtain an instance of
    it? The Concurrency API includes the Executors factory class that can be
    used to create instances of the ExecutorService object. As you may
    remember from Chapter 16, the factory pattern is a creational pattern in
    which the underlying implementation details of the object creation are
    hidden from us. You will see the factory pattern used again throughout
    Chapter 20.

    Let's start with a simple example using the newSingleThreadExecutor()
    method to obtain an ExecutorService instance and the execute() method
    to perform asynchronous tasks.
    */
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
    /*
    As you may notice, this is just a rewrite of our earlier PrintData and
    ReadInventoryThread classes to use lambda expressions and an
    ExecutorService instance.
    In this example,we use the Executors.newSingleThreadExecutor()
    method to create the service.Unlike our earlier example,in which we had
    three extra threads for newly created tasks,this example uses only one,
    which means that the threads will order their results.For example,the
    following is a possible output for this code snippet:

    begin
    Printing zoo inventory
    Printing record:0
    Printing record:1
    end
    Printing record:2
    Printing zoo inventory

    With a single‐thread executor,results are guaranteed to be executed
    sequentially.Notice that the end text is output while our thread executor
    tasks are still running.This is because the main()method is still an
    independent thread from the ExecutorService.
    */
}
