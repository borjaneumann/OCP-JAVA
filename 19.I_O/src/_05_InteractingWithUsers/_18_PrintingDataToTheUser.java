import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _18_InteractingWithUsers {
    public static void main(String[] args) throws IOException {
        /*
        Java includes two PrintStream instances for providing information to the
        user: System.out and System.err.
        While System.out should be old hat to you, System.err might be new to you.
        The syntax for calling and using System.err is the same as System.out but is used
        to report errors to the user in a separate stream from the regular output information.
         */

        try (var in = new FileInputStream("zoo.txt")) {
            System.out.println("Found file!");
        } catch (
                FileNotFoundException e) {
            System.err.println("File not found!");
        }
        /*
        How do they differ in practice? In part, that depends on what is executing
        the program. For example, if you are running from a command prompt,
        they will likely print text in the same format. On the other hand, if you are
        working in an integrated development environment (IDE), they might
        print the System.err text in a different color. Finally, if the code is being
        run on a server, the System.err stream might write to a different log file.
         */

        /*
        READING INPUT AS A STREAM
        The System.in returns an InputStream and is used to retrieve text input
        from the user. It is commonly wrapped with a BufferedReader via an
        InputStreamReader to use the readLine() method.

        var reader = new BufferedReader(new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println("You entered: " + userInput);

        When executed, this application first fetches text from the user until the
        user presses the Enter key. It then outputs the text the user entered to the
        screen.
         */

        /*
        CLOSING SYSTEM STREAMS
        You might have noticed that we never created or closed System.out,
        System.err, and System.in when we used them. In fact, these are the
        only I/O streams in the entire chapter that we did not use a try‐with‐
        resources block on!

        Because these are static objects, the System streams are shared by the
        entire application. The JVM creates and opens them for us. They can be
        used in a try‐with‐resources statement or by calling close(), although
        closing them is not recommended. Closing the System streams makes them
        permanently unavailable for all threads in the remainder of the program.

        What do you think the following code snippet prints?

        try (var out = System.out) {}
        System.out.println("Hello");

        Nothing. It prints nothing. Remember, the methods of PrintStream do not
        throw any checked exceptions and rely on the checkError() to report
        errors, so they fail silently.

        What about this example?
        try (var err = System.err) {}
        System.err.println("Hello");

        This one also prints nothing. Like System.out, System.err is a
        PrintStream. Even if it did throw an exception, though, we'd have a hard
        time seeing it since our stream for reporting errors is closed! Closing
        System.err is a particularly bad idea, since the stack traces from all
        exceptions will be hidden.

        Finally, what do you think this code snippet does?

        var reader = new BufferedReader(new InputStreamReader(System.in));
        try (reader) {}
        String data = reader.readLine(); // IOException

        It prints an exception at runtime. Unlike the PrintStream class, MOST INPUT STREAMS
        implementations will throw an exception if you try to
        operate on a closed stream.

         */
    }
}
