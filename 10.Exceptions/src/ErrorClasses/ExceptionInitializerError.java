package ErrorClasses;

public class ExceptionInitializerError {
    static {
        int[] numberOfFingersInOneHand = new int[5];
        int num = numberOfFingersInOneHand[6];
    }
    public static void main(String[] args) {

    }
}
