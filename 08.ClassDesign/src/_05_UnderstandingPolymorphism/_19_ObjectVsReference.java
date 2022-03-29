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

    public class Primate {
        public boolean hasHair() {
            return true;
        }
    }
    public interface HasTail {
        public abstract boolean isTailStriped();
    }
    public class Lemur extends Primate implements HasTail {
        public boolean isTailStriped() {
            return false;
        }
        public int age = 10;
        public static void main(String[] args) {
            Lemur lemur = new Lemur();
            System.out.println(lemur.age); // 10
            HasTail hasTail = lemur;
            System.out.println(hasTail.isTailStriped()); // false
            Primate primate = lemur;
            System.out.println(primate.hasHair()); // true
        }
    }
    It therefore follows that successfully changing a reference of an object to a
    new reference type may give you access to new properties of the object,
    but remember, those properties existed before the reference change
    occurred.

    The same object exists in memory regardless of which reference is pointing to it.
    Depending on the type of the reference, we may only have access to certain methods.
    For example, the hasTail reference has access to the method isTailStriped() but doesn’t
    have access to the variable age defined in the Lemur class.

     */
}
