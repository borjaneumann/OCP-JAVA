public class _10_IdentifyingThreadingProblems {
    /*
    Intro
    =====
    A threading problem can occur in multithreaded applications when two or
    more threads interact in an unexpected and undesirable way.

    The Concurrency API was created to help eliminate potential threading
    issues common to all developers.

    Although the Concurrency API reduces the potential for threading issues,
    it does not eliminate it. In practice, finding and identifying threading
    issues within an application is often one of the most difficult tasks a
    developer can undertake.

    UNDERSTANDING LIVENESS
    ======================
    As you have seen in this chapter, many thread operations can be
    performed independently, but some require coordination.

    What happens to the application while all of these threads are waiting? In
    many cases, the waiting is ephemeral, and the user has very little idea that
    any delay has occurred. In other cases, though, the waiting may be
    extremely long, perhaps infinite.

    Liveness is the ability of an application to be able to execute in a timely
    manner. Liveness problems, then, are those in which the application
    becomes unresponsive or in some kind of “stuck” state.

    For the exam,there are three types of liveness issues with which you should be familiar:
    1) deadlock
    2) starvation, and
    3) livelock.


     */
}
