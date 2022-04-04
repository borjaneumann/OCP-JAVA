package _01_UnderstandingExceptions;

public class _02_UnderstandingExceptionTypes {
    /*
    Java has a Throwable superclass for all objects that represent these events.
    Not all of them have the word exception in their class name, which can be
    confusing.

    java.lang.object  <-- java.lang.Throwable <--Java.lang.Exception <--java.lang.RuntimeException
                                              <--java.lang.Error

    Error means something went so horribly wrong that your program should
    not attempt to recover from it. For example, the disk drive “disappeared”
    or the program ran out of memory. These are abnormal conditions that you
    aren’t likely to encounter and cannot recover from.

    Throwable is the parent class of all exceptions, including the Error class.
    While you can handle Throwable and Error exceptions, it is not recommended you do so
    in your application code. In this chapter, when we refer to exceptions, we
    generally mean any class that inherits Throwable, although we are almost
    always working with the Exception class or subclasses of it.

    Checked Exceptions
    ==================
    A checked exception is an exception that must be declared or handled by
    the application code where it is thrown. In Java, checked exceptions all
    inherit Exception but not RuntimeException. Checked exceptions tend to
    be more anticipated—for example, trying to read a file that doesn’t exist.

    Checked exceptions also include any class that inherits Throwable,
    but not Error or RuntimeException. For example, a class that
    directly extends Throwable would be a checked exception. For the
    exam, though, you just need to know about checked exceptions that
    extend Exception.

    Checked exceptions? What are we checking? Java has a rule called the
    handle or declare rule. The handle or declare rule means that all checked
    exceptions that could be thrown within a method are either wrapped in
    compatible try and catch blocks or declared in the method signature.
    Because checked exceptions tend to be anticipated, Java enforces the rule
    that the programmer must do something to show the exception was
    thought about.

    Declaring an exception
    ======================
    The distinction is that checked exceptions must be handled or declared,
    while unchecked exceptions can be optionally handled or declared.

    void fall(int distance) throws IOException { // the method might throw an Exception
        if(distance > 10) {
        throw new IOException(); // I want to throw an exception
        }
    }
    Notice that you’re using two different keywords here. The throw keyword
    tells Java that you want to throw an Exception, while the throws keyword
    simply declares that the method might throw an Exception.

    Handling the exception
    ======================
    The following alternate version of the fall() method handles
    the exception:
    void fall(int distance) {
        try {
            if(distance > 10) {
            throw new IOException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    Notice that the catch statement uses Exception, not IOException. Since
    IOException is a subclass of Exception, the catch block is allowed to
    catch it.

    Unchecked Exceptions
    ====================
    An unchecked exception is any exception that does not need to be declared
    or handled by the application code where it is thrown. Unchecked
    exceptions are often referred to as runtime exceptions, although in Java,
    unchecked exceptions include any class that inherits RuntimeException or
    Error.

    A runtime exception is defined as the RuntimeException class and its
    subclasses. Runtime exceptions tend to be unexpected but not necessarily
    fatal. For example, accessing an invalid array index is unexpected. Even
    though they do inherit the Exception class, they are not checked
    exceptions.

    When you see runtime, it means unchecked.

    An unchecked exception can often occur on nearly any line of code, as it
    is not required to be handled or declared. For example, a
    NullPointerException can be thrown in the body of the following
    method if the input reference is null:
    void fall(String input) {
        System.out.println(input.toLowerCase());
    }
    We work with objects in Java so frequently, a NullPointerException can
    happen almost anywhere. If you had to declare unchecked exceptions
    everywhere, every single method would have that clutter!

    For the exam, you need to know the rules for how checked versus
    unchecked exceptions function. You don’t have to decide
    philosophically whether an exception should be checked or
    unchecked.
     */
}
