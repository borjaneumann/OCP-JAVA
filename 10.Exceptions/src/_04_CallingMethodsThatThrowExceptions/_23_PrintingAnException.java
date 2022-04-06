package _04_CallingMethodsThatThrowExceptions;

public class _23_PrintingAnException {
    /*three ways to do it
    1.Java does it sending their own message
    2.We do it and we write our own message
    3.Print where the stack trace comes from
     */
    public static void main(String[] args) {
        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
    /*
    This code results in the following output:
    #1 java.lang.RuntimeException: cannot hop -> the exception type and message.
    #2 cannot hop                             -> shows just the message.
    #3 java.lang.RuntimeException: cannot hop -> shows a stack trace.
            at Handling.hop(Handling.java:15)
            at Handling.main(Handling.java:7)

    The stack trace is usually the most helpful one because it is a picture in
    time the moment the exception is thrown. It shows the hierarchy of
    method calls that were made to reach the line that threw the exception. On
    the exam, you will mostly see the first approach. This is because the exam
    often shows code snippets.

    The stack trace shows all the methods on the stack. Every time you call a method, Java
    adds it to the stack until it completes. When an exception is thrown, it goes
    through the stack until it finds a method that can handle it or it runs out of
    stack.

    WHY SWALLOWING EXCEPTIONS IS BAD
    ================================
    Because checked exceptions require you to handle or declare them,
    there is a temptation to catch them so they “go away.” But doing so
    can cause problems. In the following code, there’s a problem reading the file:

    public static void main(String... p) {
        String textInFile = null;
        try {
            textInFile = readInFile();
        } catch (IOException e) {
            // ignore exception
        }
        // imagine many lines of code here
        System.out.println(textInFile.replace(" ", ""));
    }
    private static String readInFile() throws IOException {
        throw new IOException();
    }
    The code results in a NullPointerException. Java doesn’t tell you
    anything about the original IOException because it was handled poorly.
    When writing this book, we tend to swallow exceptions because
    many of our examples are artificial in nature. However, when you’re
    writing your own code, you should print out a stack trace or at least
    a message when catching an exception. Also, consider whether
    continuing is the best course of action. In our example, the program
    can’t do anything after it fails to read in the file. It might as well
    have just thrown the IOException.
     */
}
