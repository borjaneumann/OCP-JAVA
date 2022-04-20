package _5_UsingCommonAnnotations;

public class _23_ProtectingArgumentsWithSafeVarargs {
    /*
    The @SafeVargs marker annotation indicates that a method does not
    perform any potential unsafe operations on its varargs parameter. It can be
    applied only to constructors or methods that cannot be overridden (aka
    methods marked private, static, or final).

    Let's review varargs for a minute. A varargs parameter is used to indicate
    the method may be passed zero or more values of the same type, by
    providing an ellipsis ( …). In addition, a method can have at most one
    varargs parameter, and it must be listed last.

    Returning to @SafeVargs, the annotation is used to indicate to other
    developers that your method does not perform any unsafe operations. It
    basically tells other developers, “Don't worry about the varargs parameter;
    I promise this method won't do anything bad with it!” It also suppresses
    unchecked compiler warnings for the varargs parameter.

    In the following example, thisIsUnsafe() performs an unsafe operation
    using its varargs parameter:

    1: import java.util.*;
    2:
    3: public class NeverDoThis {
    4:      final int thisIsUnsafe(List<Integer>… carrot) {
    5:          Object[] stick = carrot;
    6:          stick[0] = Arrays.asList("nope!");
    7:          return carrot[0].get(0); // ClassCastException at runtime
    8:      }
    9:      public static void main(String[] a) {
    10:         var carrot = new ArrayList<Integer>();
    11:         new NeverDoThis().thisIsUnsafe(carrot);
    12:     }
    13: }

    This code compiles, although it generates two compiler warnings. Both are
    related to type safety.

    [Line 4] Type safety: Potential heap pollution via varargs parameter carrot
    [Line 11] Type safety: A generic array of List<Integer> is created for a varargs parameter

    We can remove both compiler warnings by adding the @SafeVarargs
    annotation to line 4.

    3: @SafeVarargs final int thisIsUnsafe(List<Integer>…
    carrot) {

    Did we actually fix the unsafe operation? No! It still throws a
    ClassCastException at runtime on line 7. However, we made it so the
    compiler won't warn us about it anymore.

    For the exam you don't need to know how to create or resolve unsafe
    operations, as that can be complex. You just need to be able to identify
    unsafe operations and know they often involve generics.
    You should also know the annotation can be applied only to methods that
    contain a varargs parameter and are not able to be overridden. For
    example, the following do not compile:

    @SafeVarargs
    public static void eat(int meal) {} // DOES NOT COMPILE
    @SafeVarargs
    protected void drink(String… cup) {} // DOES NOT COMPILE
    @SafeVarargs
    void chew(boolean… food) {} // DOES NOT COMPILE

    The eat() method is missing a varargs parameter, while the drink() and
    chew() methods are not marked static, final, or private.
     */
}
