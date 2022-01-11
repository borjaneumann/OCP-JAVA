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

    }
}
