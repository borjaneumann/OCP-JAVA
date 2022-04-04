package _02_RecognizingExceptionClasses._03_ErrorClasses;

public class _12_ExceptionInitializerError {

    /*Thrown when a static initializer throws an exception and doesn’t handle it.
    Java runs static initializers the first time a class is used. If one of the
    static initializers throws an exception, Java can’t start using the class.
     */

    static {
        int[] numberOfFingersInOneHand = new int[5];
        int num = numberOfFingersInOneHand[6];
    }
    public static void main(String[] args) {
    //Exception in thread "main" java.lang.ExceptionInInitializerError
    }
}
