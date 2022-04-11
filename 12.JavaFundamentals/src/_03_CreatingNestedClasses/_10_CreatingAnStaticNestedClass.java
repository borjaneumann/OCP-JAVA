package _03_CreatingNestedClasses;

public class _10_CreatingAnStaticNestedClass {
    /*
    A static nested class is a static type defined at the member level. Unlike
    an inner class, a static nested class can be instantiated without an
    instance of the enclosing class. The trade‐off, though, is it can't access
    instance variables or methods in the outer class directly. It can be done but
    requires an explicit reference to an outer class variable.
    In other words, it is like a top‐level class except for the following:

    - The nesting creates a namespace because the enclosing class name must
    be used to refer to it.
    - It can be made private or use one of the other access modifiers to
    encapsulate it.
    - The enclosing class can refer to the fields and methods of the static
    nested class.

    Let's take a look at an example:
    1: public class Enclosing {
    2:      static class Nested {
    3:          private int price = 6;
    4:      }
    5: public static void main(String[] args) {
    6:      Nested nested = new Nested();
    7:      System.out.println(nested.price);
    8: } }

    Line 6 instantiates the nested class. Since the class is static, you do not
    need an instance of Enclosing to use it. You are allowed to access
    private instance variables, which is shown on line 7.

    IMPORTING A STATIC NESTED CLASS
    Importing a static nested class is interesting. You can import it
    using a regular import.
    // Toucan.java
    package bird;
    public class Toucan {
        public static class Beak {}
    }
    // BirdWatcher.java
    package watcher;
    import bird.Toucan.Beak; // regular import ok
    public class BirdWatcher {
        Beak beak;
    }
    Since it is static, you can also use a static import.
    import static bird.Toucan.Beak;

    Either one will compile. Surprising, isn't it? Remember, Java treats
    the enclosing class as if it were a namespace.
     */
}
