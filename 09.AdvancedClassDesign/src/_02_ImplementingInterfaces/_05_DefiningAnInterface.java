package _02_ImplementingInterfaces;

public class _05_DefiningAnInterface {
    /*
    Intro and Definition
    =======================
    Although Java doesn’t allow multiple inheritance of state, it does allow a
    class to implement any number of interfaces. An interface is an abstract
    data type are that declares a list of abstract methods that any class
    implementing the interface must provide. An interface can also include
    constant variables. Both abstract methods and constant variables included
    with an interface are implicitly assumed to be public.

    With Java 8, interfaces were updated to include static and default methods.
    A default method is one in which the interface method has a body
    and is not marked abstract. It was added for backward
    compatibility, allowing an older class to use a new version of an
    interface that contains a new method, without having to modify the
    existing class.
    In Java 9, interfaces were updated to support private and private
    static methods. Both of these types were added for code reusability
    within an interface declaration and cannot be called outside the
    interface definition.

    In Java, an interface is defined with the interface keyword, analogous to
    the class keyword used when defining a class.

    public abstract interface CanBurrow {
        public abstract Float getSpeed(int age);    <- abstract interface method
        public static final int MINIMUM_DEPTH = 2;  <- Interface variable
    }
    implicit modifiers: public static final, public abstract, abstract
    An interface has public or default (package-private) access modifier.
    Interface variables are referred to as constants because they are assumed
    to be public, static, and final.
    They are initialized with a constant value when they are declared.
    Since they are public and static, they can be used outside the interface declaration without
    requiring an instance of the interface.

    One aspect of an interface declaration that differs from an
    abstract class is that it contains implicit modifiers. An implicit modifier is
    a modifier that the compiler automatically adds to a class, interface,
    method, or variable declaration. For example, an interface is always
    considered to be abstract, even if it is not marked so.

    Interfaces are not required to define any methods. Explain what the issue is!

    public abstract interface WalksOnTwoLegs {}
    public class Biped {
        public static void main(String[] args) {
    var e = new WalksOnTwoLegs(); // DOES NOT COMPILE
        }
    }
    public final interface WalksOnEightLegs {} // DOES NOT COMPILE

    How do you use an interface?
    ============================
    Keywords implement, can implements several interfaces. The method signature must
    match.

    interface Climb {
        Number getSpeed(int age);
    }
    public class FieldMOuse implements Climb, CanBurrow {
        public Float getSpeed(int age) {
            return 11f;
        }
    }
    A class can implement multiple interfaces, each
    separated by a comma (,). If any of the interfaces define abstract methods,
    then the concrete class is required to override them.
     */
}
