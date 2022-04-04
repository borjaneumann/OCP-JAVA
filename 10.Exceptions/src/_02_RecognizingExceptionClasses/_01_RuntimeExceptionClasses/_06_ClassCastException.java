package _02_RecognizingExceptionClasses._01_RuntimeExceptionClasses;

/*Java protects you from impossible casts!!
Thrown when an attempt is made to cast an object
to a class of which it is not an instance
*/

public class _06_ClassCastException {
    public static void main(String[] args) {
//        String type = "Moose";
//        Integer number = (Integer) type;

            //correctly done
//        int c = 22;
//        short letter = (short) c;

        String str = "cat";
        Object obj = str;
        Integer number2 = (Integer) obj;
    }

}
