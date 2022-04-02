package _01_CreatingAbstractClasses;

public class _04_ReviewingAbstractClassRules {
    /*
    Abstract Class Definition Rules
    ================================
    1. Abstract classes cannot be instantiated.
    2. All top-level types, including abstract classes, cannot be marked
    protected or private.
    3. Abstract classes cannot be marked final.
    4. Abstract classes may include zero or more abstract and nonabstract
    methods.
    5. An abstract class that extends another abstract class inherits all of its
    abstract methods.
    6. The first concrete class that extends an abstract class must provide an
    implementation for all of the inherited abstract methods.
    7. Abstract class constructors follow the same rules for initialization as
    regular constructors, except they can be called only as part of the
    initialization of a subclass.

    These rules for abstract methods apply regardless of whether the abstract
    method is defined in an abstract class or interface.

    Abstract Method Definition Rules
    ================================
    1. Abstract methods can be defined only in abstract classes or interfaces.
    2. Abstract methods cannot be declared private or final.
    3. Abstract methods must not provide a method body/implementation in the
    abstract class in which they are declared.
    4. Implementing an abstract method in a subclass follows the same rules for
    overriding a method, including covariant return types, exception
    declarations, etc.
     */
}
