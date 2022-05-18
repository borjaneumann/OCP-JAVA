package _04_WorkingWithPrimitiveStreams;

import java.util.function.BooleanSupplier;

public class _22_LearningTheFunctionalInterfacesForPrimitives {
    public static void main(String[] args) {
        //Functional Interfaces for boolean
        //Boolean Supplier
        //boolean getAsBoolean()
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random()> .5;
        System.out.println(b1.getAsBoolean()); //true, since it is the result of b1
        System.out.println(b2.getAsBoolean()); //false, prints out true or false, depending on the random value
        //generated.

        //Functional Interfaces for double, int, and long
        //See tables


    }

}
