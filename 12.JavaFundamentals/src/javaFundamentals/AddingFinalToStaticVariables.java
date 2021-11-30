package javaFundamentals;

//The height
//variable is not assigned a value anywhere in the class definition, so that
//line does not compile.

public class AddingFinalToStaticVariables {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height; // Does not compile
    static { bamboo = 5;}
}
