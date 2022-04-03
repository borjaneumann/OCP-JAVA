package _02_ImplementingInterfaces;

public class _06_InsertingImplicitModifiers {
    /*
    An implicit modifier is one that the compiler will
    automatically insert.

    The following list includes the implicit modifiers for interfaces that you
    need to know for the exam:

    - Interfaces are assumed to be abstract.
    - Interface variables are assumed to be public, static, and final.
    - Interface methods without a body are assumed to be abstract and public.

    public interface Soar {
        int MAX_HEIGHT = 10;
        final static boolean UNDERWATER = true;
        void fly(int speed);
        abstract void takeoff();
        public abstract double dive();
    }
    public abstract interface Soar {
        public static final int MAX_HEIGHT = 10;
        public final static boolean UNDERWATER = true;
        public abstract void fly(int speed);
        public abstract void takeoff();
        public abstract double dive();
    }




     */

}
