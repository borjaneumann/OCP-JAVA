package _1_ReviewingExceptions;

public class _3_ExaminingExceptionCategories {

    //all exceptions inherit from Throwable
    //the only ones you should be handling or declaring extend from the Exception class.

    /*
    A checked exception must be handled or declared by the
    application code where it is thrown. The handle or declare rule dictates
    that a checked exception must be either caught in a catch block or thrown
    to the caller by including it in the method declaration.
     */

    //CHECKED EXCEPTIONS EXAMPLES
    public void open() {
        try {
            throw new Exception();
        } catch (Exception e) {
            // Handles exception
        }
    }
    public void close() throws Exception {
        // Declares exceptions
        throw new Exception();
    }
    /*
    In Java, all exceptions that inherit Exception but not RuntimeException
    are considered checked exceptions.
    On the other hand, an unchecked exception does not need to be handled or
    declared. Unchecked exceptions are often referred to as runtime
    exceptions, although in Java unchecked exceptions include any class that
    inherits RuntimeException or Error. An Error is fatal, and it is
    considered a poor practice to catch it
     */

}
