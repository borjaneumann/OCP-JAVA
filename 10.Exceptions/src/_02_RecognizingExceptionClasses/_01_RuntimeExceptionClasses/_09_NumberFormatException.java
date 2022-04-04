package _02_RecognizingExceptionClasses._01_RuntimeExceptionClasses;

/*
Subclass of IllegalArgumentException thrownwhen an attempt is made to
convert a string to a numeric type but the string doesn’t have an appropriate format
 */
public class _09_NumberFormatException {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("äbc"));

    }
}
