package _5_UsingCommonAnnotations;

public class _22_IgnoringWarningsWithSupressWarnings {
    /*
    Applying this annotation to a class, method, or
    type basically tells the compiler, “I know what I am doing; do not warn
    me about this.” Unlike the previous annotations, it requires a String[]
    value() parameter.

    Common @SuppressWarnings values
    Value               Description
    =========================================================================
    "deprecation"       Ignore warnings related to types or methods marked with
                        the @Deprecated annotation.
    ----------------------------------------------------------------------------
    "unchecked"         Ignore warnings related to the use of raw types, such as
                        List instead of List<String>.
    ---------------------------------------------------------------------------

    The annotation actually supports a lot of other values, but for the exam,
    you only need to know the ones listed in this table.

    import java.util.*;
    class SongBird {
        @Deprecated static void sing(int volume) {}
        static Object chirp(List<String> data) { return
            data.size(); }
    }
    public class Nightingale {
        public void wakeUp() {
                SongBird.sing(10);
    }
    public void goToBed() {
        SongBird.chirp(new ArrayList());
    }
    public static void main(String[] args) {
            var birdy = new Nightingale();
            birdy.wakeUp();
            birdy.goToBed();
        }
    }
    This code compiles and runs but produces two compiler warnings.
    Nightingale.java uses or overrides a deprecated API.
    Nightingale.java uses unchecked or unsafe operations.
    The first warning is because we are using a method SongBird.sing() that
    is deprecated. The second warning is triggered by the call to new
    ArrayList(), which does not define a generic type. An improved
    implementation would be to use new ArrayList<String>().

    Let's say we are absolutely sure that we don't want to change our
    Nightingale implementation, and we don't want the compiler to bother us
    anymore about these warnings. Adding the @SuppressWarnings
    annotation, with the correct values, accomplishes this.

    @SuppressWarnings("deprecation") public void wakeUp() {
        SongBird.sing(10);
    }
    @SuppressWarnings("unchecked") public void goToBed() {
        SongBird.chirp(new ArrayList());
    }
    Now our code compiles, and no warnings are generated.

    You should use the @SuppressWarnings annotation sparingly.
    Oftentimes, the compiler is correct in alerting you to potential
    coding problems. In some cases, a developer may use this annotation
    as a way to ignore a problem, rather than refactoring code to solve it.
     */
}
