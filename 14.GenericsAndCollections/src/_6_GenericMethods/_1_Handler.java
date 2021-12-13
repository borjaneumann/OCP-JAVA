package _6_GenericMethods;

import javax.swing.*;

import _4_WorkingWithGenerics._2_GenericClasses.Crate;

public class _1_Handler {
    public static <T> void prepare (T t) {
        System.out.println("Preparing " + t);
    }
    public static <T>Crate<T> ship (T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
}
//    Unless a method is obtaining the generic formal type parameter from the
//    class/interface, it is specified immediately before the return type of the
//    method. This can lead to some interesting‐looking code!
 class More {
    public static <T> void sink(T t) { }
    public static <T> T identity(T t) { return t; }
//    public static T noGood(T t) { return t; } // DOES NOT COMPILE

    //OPTIONAL SYNTAX FOR INVOKING A GENERIC METHOD
    /*You can call a generic method normally, and the compiler will try to
    figure out which one you want. Alternatively, you can specify the
    type explicitly to make it obvious what the type is.*/

//    Box .<String>ship("package");
//    Box.<String[]>ship(args);

    //As to whether this makes things clearer, it is up to you. You should
    //at least be aware that this syntax exists.

}
