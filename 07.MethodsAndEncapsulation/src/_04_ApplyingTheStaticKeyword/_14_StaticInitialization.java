package _04_ApplyingTheStaticKeyword;

public class _14_StaticInitialization {
    /*
    They add the static keyword to specify they should be run when the class is first loaded.
    Here’s an example:
    */
    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR; //NUM_SECONDS_PER_HOUR is initialized here. Still final.
    }

    /*
    All static initializers run when the class is first used in the order they are
    defined. The statements in them run and assign any static variables as
    needed. There is something interesting about this example. We just got
    through saying that final variables aren’t allowed to be reassigned. The
    key here is that the static initializer is the first assignment. And since it
    occurs up front, it is okay.
     */

    private static int one;
    private static final int two;
    private static final int three = 3;
    //private static final int four; // DOES NOT COMPILE (never initialized)

    static {
        one = 1;
        two = 2;
        //three = 3; // DOES NOT COMPILE (reassigned)
        //two = 4; // DOES NOT COMPILE (reassigned)
    }
    /*
    There is a common case to use a static initializer: when you need
    to initialize a static field and the code to do so requires more than
    one line. This often occurs when you want to initialize a collection
    like an ArrayList. When you do need to use a static initializer, put
    all the static initialization in the same block. That way, the order is
    obvious.
     */


}
