package _2_CreatingCustomExceptions;

public class _7_PrintingStackTraces {
    public static void main(String[] args) {
        try {
            throw new _5_DeclaringExceptionClasses.CannotSwimException();//I had to make it static
        }catch (_5_DeclaringExceptionClasses.CannotSwimException e){
            e.printStackTrace();
        }
    }

}
