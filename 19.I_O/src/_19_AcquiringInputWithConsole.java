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
        //Welcome to Our Zoo!
        //It has 391 animals and employs 25 people
        //The zoo spans 128.9 acres.


        //Using Console With A Locale
        //*Unlike the print stream classes, Console does not include an
        //overloaded format() method that takes a Locale instance. Instead,
        //Console relies on the system locale. Of course, you could always
        //use a specific Locale by retrieving the Writer object and passing
        //your own Locale instance, such as in the following example:
        //Console console = System.console();
        //console.writer().format(new Locale("fr", "CA"),
        //"Hello World")
}







}
