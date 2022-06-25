package _01_WorkingWithBuiltinFunctionalInterfaces;

//CREATING YOUR OWN FUNCTIONAL INTERFACES
@FunctionalInterface
public interface TriFunction <T,U,V,R> {
    R apply(T t, U u, V v);
    //The first three supply the types of
    //the three wheel speeds. The fourth is the return type
}

@FunctionalInterface
interface QuadFunction<T,U,V,W,R> {
    R apply(T t, U u, V v, W w);
    //There are five type parameters here. The first four supply the types
    //of the four motors. Ideally these would be the same type, but you
    //never know. The fifth is the return type in this example.
}

