package _6_WorkingWithGenerics;

public class _24_GenericMethods {
    /*
    Up until this point, you've seen formal type parameters declared on the
    class or interface level. It is also possible to declare them on the method
    level. This is often useful for static methods since they aren't part of an
    instance that can declare the type. However, it is also allowed on non‐
    static methods.

    In this example, both methods use a generic parameter:
    public class Handler {
        public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
        }
    }
    The method parameter is the generic type T. Before the return type, we
    declare the formal type parameter of <T>. In the ship() method, we show
    how you can use the generic parameter in the return type, Crate<T>, for
    the method.
    Unless a method is obtaining the generic formal type parameter from the
    class/interface, it is specified immediately before the return type of the
    method. This can lead to some interesting‐looking code!

    2: public class More {
    3: public static <T> void sink(T t) { }
    4: public static <T> T identity(T t) { return t; }
    5: public static T noGood(T t) { return t; } // DOES NOT    COMPILE
    6: }
    Line 3 shows the formal parameter type immediately before the return
    type of void. Line 4 shows the return type being the formal parameter
    type. It looks weird, but it is correct. Line 5 omits the formal parameter
    type, and therefore it does not compile.

    OPTIONAL SYNTAX FOR INVOKING A GENERIC METHOD
    You can call a generic method normally, and the compiler will try to
    figure out which one you want. Alternatively, you can specify the
    type explicitly to make it obvious what the type is.

    Box.<String>ship("package");
    Box.<String[]>ship(args);

    As to whether this makes things clearer, it is up to you. You should
    at least be aware that this syntax exists.
    When you have a method declare a generic parameter type, it is
    independent of the class generics. Take a look at this class that declares a
    generic T at both levels:

    1: public class Crate<T> {
    2:      public <T> T tricky(T t) {
    3:      return t;
    4:      }
    5: }

    See if you can figure out the type of T on lines 1 and 2 when we call the
    code as follows:
    10: public static String createName() {
    11:     Crate<Robot> crate = new Crate<>();
    12:     return crate.tricky("bot");
    13: }

    Clearly, “T is for tricky.” Let's see what is happening. On line 1, T is
    Robot because that is what gets referenced when constructing a Crate. On
    line 2, T is String because that is what is passed to the method. When you
    see code like this, take a deep breath and write down what is happening so
    you don't get confused.

     */
}
