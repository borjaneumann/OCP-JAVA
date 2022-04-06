package _04_CallingMethodsThatThrowExceptions;

public class _21_CallingMethodsThatThrowExceptionsIntro extends Exception{
    // When you’re calling a method that throws an exception, the rules are the
    //same as within a method.

    public static class Bunny {
//        public static void main(String[] args) {
//            eatCarrot(); // does not compile. It is a checked exception and must be handled.
//        }
        private static void eatCarrot() throws _21_CallingMethodsThatThrowExceptionsIntro {
            System.out.println("Happy rabbit");
        }
        //This would work
//        public static void main(String[] args) throws CallingMethodsThatThroughExceptions { //declare exception
//            eatCarrot();
//            }
        //This also would work
        public static void main(String[] args) {
            try {
                eatCarrot();
            } catch (_21_CallingMethodsThatThrowExceptionsIntro e) {
                //handle exception
                System.out.println("Sad rabbit");
            }
        }
        /*
        You might have noticed that eatCarrot() didn’t actually throw an
        exception; it just declared that it could. This is enough for the compiler to
        require the caller to handle or declare the exception.
         */
    }
    /*
    The compiler is still on the lookout for unreachable code. Declaring an
    unused exception isn’t considered unreachable code. It gives the method
    the option to change the implementation to throw that exception in the
    future. Do you see the issue here?

    public void bad() {
        try {
            eatCarrot();
        } catch (NoMoreCarrotsException e ) { // DOES NOT COMPILE
            System.out.print("sad rabbit");
        }
    }
    public void good() throws NoMoreCarrotsException {
        eatCarrot();
    }
    private void eatCarrot() { }

    Java knows that eatCarrot() can’t throw a checked exception—which
    means there’s no way for the catch block in bad() to be reached. In
    comparison, good() is free to declare other exceptions.

    When you see a checked exception declared inside a catch block on
    the exam, check and make sure the code in the associated try block
    is capable of throwing the exception or a subclass of the exception.
    If not, the code is unreachable and does not compile. Remember that
    this rule does not extend to unchecked exceptions or exceptions
    declared in a method signature.
     */

}
