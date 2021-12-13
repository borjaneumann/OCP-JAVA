package _6_GenericMethods;



//When you have a method declare a generic parameter type, it is
//independent of the class generics. Take a look at this class that declares a
//generic T at both levels:
public class _2_Crate <T>{
    public <T> T tricky(T t) {
        return t;
    }

    public static String createName() {
        _2_Crate <_3_Robot> crate = new _2_Crate<>() {
            return crate.tricky("bot");
        };
    }
    //Clearly, “T is for tricky.” Let's see what is happening. On line 1, T is
    //Robot because that is what gets referenced when constructing a Crate. On
    //line 2, T is String because that is what is passed to the method. When you
    //see code like this, take a deep breath and write down what is happening so
    //you don't get confused.


}
