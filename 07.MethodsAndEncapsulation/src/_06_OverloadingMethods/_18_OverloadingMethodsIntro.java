package _06_OverloadingMethods;

public class _18_OverloadingMethodsIntro {
    /*
    Method overloading occurs when methods have the same name but different
    method signatures, which means they differ by method parameters.
    This distinction is very important.

    Overloading also allows different numbers of parameters.

    Everything other than the method name can vary for overloading methods.
    This means there can be different access modifiers, specifiers (like
    static), return types, and exception lists.

    These are all valid overloaded methods:
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}

    DUPLICATE METHODS
    public void fly(int numMiles) {}
    public int fly(int numMiles) {} // DOES NOT COMPILE
    This method doesn’t compile because it differs from the original only by
    return type. The parameter lists are the same, so they are duplicate
    methods as far as Java is concerned.

    CALLING OVERLOADED METHODS
    public void fly(int numMiles) {
        System.out.println("int");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }
     */
}
