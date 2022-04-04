package _01_UnderstandingExceptions;

public class _03_ThrowingAnException {
    /*
    You might encounter an exception that was made up for the exam.
    The question will make it obvious that these are exceptions by having the class name
    end with Exception. For example, MyMadeUpException is clearly an exception.

    On the exam, you will see two types of code that result in an exception.
    1) The first is code that’s wrong. Here’s an example:

    String[] animals = new String[0];
    System.out.println(animals[0]);

    This code throws an ArrayIndexOutOfBoundsException since the array
    has no elements. That means questions about exceptions can be hidden in
    questions that appear to be about something else.

    Tip:
    Pay special attention to code that calls a method on a null reference or
    that references an invalid array or List index. If you spot this, you know
    the correct answer is that the code throws an exception at runtime.

    2) The second way for code to result in an exception is to explicitly request
    Java to throw one. Java lets you write statements like these:
    throw new Exception();
    throw new Exception("Ow! I fell.");
    throw new RuntimeException();
    throw new RuntimeException("Ow! I fell.");

    The throw keyword tells Java you want some other part of the code to deal
    with the exception.

    Anytime you see throw or throws on the exam, make sure the
    correct one is being used. The throw keyword is used as a statement
    inside a code block to throw a new exception or rethrow an existing
    exception, while the throws keyword is used only at the end of a
    method declaration to indicate what exceptions it supports.

    When creating an exception, you can usually pass a String parameter
    with a message, or you can pass no parameters and use the defaults. We
    say usually because this is a convention. Someone could create an
    exception class that does not have a constructor that takes a message. The
    first two examples create a new object of type Exception and throw it.

    Additionally, you should know that an Exception is an Object. This
    means you can store in a variable, and this is legal:
    Exception e = new RuntimeException();
    throw e;

    throw RuntimeException(); // DOES NOT COMPILE missing new keyword

    Another one!
    3: try {
    4:      throw new RuntimeException();
    5:      throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE
    6: } catch (Exception e) {
    7: }
    Since line 4 throws an exception, line 5 can never be reached during
    runtime. The compiler recognizes this and reports an unreachable code error.

    You should not catch Throwable directly in your code, or Exception or Error.


     */

}
