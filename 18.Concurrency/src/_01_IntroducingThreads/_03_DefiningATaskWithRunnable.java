package _01_IntroducingThreads;

public class _03_DefiningATaskWithRunnable {
    /*
    java.lang.Runnable is a functional interface that takes no arguments
    and returns no data. The following is the definition of the Runnable interface:

    @FunctionalInterface public interface Runnable {
    void run();
    }

    The Runnable interface is commonly used to define the task or work a
    thread will execute, separate from the main application thread. We will be
    relying on the Runnable interface throughout this chapter, especially when
    we discuss applying parallel operations to streams.
    The following lambda expressions each implement the Runnable interface:
    */
    Runnable sloth = () -> System.out.println("Hello World");
    Runnable snake = () -> {int i=10; i++;};
    Runnable beaver = () -> {return;};
    Runnable coyote = () -> {};
    /*
    Notice that all of these lambda expressions start with a set of empty
    parentheses, (). Also, none of the lambda expressions returns a value. The
    following lambdas, while valid for other functional interfaces, are not
    compatible with Runnable because they return a value.

    Runnable capybara = () -> ""; // DOES NOT COMPILE
    Runnable Hippopotamus = () -> 5; // DOES NOT COMPILE
    Runnable emu = () -> {return new Object();}; // DOES NOT COMPILE

    CREATING RUNNABLE CLASSES
    =========================
    Even though Runnable is a functional interface, many classes
    implement it directly, as shown in the following code:

    public class CalculateAverage implements Runnable {
        public void run() {
            // Define work here
        }
    }

    It is also useful if you need to pass information to your Runnable
    object to be used by the run() method, such as in the following
    constructor:

    public class CalculateAverages implements Runnable {
        private double[] scores;
        public CalculateAverages(double[] scores) {
            this.scores = scores;
    }
    public void run() {
        // Define work here that uses the scores object
        }
    }

    In this chapter, we focus on creating lambda expressions that
    implicitly implement the Runnable interface. Just be aware that it is
    commonly used in class definitions.
     */
}
