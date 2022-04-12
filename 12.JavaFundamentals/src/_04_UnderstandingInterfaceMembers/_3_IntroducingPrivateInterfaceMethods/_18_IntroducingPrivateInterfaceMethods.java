package _04_UnderstandingInterfaceMembers._3_IntroducingPrivateInterfaceMethods;

public class _18_IntroducingPrivateInterfaceMethods {
    /*
    New to Java 9, interfaces may now include private interface methods.
    Putting on our thinking cap for a minute, what do you think private
    interface methods are useful for?
    The answer is that private interface methods can be used to
    reduce code duplication.

    public interface Schedule {
    default void wakeUp() { checkTime(7); }
    default void haveBreakfast() { checkTime(9); }
    default void haveLunch() { checkTime(12); }
    default void workOut() { checkTime(18); }
    private void checkTime(int hour) {
        if (hour> 17) {
            System.out.println("You're late!");
                } else {
                    System.out.println("You have "+(17-hour)+" hours left"
                + "to make the appointment");
            }
        }
    }
    Private Interface Method Definition Rules
    =========================================
    1. A private interface method must be marked with the private modifier
    and include a method body.
    2. A private interface method may be called only by default and private
    (non‐ static) methods within the interface definition.

    Private interface methods behave a lot like instance methods within a
    class. Like private methods in a class, they cannot be declared abstract
    since they are not inherited.

     */
}
