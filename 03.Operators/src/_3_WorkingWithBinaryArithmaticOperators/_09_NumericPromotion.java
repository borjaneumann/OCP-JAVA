package _3_WorkingWithBinaryArithmaticOperators;

public class _09_NumericPromotion {
    /*
    primitive numeric promotion, Each primitive numeric type has a bit-length.

    Numeric Promotion Rules
    1. If two values have different data types, Java will automatically promote
    one of the values to the larger of the two data types.

        int x = 1;
        long y = 33;
        var z = x * y; //z -> long

    2. If one of the values is integral and the other is floating-point, Java will
    automatically promote the integral value to the floating-point value’s data
    type.

        short w = 14;
        float x = 13;
        double y = 30;
        var z = w * x / y; //z ->double
    3. Smaller data types, namely, byte, short, and char, are first promoted to
    int any time they’re used with a Java binary arithmetic operator, even if
    neither of the operands is int.

        short x = 10;
        short y = 3;
        var z = x * y; //z -> int

    4. After all promotion has occurred and the operands have the same data
    type, the resulting value will have the same data type as its promoted
    operands.
     */
}
