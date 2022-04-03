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

    Conflicting Modifiers
    =====================
    When working with class members, omitting the access modifier
    indicates default (package-private) access.
    When working with interface members, though, the lack of access
    modifier always indicates public access. if private or protected
    it will not compile. Variables cannot be marked abstract.

    On the exam, you are likely to get at least one question in which an
    interface includes a member that contains an invalid modifier.

    1: private final interface Crawl {
    2:  String distance;
    3:  private int MAXIMUM_DEPTH = 100;
    4:  protected abstract boolean UNDERWATER = false;
    5:  private void dig(int depth);
    6:  protected abstract double depth();
    7:  public final void surface(); }






     */

}
