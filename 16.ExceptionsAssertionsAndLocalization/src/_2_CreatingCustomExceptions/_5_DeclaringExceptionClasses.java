package _2_CreatingCustomExceptions;

public class _5_DeclaringExceptionClasses {

    /*Sometimes, you want to write a method with a more specialized type of exception. You can
    create your own exception class to do this.

    While you can extend any exception
    class, it is most common to extend Exception (for checked) or
    RuntimeException (for unchecked).
    Can you figure out whether the exceptions are checked or unchecked in this example?*/

    static class CannotSwimException extends Exception {
    }

    class DangerInTheWater extends RuntimeException {
    }

    class SharkInTheWaterException extends DangerInTheWater {
    }

    class Dolphin {
        public void swim() throws CannotSwimException {
            // logic here
        }
    }
    /*
    Class CannotSwimException is a checked exception because it extends directly from
    Exception. Not being able to swim is pretty bad when we are trying to
    swim, so we want to force callers to deal with this situation.

    Class DangerInTheWater declares an unchecked exception because it extends directly from
    RuntimeException.
    On class SharkInTheWaterException, we have another unchecked exception
    because it extends indirectly from RuntimeException. It is pretty unlikely
    that there will be a shark in the water. We might even be swimming in a
    pool where the odds of a shark are 0 percent! We don't want to force the
    caller to deal with everything that might remotely happen, so we leave this
    as an unchecked exception.

    The method in class Dolphin declares that it might throw the checked
    CannotSwimException. The method implementation could be written to
    actually throw it or not. The method implementation could also be written
    to throw a SharkInTheWaterException, an
    ArrayIndexOutOfBoundsException, or any other runtime exception.
     */
}
