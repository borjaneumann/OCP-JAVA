package _03_CreatingNestedClasses;

public class _08_CreatingNestedClassesIntro {
    /*
    A nested class is a class that is defined within another class.

    A nested class can come in one of four flavors.
    - Inner class: A non‐ static type defined at the member level of a class
    - Static nested class: A static type defined at the member level of a class
    - Local class: A class defined within a method body
    - Anonymous class: A special case of a local class that does not have a name

    USes:
    There are many benefits of using nested classes. They can encapsulate
    helper classes by restricting them to the containing class. They can make it
    easy to create a class that will be used in only one place. They can make
    the code cleaner and easier to read. This section covers all four types of
    nested classes.

    Although you are unlikely to encounter this
    on the exam, interfaces and enums can be declared as both inner
    classes and static nested classes, but not as local or anonymous
    classes.

    When used improperly, though, nested classes can sometimes make the
    code harder to read. They also tend to tightly couple the enclosing and
    inner class, whereas there may be cases where you want to use the inner
    class by itself. In this case, you should move the inner class out into a
    separate top‐level class.
    The exam might have an inner class within another inner class.
    This tends to create code that is difficult to read, so please
    never do this in practice!
     */
}
