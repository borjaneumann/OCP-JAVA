package RunTimeExceptionClasses;

//this is a subclass of IllegalArgumentExceptiopn
//when methods to convert string to number have a wrong argument
public class NumberFormatException {


    public static void main(String[] args) {
        System.out.println(Integer.parseInt("äbc"));

    }
}
