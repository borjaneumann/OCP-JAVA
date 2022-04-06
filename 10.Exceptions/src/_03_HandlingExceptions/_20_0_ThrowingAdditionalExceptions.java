package _03_HandlingExceptions;

import java.io.FileReader;
import java.io.IOException;

public class _20_0_ThrowingAdditionalExceptions {
    //What happens when an exception is thrown inside of a catch or finally block?
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e) {
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {
            }
        }
        //second example (Tough example)
        _20_0_ThrowingAdditionalExceptions a1 = new _20_0_ThrowingAdditionalExceptions();
        a1.exceptions();
    }

    private static FileReader read() throws IOException {
        return null;
    }
    /*
    Most of the examples you see with exception handling on the exam are
    abstract. They use letters or numbers to make sure you understand the flow.
     */
    public void exceptionHandlingExamExample() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new RuntimeException();
        } finally {
//            throw new Exception();  // This one shows that only the last exception to be thrown matters
        }
        /*
        Since the finally block throws an exception
        of its own on line 31, this one gets thrown. The exception from the catch
        block gets forgotten about. This is why you often see another try/catch
        inside a finally block—to make sure it doesn’t mask the exception from
        the catch block.
         */
    }
    public String exceptions() {
        StringBuilder result = new StringBuilder();
        String v = null;
        try {
            try {
                result.append("before_");
                v.length();
                result.append("after_");
            } catch (NullPointerException e) {
                result.append("catch_");
                throw new RuntimeException();
            } finally {
                result.append("finally_");
                throw new Exception();
            }
        } catch (Exception e) {
            result.append("done");
        }
        return result.toString(); //before_catch_finally_done.
        /*
        The correct answer is before_catch_finally_done. First on line 52,
        "before_" is added. Line 53 throws a NullPointerException. Line 54 is
        skipped as Java goes straight to the catch block. Line 55 does catch the
        exception, and "catch_" is added on line 56. Then line 57 throws a
        RuntimeException. The finally block runs after the catch regardless of
        whether an exception is thrown; it adds "finally_" to result. At this
        point, we have completed the inner try statement that ran on lines 51–61.
        The outer catch block then sees an exception was thrown and catches it
        on line 45; it adds "done" to result.
         */
    }
}
