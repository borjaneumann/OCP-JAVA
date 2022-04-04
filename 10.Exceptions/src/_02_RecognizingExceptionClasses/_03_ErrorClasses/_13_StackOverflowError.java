package _02_RecognizingExceptionClasses._03_ErrorClasses;

public class _13_StackOverflowError {
    public static void doNotCodeThis(int num){
        doNotCodeThis(1);
    }
    public static void main(String[] args) {
        doNotCodeThis(1);
    }
}
