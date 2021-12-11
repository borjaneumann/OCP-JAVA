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
