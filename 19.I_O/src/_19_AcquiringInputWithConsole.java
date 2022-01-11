import java.io.Console;

public class _19_AcquiringInputWithConsole {

    /*
    The Console class is a singleton because it is accessible only from a
    factory method and only one instance of it is created by the JVM. For
    example, if you come across code on the exam such as the following, it
    does not compile, since the constructors are all private:

    Console c = new Console(); // DOES NOT COMPILE

    The following snippet shows how to obtain a Console and use it to
    retrieve user input:
     */
    public void retrieveUserInput() {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered: " + userInput);
        } else {
            System.err.println("Console not available");
        }
    }

    /*
    The Console object may not be available, depending on where the
    code is being called. If it is not available, then System.console()
    returns null. It is imperative that you check for a null value before
    attempting to use a Console object!
     */




}
