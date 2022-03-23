package _01_DesigningMethods;

public class _02_OptionalSpecifiers {
    /*
    You can have zero or more specifiers in a method declaration.
    - static    -> The static modifier is used for class methods.
    - abstract  -> The abstract modifier is used when a method body is not provided.
    - final -   > When a method is not allowed to be overridden by a subclass.
    - synchronized -> It is used with multithreaded code.
    - native    -> The native modifier is used when interacting with code written in
    another language such as C++. It is not on either OCP 11 exam.
    - strictfp  -> The strictfp modifier is used for making floating-point
    calculations portable. It is not on either OCP 11 exam.

    Do you see why these compile or don’t compile?

    public void walk1() {}
    public final void walk2() {}
    public static final void walk3() {}
    public final static void walk4() {}
    public modifier void walk5() {} // DOES NOT COMPILE
    public void final walk6() {} // DOES NOT COMPILE
    final public void walk7() {}

    The walk7() method does compile. Java allows the optional specifiers to
    appear before the access modifier. This is a weird case and not one you
    need to know for the exam. We are mentioning it so you don’t get
    confused when practicing.
     */
}
