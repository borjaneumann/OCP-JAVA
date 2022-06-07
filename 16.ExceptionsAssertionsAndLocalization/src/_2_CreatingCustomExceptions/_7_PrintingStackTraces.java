package _2_CreatingCustomExceptions;

public class _7_PrintingStackTraces {
    public static void main(String[] args) {
        /*
        The error messages that we've been showing are called stack traces. A
        stack trace shows the exception along with the method calls it took to get
        there. The JVM automatically prints a stack trace when an exception is
        thrown that is not handled by the program.
        You can also print the stack trace on your own. The advantage is that you
        can read or log information from the stack trace and then continue to
        handle or even rethrow it.
         */
        try {
            throw new _5_DeclaringExceptionClasses.CannotSwimException();//I had to make it static
        }catch (_5_DeclaringExceptionClasses.CannotSwimException e){
            e.printStackTrace();
        }
    }
}
