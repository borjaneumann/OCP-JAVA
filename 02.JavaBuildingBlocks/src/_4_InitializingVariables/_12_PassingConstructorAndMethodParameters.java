package _4_InitializingVariables;

public class _12_PassingConstructorAndMethodParameters {
    /*
    Variables passed to a constructor or method are called constructor
    parameters or method parameters, respectively.

    These parameters are local variables that have been pre-initialized.
    In other words, they are like local variables that have been initialized
    before the method is called, by the caller.
    The rules for initializing constructor and method parameters are
    the same, so we’ll focus primarily on method parameters.

    check is a method parameter.
    public void findAnswer(boolean check) {}

    public void checkAnswer() {
        boolean value;
        findAnswer(value); // DOES NOT COMPILE
    }
    The call to findAnswer() does not compile because it tries to use a
    variable that is not initialized.
     */
}
