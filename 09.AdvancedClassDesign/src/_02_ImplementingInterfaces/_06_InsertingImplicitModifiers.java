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

    Differences between Interfaces and Abstract Classes
    ===================================================
    Even though abstract classes and interfaces are both considered abstract
    types, only interfaces make use of implicit modifiers. This means that an
    abstract class and interface with similar declarations may have very
    different properties. For example, how do the play() methods differ in the
    following two definitions?

    abstract class Husky {
        abstract void play();
    }
    interface Poodle {
        void play();
    }
    Both of these method definitions are considered abstract. That said, the
    Husky class will not compile if the play() method is not marked
    abstract, whereas the method in the Poodle interface will compile with
    or without the abstract modifier.
    Access level. Even though neither has an access modifier, they do not have
    the same access level. The play() method in Husky class is considered default (package-private).
    Can you spot anything wrong with the following class definitions that use our abstract types?

    class Webby extends Husky {
        void play() {}
    }
    class Georgette implements Poodle {
        void play() {} //here
    }







     */

}
