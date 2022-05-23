package _04_WorkingWithPrimitiveStreams;

import java.util.function.BooleanSupplier;

public class _20_LearningTheFunctionalInterfacesForPrimitives {
    public static void main(String[] args) {
        /*
        Functional Interfaces for boolean
        ==================================
        BooleanSupplier is a separate type. It has one method to implement:
        boolean getAsBoolean()

        It works just as you've come to expect from functional interfaces. Here's
        an example:
        */
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random()> .5;
        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean()); // false
        /*
        Lines 12 and 13 each create a BooleanSupplier, which is the only
        functional interface for boolean. Line 14 prints true, since it is the result
        of b1. Line 15 prints out true or false, depending on the random value
        generated.

        Functional Interfaces for double, int, and long
        ================================================
        Most of the functional interfaces are for double, int, and long to match
        the streams and optionals that we've been using for primitives. The Table below
        should be memorized.
     .
        Common functional interfaces for primitives
        Functional interfaces   # parameters        Return type         Single abstract method
        =====================================================================================
        DoubleSupplier                              double              getAsDouble
        IntSupplier                 0               int                 getAsInt
        LongSupplier                                long                getAsLong
        --------------------------------------------------------------------------------------
        DoubleConsumer          1 (double)
        IntConsumer             1 (int)             void                accept
        LongConsumer            1 (long)
        --------------------------------------------------------------------------------------
        DoublePredicate         1 (double)
        IntPredicate            1 (int)             boolean             test
        LongPredicate           1 (long)
        --------------------------------------------------------------------------------------
        DoubleFunction<R>       1 (double)
        IntFunction<R>          1 (int)             R                   Apply
        LongFunction<R>         1 (long)
        --------------------------------------------------------------------------------------
        DoubleUnaryOperator     1 (double)          double              applyAsDouble
        IntUnaryOperator        1 (int)             int                 applyAsInt
        LongUnaryOperator       1 (long)            long                applyAsLong
        --------------------------------------------------------------------------------------
        DoubleBinaryOperator    2 (double,double)   double              applyAsDouble
        IntBinaryOperator       2 (int,int)         int                 applyAsInt
        LongBinaryOperator      2 (long,long)       long                applyAsLong

        Note that:
        - Generics are gone from some of the interfaces, and instead the type name
        tells us what primitive type is involved. In other cases, such as
        IntFunction, only the return type generic is needed because we're
        converting a primitive int into an object.
        - The single abstract method is often renamed when a primitive type is
        returned.

        Some interfaces are specific to primitives.
        Primitive‐specific functional interfaces
        Functional interfaces   # parameters        Return type         Single abstract method
        =====================================================================================
        ToDoubleFunction<T>                         double              applyAsDouble
        ToIntFunction<T>            1 (T)           int                 applyAsInt
        ToLongFunction<T>                           long                applyAsLong
        --------------------------------------------------------------------------------------
        ToDoubleBiFunction<T,U>                     double              applyAsDouble
        ToIntBiFunction<T,U>        2 (T, U)        int                 applyAsInt
        ToLongBiFunction<T,U>                       long                applyAsLong
        --------------------------------------------------------------------------------------
        DoubleToIntFunction         1 (double)      int                 applyAsInt
        DoubleToLongFunction        1 (double)      long                applyAsLong
        IntToDoubleFunction         1 (int)         double              applyAsDouble
        IntToLongFunction           1 (int)         long                applyAsLong
        LongToDoubleFunction        1 (long)        double              applyAsDouble
        LongToIntFunction           1 (long)        int                 applyAsInt
        --------------------------------------------------------------------------------------
        ObjDoubleConsumer<T>        2 (T,double)
        ObjIntConsumer<T>           2 (T, int)      void                accept
        ObjLongConsumer<T>          2 (T,long)

        We've been using functional interfaces all chapter long, so you should
        have a good grasp of how to read the table by now. Let's do one example
        just to be sure. Which functional interface would you use to fill in the
        blank to make the following code compile?

        var d = 1.0;
        ______________ f1 = x -> 1;
        f1.applyAsInt(d);

        When you see a question like this, look for clues. You can see that the
        functional interface in question takes a double parameter and returns an
        int. You can also see that it has a single abstract method named
        applyAsInt. The DoubleToIntFunction and ToIntFunction meet all
        three of those criteria.
    */
    }
}
