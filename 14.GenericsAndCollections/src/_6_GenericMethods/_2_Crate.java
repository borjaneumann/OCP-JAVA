package _6_GenericMethods;


//When you have a method declare a generic parameter type, it is
//independent of the class generics. Take a look at this class that declares a
//generic T at both levels:
public class _2_Crate <T>{
    public <T> T tricky(T t) {
        return t;
    }


}
