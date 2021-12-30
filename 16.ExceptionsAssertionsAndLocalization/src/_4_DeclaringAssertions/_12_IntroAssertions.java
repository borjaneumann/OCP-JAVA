package _4_DeclaringAssertions;

public class _12_IntroAssertions {
    //An assertion is a boolean expression that you place at a point in your code
    //where you expect something to be true. An assert statement contains this
    //statement along with an optional message.

    //Syntax

//    1. assert test_value; test_value -> boolean expression
//    2. assert test_value: message; -> message is optional

    //When assertions are enabled and the boolean expression evaluates to
    //false, then an AssertionError will be thrown at runtime. Since programs
    //aren't supposed to catch an Error, this means that assertion failures are
    //fatal and end the program!
    public static void main(String[] args) {
        int age = 2;
        int height = 2;
        int length = 2;
        String name = "Cecilia";

        assert 1 == age;
        assert (2 == height);
        assert 100.0 == length : "Problem with length";
        assert ("Ceceia".equals(name)) : "Failed to verify user data";
    }

    /*
    * If assertions are disabled, Java skips the assertion and goes on in the code.
    * If assertions are enabled and the boolean expression is true, then our
    assertion has been validated and nothing happens. The program continues
    to execute in its normal manner.
    * If assertions are enabled and the boolean expression is false, then our
    assertion is invalid and an AssertionError is thrown.

    Presuming assertions are enabled, an assertion is a shorter way of writing
    the following:
    if (!boolean_expression) throw new AssertionError(error_message)
     */



}
