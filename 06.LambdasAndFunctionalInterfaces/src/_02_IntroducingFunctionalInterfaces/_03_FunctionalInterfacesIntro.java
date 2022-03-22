package _02_IntroducingFunctionalInterfaces;

public class _03_FunctionalInterfacesIntro {
    /*
    Lambdas work with interfaces that have only one abstract method.
    Single Abstract Method (SAM) rule.
    These are called functional interfaces.

    Java provides an annotation @FunctionalInterface on some, but
    not all, functional interfaces. This annotation means the authors of
    the interface promise it will be safe to use in a lambda in the future.
    However, just because you don’t see the annotation doesn’t mean
    it’s not a functional interface. Remember that having exactly one
    abstract method is what makes it a functional interface, not the
    annotation.
     */
}
