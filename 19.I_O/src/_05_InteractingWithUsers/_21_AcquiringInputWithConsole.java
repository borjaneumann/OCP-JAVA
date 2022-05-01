import java.io.Console;
import java.util.Arrays;
import java.util.Locale;

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

    /*reader() and writer()
    The Console class includes access to two streams for reading and writing data.

    public Reader reader()
    public PrintWriter writer()

    Accessing these classes is analogous to calling System.in and System.out
    directly, although they use character streams rather than byte streams. In
    this manner, they are more appropriate for handling text data.
     */

    /* format()
    For printing data with a Console, you can skip calling the
    writer().format() and output the data directly to the stream in a single
    call.

    public Console format(String format, Object… args

    The format() method behaves the same as the format() method on the
    stream classes, formatting and printing a String while applying various
    arguments. They are so alike, in fact, that there's even an equivalent
    Console printf() method that does the same thing as format(). W

    The following sample code prints information to the user: */
    public void retrieveConsoleInputFormat() {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().println("Welcome to Our Zoo!");
            console.format("It has %d animals and employs %d people",
                    391, 25);
            console.writer().println();
            console.printf("The zoo spans %5.1f acres", 128.91);
        }
    }
    //Welcome to Our Zoo!
    //It has 391 animals and employs 25 people
    //The zoo spans 128.9 acres.


    //Using Console With A Locale
    //*Unlike the print stream classes, Console does not include an
    //overloaded format() method that takes a Locale instance. Instead,
    //Console relies on the system locale. Of course, you could always
    //use a specific Locale by retrieving the Writer object and passing
    //your own Locale instance, such as in the following example:

//        Console console = System.console();
//        console.writer().format(new Locale("fr", "CA"), "Hello World");

    /*
    readLine() and readPassword()

    The Console class includes four methods for retrieving regular text data from the user.
    public String readLine()
    public String readLine(String fmt, Object… args)
    public char[] readPassword()
    public char[] readPassword(String fmt, Object… args)

    Like using System.in with a BufferedReader, the Console readLine()
    method reads input until the user presses the Enter key. The overloaded
    version of readLine() displays a formatted message prompt prior to
    requesting input.
    The readPassword() methods are similar to the readLine() method with
    two important differences.
    The text the user types is not echoed back and displayed on the screen as
    they are typing.
    The data is returned as a char[] instead of a String.
    The first feature improves security by not showing the password on the
    screen if someone happens to be sitting next to you. The second feature
    involves preventing passwords from entering the String pool and will be
    discussed in Chapter 22.
     */

    /*
    REVIEWING CONSOLE METHODS

    The last code sample we present asks the user a series of questions and
    prints results based on this information using many of various methods we
    learned in this section:
    */
    public void reviewingMethods() {
        Console console = System.console();
        if (console == null) {
            throw new RuntimeException("Console not available");
        } else {
            String name = console.readLine("Please enter your name: ");
            console.writer().format("Hi %s", name);
            console.writer().println();
            console.format("What is your address? ");
            String address = console.readLine();
            char[] password = console.readPassword("Enter a password "
                    + "between %d and %d characters: ", 5, 10);
            char[] verify = console.readPassword("Enter the password again: ");
            console.printf("Passwords "
                            + (Arrays.equals(password, verify) ? "match" : "do not match"));
        }
    }
    /*
    Assuming a Console is available, the output should resemble the following:
    Please enter your name: Max
    Hi Max
    What is your address? Spoonerville
    Enter a password between 5 and 10 digits:
    Enter the password again:
    Passwords match
         */

}

