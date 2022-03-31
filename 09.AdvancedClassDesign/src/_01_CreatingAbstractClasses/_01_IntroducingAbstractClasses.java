package _01_CreatingAbstractClasses;

public class _01_IntroducingAbstractClasses {
    /*
    Overriding a method potentially changes the
    behavior of a method in the parent class.

    Suppose you want to define a Bird class
    that other developers can extend and use, but you want the developers to
    specify the particular type of Bird. Also, rather than having the Bird
    version of getName() return null (or throw an exception), you want to
    ensure every class that extends Bird is required to provide its own
    overridden version of the getName() method.

    An abstract class is a class that cannot be instantiated and may
    contain abstract methods. An abstract method is a method that does not
    define an implementation when it is declared.

    Both abstract classes and abstract methods are denoted with the abstract
    modifier. Compare our previous implementation with this new one using
    an abstract Bird class:

    abstract class Bird {
        public abstract String getName(); //abstract methods are not implemented
        public void printName() {
        System.out.print(getName());
        }
    }
    public class Stork extends Bird {
        public String getName() { return "Stork!"; }
        public static void main(String[] args) {
            new Stork().printName();
        }
    }
    While it may look the same, though, the rules around how the class must be
    implemented have changed. In particular, the Stork class must now
    override the abstract getName() method.

    An abstract class is most commonly used when you want another class to
    inherit properties of a particular class, but you want the subclass to fill in
    some of the implementation details.

    OVERRIDE VS. IMPLEMENT
    ======================
    Oftentimes, when an abstract method is overridden in a subclass, it
    is referred to as implementing the method. It is described this way
    because the subclass is providing an implementation for a method
    that does not yet have one. While we tend to use the terms
    implement and override interchangeably for abstract methods, the
    term override is more accurate.

    The method override rules apply whether the abstract method is
    declared in an abstract class or, as we shall see later in this chapter,
    an interface. We will continue to use override and implement
    interchangeably in this chapter, as this is common in software
    development. Just remember that providing an implementation for
    an abstract method is considered a method override and all of the
    associated rules for overriding methods apply.

    An abstract class can be initialized, but only as part of the instantiation of
    a nonabstract subclass.

     */
}
