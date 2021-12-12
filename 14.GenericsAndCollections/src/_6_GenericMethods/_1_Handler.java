package _6_GenericMethods;

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
public class More {
    public static <T> void sink(T t) { }
    public static <T> T identity(T t) { return t; }
    public static T noGood(T t) { return t; } // DOES NOT COMPILE
}
