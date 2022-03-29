package _05_UnderstandingPolymorphism;

public class _19_ObjectVsReference {
    /*
    In Java, all objects are accessed by reference, so as a developer you never
    have direct access to the object itself. Conceptually, though, you should
    consider the object as the entity that exists in memory, allocated by the
    Java runtime environment. Regardless of the type of the reference you
    have for the object in memory, the object itself doesn’t change. For
    example, since all objects inherit java.lang.Object, they can all be
    reassigned to java.lang.Object, as shown in the following example:

    Lemur lemur = new Lemur();
    Object lemurAsObject = lemur;

    We can summarize this principle with the following two rules:
    1. The type of the object determines which properties exist within the object in memory.
    2. The type of the reference to the object determines which methods and variables
        are accessible to the Java program.

     */
}
