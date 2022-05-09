package _01_IntroducingThreads;

public class _01_DistinguishingThreadTypes {
    /*
    Luckily, all modern operating systems support what is known as
    multithreaded processing. The idea behind multithreaded processing is to
    allow an application or group of applications to execute multiple tasks at
    the same time. This allows tasks waiting for other resources to give way to
    other processing requests.
    Since its early days, Java has supported multithreaded programming using
    the Thread class. More recently, the Concurrency API was introduced. It
    included numerous classes for performing complex thread‐based tasks.
    The idea was simple: managing complex thread interactions is quite
    difficult for even the most skilled developers; therefore, a set of reusable
    features was created. The Concurrency API has grown over the years to
    include numerous classes and frameworks to assist you in developing
    complex, multithreaded applications.

    A thread is the smallest unit of execution that can be scheduled by
    the operating system.
    A process is a group of associated threads that
    execute in the same, shared environment.
    It follows, then, that a single‐threaded process is one that contains exactly one thread, whereas a
    multithreaded process is one that contains one or more threads.
    By shared environment, we mean that the threads in the same process
    share the same memory space and can communicate directly with one
    another.

    A task is a single unit of work performed by a thread. Throughout
    this chapter, a task will commonly be implemented as a lambda
    expression. A thread can complete multiple independent tasks but only
    one task at a time.

    By shared memory, we are generally referring to static
    variables, as well as instance and local variables passed to a thread.

    DISTINGUISHING THREAD TYPES
    ===========================

    A system thread is created by the JVM and runs in the background of the
    application. For example, the garbage collection is managed by a system
    thread that is created by the JVM and runs in the background, helping to
    free memory that is no longer in use. For the most part, the execution of
    system‐defined threads is invisible to the application developer. When a
    system‐defined thread encounters a problem and cannot recover, such as
    running out of memory, it generates a Java Error, as opposed to an
    Exception.

    A user‐defined thread is one created by the application developer to accomplish
    a specific task.

    A daemon thread is one that will not prevent the JVM from exiting when the program
    finishes. A Java application terminates when the only threads that
    are running are daemon threads. For example, if garbage collection
    is the only thread left running, the JVM will automatically shut
    down. Both system and user‐defined threads can be marked as
    daemon threads.

     */
}
