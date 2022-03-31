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


     */
}
