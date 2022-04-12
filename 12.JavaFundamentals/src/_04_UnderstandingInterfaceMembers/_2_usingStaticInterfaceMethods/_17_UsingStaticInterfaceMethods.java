package _04_UnderstandingInterfaceMembers._2_usingStaticInterfaceMethods;

public class _17_UsingStaticInterfaceMethods {
    /*
    If you've been using an older version of Java, you might not be aware that
    Java now supports static interface methods. These methods are defined
    explicitly with the static keyword and for the most part behave just like
    static methods defined in classes.

    Static Interface Method Definition Rules
    ========================================
    1. A static method must be marked with the static keyword and include a
        method body.
    2. A static method without an access modifier is assumed to be public.
    3. A static method cannot be marked abstract or final.
    4. A static method is not inherited and cannot be accessed in a class
        implementing the interface without a reference to the interface name.

    public interface Hop {
        static int getJumpHeight() {
            return 8;
        }
    }
    it can be accessed via Hop.getJumpHeight()
    A class that implements two interfaces containing static methods with the
    same signature will still compile.
     */
}
