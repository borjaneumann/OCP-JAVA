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

     */
}
