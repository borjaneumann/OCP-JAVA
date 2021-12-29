package _2_CreatingCustomExceptions;

import java.io.FileNotFoundException;

public class _6_AddingCustomConstructors {
    /*Let's see how to pass more information in your exception.
    The following example shows the three most common constructors
    defined by the Exception class:*/

    public class CannotSwimException extends Exception {
        public CannotSwimException() {
            super(); // Optional, compiler will insert automatically
        }
        public CannotSwimException(Exception e) {
            super(e);
        }
        public CannotSwimException(String message) {
            super(message);
        }

        //For example, the following constructor takes an Exception and calls the parent
        //constructor that takes a String:
//        public CannotRunException(Exception e) {
//            super("Cannot run because: " + e.toString());
//        }

    }

    public static void main(String[] args) {
//        throw new CannotSwimException();
//        throw new CannotSwimException("broken fin");
    }
    //Another option: exception within exception
//   public static void main(String[] unused) throws Exception {
//       throw new CannotSwimException(
//          new FileNotFoundException("Cannot find shark file"));
//    }


}
