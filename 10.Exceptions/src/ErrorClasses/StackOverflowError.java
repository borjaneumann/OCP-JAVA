package ErrorClasses;

public class StackOverflowError {
    public static void doNotCodeThis(int num){
        doNotCodeThis(1);
    }
    public static void main(String[] args) {
        doNotCodeThis(1);
    }
}
