package _02_RecognizingExceptionClasses._03_ErrorClasses;

public class _12_ExceptionInitializerError {

    //Thrown when a static initializer throws
    //an exception and doesn’t handle it
    static {
        int[] numberOfFingersInOneHand = new int[5];
        int num = numberOfFingersInOneHand[6];
    }
    public static void main(String[] args) {
    //Exception in thread "main" java.lang.ExceptionInInitializerError
    }
}
