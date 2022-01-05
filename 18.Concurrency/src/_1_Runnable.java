public class _1_Runnable {

    /*java.lang.Runnable is a functional interface that takes no arguments and returns no data.
    The following is the definition of the Runnable interface:
    @FunctionalInterface public interface Runnable {
    void run();
    }
    The Runnable interface is commonly used to define the task or work a
    thread will execute, separate from the main application thread.
     */

    /*
    The following lambda expressions each implement the Runnable interface:
    Runnable sloth = () -> System.out.println("Hello World");
    Runnable snake = () -> {int i=10; i++;};
    Runnable beaver = () -> {return;};
    Runnable coyote = () -> {};

    Notice that all of these lambda expressions start with a set of empty
    parentheses, (). Also, none of the lambda expressions returns a value.

    The following lambdas, while valid for other functional interfaces, are not
    compatible with Runnable because they return a value.

    Runnable capybara = () -> ""; // DOES NOT COMPILE
    Runnable Hippopotamus = () -> 5; // DOES NOT COMPILE
    Runnable emu = () -> {return new Object();}; // DOES NOT COMPILE

     */

}
