package _6_WorkingWithGenerics;

public class _22_GenericInterfaces {
    /*
    Just like a class, an interface can declare a formal type parameter. For
    example, the following Shippable interface uses a generic type as the
    argument to its ship() method:

    public interface Shippable<T> {
        void ship(T t);
    }
    There are three ways a class can approach implementing this interface.
    The first is to specify the generic type in the class. The following concrete
    class says that it deals only with robots. This lets it declare the ship()
    method with a Robot parameter.
    class ShippableRobotCrate implements Shippable<Robot> {
        public void ship(Robot t) { }
    }
    The next way is to create a generic class. The following concrete class
    allows the caller to specify the type of the generic:
    class ShippableAbstractCrate<U> implements Shippable<U> {
        public void ship(U t) { }
    }
    In this example, the type parameter could have been named anything,
    including T. We used U in the example so that it isn't confusing as to what
    T refers to. The exam won't mind trying to confuse you by using the same
    type parameter name.
     */
}
