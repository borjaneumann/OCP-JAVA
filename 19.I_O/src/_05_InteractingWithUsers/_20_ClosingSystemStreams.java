package _05_InteractingWithUsers;

public class _20_ClosingSystemStreams {
    /*
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
    errors, so they fail silently.What about this example?

    try (var err = System.err) {}
    System.err.println("Hello");

    This one also prints nothing. Like System.out, System.err is a
    PrintStream. Even if it did throw an exception, though, we'd have a hard
    time seeing it since our stream for reporting errors is closed! Closing
    System.err is a particularly bad idea, since the stack traces from all
    exceptions will be hidden.Finally, what do you think this code snippet does?

    var reader = new BufferedReader(new
    InputStreamReader(System.in));
    try (reader) {}
    String data = reader.readLine(); // IOException

    It prints an exception at runtime. Unlike the PrintStream class, most
    InputStream implementations will throw an exception if you try to
    operate on a closed stream.
     */
}
