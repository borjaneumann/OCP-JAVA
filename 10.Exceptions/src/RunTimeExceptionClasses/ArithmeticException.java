package RunTimeExceptionClasses;

public class ArithmeticException {
    int divisionByZero(int a, int b){
        return a/b;
    }
    public static void main(String[] args) {
        ArithmeticException arithmeticException =new ArithmeticException();
        System.out.println(arithmeticException.divisionByZero(8,0));
    }

}
