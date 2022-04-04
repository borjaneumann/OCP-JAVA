package _02_RecognizingExceptionClasses._03_ErrorClasses;

public class _13_StackOverflowError {
    /*
    Thrown when a method calls itself too many times
    (This is called infinite recursion because the method typically calls itself
    without end.)
     */
    public static void doNotCodeThis(int num){
        doNotCodeThis(1);
    }
    public static void main(String[] args) {
        doNotCodeThis(1);
    }
}
