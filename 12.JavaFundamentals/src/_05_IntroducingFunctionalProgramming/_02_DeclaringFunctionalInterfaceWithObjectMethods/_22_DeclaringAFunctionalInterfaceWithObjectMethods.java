package _05_IntroducingFunctionalProgramming._02_DeclaringFunctionalInterfaceWithObjectMethods;

public class _22_DeclaringAFunctionalInterfaceWithObjectMethods {
    /*
    As you may remember from your previous studies, all classes inherit
    certain methods from Object. For the exam, you should be familiar with
    the following Object method declarations:
        - String toString()
        - boolean equals(Object)
        - int hashCode()

    If a functional interface includes an abstract method with
    the same signature as a public method found in Object, then those
    methods do not count toward the single abstract method test.

    Since Java assumes all classes extend from Object, you also cannot
    declare an interface method that is incompatible with Object. For
    example, declaring an abstract method int toString() in an
    interface would not compile since Object's version of the method
    returns a String.

    public interface Dive {
        String toString();
        public boolean equals(Object o);
        public abstract int hashCode();
        public void dive();
    }

    OVERRIDING TOSTRING(), EQUALS(OBJECT), AND HASHCODE()
    =====================================================
    While knowing how to properly override toString(),
    equals(Object), and hashCode() was part of Java certification
    exams prior to Java 11, this requirement was removed on all of the
    Java 11 exams. As a professional Java developer, it is important for
    you to know at least the basic rules for overriding each of these
    methods.

    toString(): The toString() method is called when you try to print
    an object or concatenate the object with a String. It is commonly
    overridden with a version that prints a unique description of the
    instance using its instance fields.

    equals(Object): The equals(Object) method is used to compare
    objects, with the default implementation just using the == operator.
    You should override the equals(Object) method anytime you want
    to conveniently compare elements for equality, especially if this
    requires checking numerous fields.

    hashCode(): Any time you override equals(Object), you must
    override hashCode() to be consistent. This means that for any two
    objects, if a.equals(b) is true, then a.hashCode()==b.hashCode()
    must also be true. If they are not consistent, then this could lead to
    invalid data and side effects in hash‐based collections such as
    HashMap and HashSet.

    All of these methods provide a default implementation in Object,
    but if you want to make intelligent use out of them, then you should
    override them.
     */
}
