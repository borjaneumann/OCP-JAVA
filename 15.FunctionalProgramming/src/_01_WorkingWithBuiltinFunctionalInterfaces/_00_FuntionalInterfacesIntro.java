package _01_WorkingWithBuiltinFunctionalInterfaces;

public class _00_FuntionalInterfacesIntro {
    /*
    The convention here is to use the generic type T for the type parameter.
    If a second type parameter is needed, the next letter, U, is used.
    If a distinct return type is needed, R for return is used for the generic type.

    Common functional interfaces
    Functional interface    Return type         Method name         # of parameters
    ================================================================================
    Supplier<T>             T                   get()               0
    Consumer<T>             void                accept(T)           1 (T)
    BiConsumer<T, U>        void                accept(T,U)         2 (T, U)
    Predicate<T>            boolean             test(T)             1 (T)
    BiPredicate<T, U>       boolean             test(T,U)           2 (T, U)
    Function<T, R>          R                   apply(T)            1 (T)
    BiFunction<T, U, R>     R                   apply(T,U)          2 (T, U)
    UnaryOperator<T>        T                   apply(T)            1 (T)
    BinaryOperator<T>       T                   apply(T,T)          2 (T, T)

     */
}
