package _01_IntroducingThreads;

public class _02_UnderstandingThreadConcurrency {
    /*
    The property of executing multiple threads and processes at the same time is referred to
    as concurrency. Of course, with a single‐core CPU system, only one task
    is actually executing at a given time. Even in multicore or multi‐CPU
    systems, there are often far more threads than CPU processors available.
    How does the system decide what to execute when there are multiple
    threads available?

    Operating systems use a thread scheduler to determine which threads
    should be currently executing, as shown in Figure 18.1. For example, a
    thread scheduler may employ a round‐robin schedule in which each
    available thread receives an equal number of CPU cycles with which to
    execute, with threads visited in a circular order. If there are 10 available
    threads, they might each get 100 milliseconds in which to execute, with
    the process returning to the first thread after the last thread has executed.
    When a thread's allotted time is complete but the thread has not finished
    processing, a context switch occurs.

    A context switch is the process of storing a thread's current state and
    later restoring the state of the thread to continue execution.
    Be aware that there is often a cost associated with a
    context switch by way of lost time saving and reloading a thread's state.
    Intelligent thread schedules do their best to minimize the number of
    context switches, while keeping an application running smoothly.
    Finally, a thread can interrupt or supersede another thread if it has a higher
    thread priority than the other thread. A thread priority is a numeric value
    associated with a thread that is taken into consideration by the thread
    scheduler when determining which threads should currently be executing.
    In Java, thread priorities are specified as integer values.

    THE IMPORTANCE OF THREAD SCHEDULING
    ===================================
    Even though multicore CPUs are quite common these days, single‐
    core CPUs were the standard in personal computing for many
    decades. During this time, operating systems developed complex
    thread‐scheduling and context‐switching algorithms that allowed
    users to execute dozens or even hundreds of threads on a single‐core
    CPU system. These scheduling algorithms allowed users to
    experience the illusion that multiple tasks were being performed at
    the same time within a single‐CPU system. For example, a user
    could listen to music while writing a paper and receive notifications
    for new messages.

    Since the number of threads requested often far outweighs the
    number of processors available even in multicore systems, these
    thread‐scheduling algorithms are still employed in operating systems
    today.
     */
}
