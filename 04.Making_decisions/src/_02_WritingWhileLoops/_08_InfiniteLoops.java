package _02_WritingWhileLoops;

public class _08_InfiniteLoops {
    /*
    Make sure Loops always terminate!
    Failure to terminate a loop can lead to numerous problems in
    practice including overflow exceptions, memory leaks, slow performance,
    and even bad data.

    An infinite loop is a loop whose termination condition is never reached during runtime.
    Anytime you write a loop, you should examine it to determine whether the
    termination condition is always eventually met under some condition.
    For example, a loop in which no variables are changing between two
    executions suggests that the termination condition may not be met. The
    loop variables should always be moving in a particular direction.

    A PRACTICAL USE OF AN INFINITE LOOP
    -----------------------------------
    Process that wakes up every 30 seconds to look for work to be done and then goes back to sleep afterward.
    make sure it can be stopped and that there are not many o fthis processes running to draing the computer's resources.
     */
    public static void main(String[] args) {
        int a = 5;
        int counter = 0;
        while (a < 10) {
            counter++;
        }
    }
}
