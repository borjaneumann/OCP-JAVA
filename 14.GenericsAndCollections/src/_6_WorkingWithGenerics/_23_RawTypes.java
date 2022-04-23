package _6_WorkingWithGenerics;

public class _23_RawTypes {
    /*
    The final way is to not use generics at all. This is the old way of writing
    code. It generates a compiler warning about Shippable being a raw type,
    but it does compile. Here the ship() method has an Object parameter
    since the generic type is not defined:

    class ShippableCrate implements Shippable {
    public void ship(Object t) { }
    }

    WHAT YOU CAN'T DO WITH GENERIC TYPES
    There are some limitations on what you can do with a generic type.
    These aren't on the exam, but it will be helpful to refer to this
    scenario when you are writing practice programs and run into one of
    these situations.
    Most of the limitations are due to type erasure. Oracle refers to types
    whose information is fully available at runtime as reifiable.
    Reifiable types can do anything that Java allows. Nonreifiable types
    have some limitations.
    Here are the things that you can't do with generics (and by “can't,”
    we mean without resorting to contortions like passing in a class
    object):
    Calling a constructor: Writing new T() is not allowed because at
    runtime it would be new Object().
    Creating an array of that generic type: This one is the most
    annoying, but it makes sense because you'd be creating an array of
    Object values.
    Calling instanceof: This is not allowed because at runtime
    List<Integer> and List<String> look the same to Java thanks to
    type erasure.
    Using a primitive type as a generic type parameter: This isn't a
    big deal because you can use the wrapper class instead. If you want
    a type of int, just use Integer.
    Creating a static variable as a generic type parameter: This is
    not allowed because the type is linked to the instance of the class
     */
}
