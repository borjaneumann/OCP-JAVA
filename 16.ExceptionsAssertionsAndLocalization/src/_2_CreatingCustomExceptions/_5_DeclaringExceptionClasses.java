package _2_CreatingCustomExceptions;

public class _5_DeclaringExceptionClasses {

    //Sometimes, you want to write a method with a more specialized type of exception. You can
    //create your own exception class to do this.

    /*While you can extend any exception
    class, it is most common to extend Exception (for checked) or
    RuntimeException (for unchecked).
    Can you figure out whether the exceptions are checked or unchecked in this example?*/

    class CannotSwimException extends Exception {}
    class DangerInTheWater extends RuntimeException {}
    class SharkInTheWaterException extends DangerInTheWater {}
    class Dolphin {
    public void swim() throws CannotSwimException {
            // logic here
    }
}

}
