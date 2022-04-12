package _05_IntroducingFunctionalProgramming._01_DefiningAFunctionalInterface;

public class _21_DefiningAFunctionalInterface {
    /*
    Functional interfaces are used as the basis for lambda expressions in
    functional programming. A functional interface is an interface that
    contains a single abstract method. Your friend Sam can help you
    remember this because it is officially known as a single abstract method
    (SAM) rule.
    A lambda expression is a block of code that gets passed around, sort of
    like an anonymous class that defines one method.

    @FunctionalInterface
    public interface Sprint {
            public void sprint(int speed);
        }
        public class Tiger implements Sprint {
            public void sprint(int speed) {
            System.out.println("Animal is sprinting fast! " + speed);
        }
    }
    In this example, the Sprint interface is a functional interface, because it
    contains exactly one abstract method, and the Tiger class is a valid class
    that implements the interface.

    Given our previous Sprint functional interface, which of the following are functional interfaces?

    public interface Dash extends Sprint {} // functional interface
    public interface Skip extends Sprint {
        void skip();
    }
    public interface Sleep {
        private void snore() {}
        default int getZzz() { return 1; }
    }
    public interface Climb { // functional interface
        void reach();
        default void fall() {}
        static int getBackUp() { return 100; }
        private static boolean checkHeight() { return true; }
    }

     */
}
