package _01_CreatingAbstractClasses;

public class _02_2_ConstructorsInAbstractClasses {
    /*
    Even though abstract classes cannot be instantiated, they are still
    initialized through constructors by their subclasses. For example, does the
    following program compile?

    abstract class Bear {
        abstract CharSequence chew();
        public Bear() {
            System.out.println(chew()); // Does this compile?
        }
    }
    public class Panda extends Bear {
        String chew() { return "yummy!"; }
        public static void main(String[] args) {
            new Panda();
        }
    }
    Using the constructor rules you learned in Chapter 8, the compiler inserts
    a default no-argument constructor into the Panda class, which first calls
    super() in the Bear class. The Bear constructor is only called when the
    abstract class is being initialized through a subclass; therefore, there is an
    implementation of chew() at the time the constructor is called. This code
    compiles and prints yummy! at runtime.

    For the exam, remember that abstract classes are initialized with
    constructors in the same way as nonabstract classes. For example, if an
    abstract class does not provide a constructor, the compiler will
    automatically insert a default no-argument constructor.

    The primary difference between a constructor in an abstract class and a
    nonabstract class is that a constructor in abstract class can be called only
    when it is being initialized by a nonabstract subclass. This makes sense, as
    abstract classes cannot be instantiated.

     */

}
