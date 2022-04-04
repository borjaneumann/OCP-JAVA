package _02_RecognizingExceptionClasses._01_RuntimeExceptionClasses;

public class _04_ArithmeticException {
    // Thrown when code attempts to divide by zero
    int divisionByZero(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        _04_ArithmeticException arithmeticException =new _04_ArithmeticException();
        System.out.println(arithmeticException.divisionByZero(8,0));
    }

}
