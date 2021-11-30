package javaFundamentals;

public class MarkingClassesFinal {
    //A final class cannot be extended
    public final class Reptile {}
//    public class Snake extends Reptile {} //It will not compile...

//    public abstract final class Eagle {} //Does not compile

//    public final interface Hawk {} // Does not compile. The compiler automatically applies the implicit abstract modifier to each
    //interface declaration. Just like abstract classes, interfaces cannot bemarked final.
}
