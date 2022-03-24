package _01_UnderstandingInheritance;

public class _01_UnderstandingInheritance {
    /*
    Inheritance is the process by which a subclass automatically includes
    any public or protected members of the class,
    including primitives, objects, or methods, defined in the parent class.

    For illustrative purposes, we refer to any class that inherits from another
    class as a subclass or child class, as it is considered a descendant of that
    class. Alternatively, we refer to the class that the child inherits from as the
    superclass or parent class, as it is considered an ancestor of the class. And
    inheritance is transitive. If child class X inherits from parent class Y,
    which in turn inherits from a parent class Z, then class X would be
    considered a subclass, or descendant, of class Z. By comparison, X is a
    direct descendant only of class Y, and Y is a direct descendant only of
    class Z.

    public class BigCat {
        public double size;
    }
    public class Jaguar extends BigCat {
        public Jaguar() {
            size = 10.2;
        }
        public void printDetails() {
            System.out.println(size);
        }
    }
     */
}
