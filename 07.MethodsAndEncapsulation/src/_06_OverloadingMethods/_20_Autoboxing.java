package _06_OverloadingMethods;

public class _20_Autoboxing {
    /*
    In Chapter 5, you saw how Java will convert a primitive int to an object
    Integer to add it to an ArrayList through the wonders of autoboxing.
    This works for code you write too.

    public void fly(Integer numMiles) {}

    This means calling fly(3) will call the previous method as expected.
    However, what happens if you have both a primitive and an integer
    version?

    public void fly(int numMiles) {}
    public void fly(Integer numMiles) {}

    Java will match the int numMiles version.
    Java tries to use the most specific parameter list it can find.
    When the primitive int version isn’t present, it will autobox.
    However, when the primitive int version is provided,
    there is no reason for Java to do the extra work of autoboxing.
     */
}
