package _04_UnderstandingInterfaceMembers._4_IntroPrivateStaticInterfaceMethods;

public class _19_IntroducingPrivateStaticInterfaceMethods {
    /*
    Alongside private interface methods, Java 9 added private static
    interface methods.
    The purpose of private static interface methods is to reduce code duplication in static
    methods within the interface declaration. Furthermore, because instance
    methods can access static methods within a class, they can also be
    accessed by default and private methods.

    public interface Swim {
        private static void breathe(String type) {
            System.out.println("Inhale");
            System.out.println("Performing stroke: " + type);
            System.out.println("Exhale");
        }
        static void butterfly() { breathe("butterfly"); }
        public static void freestyle() { breathe("freestyle"); }
        default void backstroke() { breathe("backstroke"); }
        private void breaststroke() { breathe("breaststroke"); }
    }
    The rules for private static interface methods are nearly the same as the rules for
    private interface methods.
    Private Static Interface Method Definition Rules
    ================================================
    1. A private static method must be marked with the private and static
    modifiers and include a method body.
    2. A private static interface method may be called only by other methods
    within the interface definition.

    Both private and private static methods can be called from default
    and private methods.
    On the other hand, a private method cannot be called from a private static method.
    This would be like trying to access an instance method from a static method
    in a class.

    WHY MARK INTERFACE METHODS PRIVATE?
    ===================================
    The answer is to improve encapsulation, as we might not want these
    methods exposed outside the interface declaration. Encapsulation
    and security work best when the outside caller knows as little as
    possible about the internal implementation of a class or an interface.
    Using private interface methods doesn't just provide a way to
    reduce code duplication, but also a way to hide some of the
    underlying implementation details from users of the interface.

     */

}
