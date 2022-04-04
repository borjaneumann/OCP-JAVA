package _02_ImplementingInterfaces;

public class _09_ReviewingInterfaceRules {
    /*
    We summarize the interface rules in this part of the chapter in the
    following list. If you compare the list to our list of rules for an abstract
    class definition, the first four rules are similar.

    Interface Definition Rules
    ==========================
    1. Interfaces cannot be instantiated.
    2. All top-level types, including interfaces, cannot be marked protected or private.
    3. Interfaces are assumed to be abstract and cannot be marked final.
    4. Interfaces may include zero or more abstract methods.
    5. An interface can extend any number of interfaces.
    6. An interface reference may be cast to any reference that inherits the
    interface, although this may produce an exception at runtime if the classes
    aren’t related.
    7. The compiler will only report an unrelated type error for an instanceof
    operation with an interface on the right side if the reference on the left side
    is a final class that does not inherit the interface.
    8. An interface method with a body must be marked default, private,
    static, or private static (covered when studying for the 1Z0-816
    exam).

    The following are the five rules for abstract methods defined in interfaces.
    Abstract Interface Method Rules
    ===============================
    1. Abstract methods can be defined only in abstract classes or interfaces.
    2. Abstract methods cannot be declared private or final.
    3. Abstract methods must not provide a method body/implementation in the
    abstract class in which is it declared.
    4. Implementing an abstract method in a subclass follows the same rules for
    overriding a method, including covariant return types, exception
    declarations, etc.
    5. Interface methods without a body are assumed to be abstract and public.
    Notice anything? The first four rules for abstract methods, whether they be
    defined in abstract classes or interfaces, are exactly the same! The only
    new rule you need to learn for interfaces is the last one.

    Finally, there are two rules to remember for interface variables.
    Interface Variables Rules
    =========================
    1. Interface variables are assumed to be public, static, and final.
    2. Because interface variables are marked final, they must be initialized
    with a value when they are declared.

    It may be helpful to think of an interface as a specialized kind of abstract
    class, since it shares many of the same properties and rules as an abstract
    class. The primary differences between the two are that interfaces include
    implicit modifiers, do not contain constructors, do not participate in the
    instance initialization process, and support multiple inheritance.



     */
}
