package _5_UsingCommonAnnotations;

public class _20_DeclaringInterfacesWithFuncionalInterface {
    /*
    The @FunctionalInterface marker annotation can be applied to any valid
    functional interface.

    @FunctionalInterface public interface Intelligence {
        int cunning();
    }
    The compiler will report an error, though, if applied to anything other than
    a valid functional interface. From what you learned in Chapter 12, which
    of the following declarations compile?

    @FunctionalInterface abstract class Reptile {
        abstract String getName();
    }
    @FunctionalInterface interface Slimy {}
    @FunctionalInterface interface Scaley {
        boolean isSnake();
    }
    @FunctionalInterface interface Rough extends Scaley {
        void checkType();
    }
    @FunctionalInterface interface Smooth extends Scaley {
        boolean equals(Object unused);
    }

    The Reptile declaration does not compile, because the
    @FunctionalInterface annotation can be applied only to interfaces. The
    Slimy interface does not compile, because it does not contain any abstract
    methods. The Scaley interface compiles, as it contains exactly one
    abstract method.

    The Rough interface does not compile, because it contains two abstract
    methods, one of which it inherits from Scaley. Finally, the Smooth
    interface contains two abstract methods, although since one matches the
    signature of a method in java.lang.Object, it does compile.
    Like we saw with the @Override annotation, removing the
    @FunctionalInterface annotation in the invalid declarations would allow
    the code to compile. Review functional interfaces in Chapter 12 if you had
    any trouble with these examples.

    If you are declaring a complex interface, perhaps one that contains
    static, private, and default methods, there's a simple test you
    can perform to determine whether it is a valid functional interface.
    Just add the @FunctionalInterface annotation to it! If it compiles,
    it is a functional interface and can be used with lambda expressions.
     */
}
