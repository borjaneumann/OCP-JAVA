package _01_UnderstandingInheritance;

public class _03_InheritingObject {
    /*
    In Java, all classes inherit from a single class:
    java.lang.Object, or Object for short.
    Furthermore, Object is the only class that doesn’t have a parent class.
    The compiler has been automatically inserting code into any class you write
    that doesn’t extend a specific class.

    public class Zoo { }
    public class Zoo extends java.lang.Object { }

    The key is that when Java sees you define a class that doesn’t extend
    another class, it automatically adds the syntax extends
    java.lang.Object to the class definition.

    The result is that every class gains access to any accessible methods
    in the Object class. For example, the toString() and equals() methods
    are available in Object; therefore, they are accessible in all classes

    Primitive types such as int and boolean do not inherit from Object, since
    they are not classes. Through autoboxing they can be assigned or passed
    as an instance of an associated wrapper class, which does inherit Object.
     */
}
