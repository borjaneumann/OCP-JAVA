package _3_WorkingWithBinaryArithmaticOperators;

public class _08_ArithmeticOperators {
    /*
    Arithmetic operators also include the unary operators,
    ++ and --, which we covered already.

    All of the arithmetic operators may be applied to any Java
    primitives, with the exception of boolean. Furthermore, only the
    addition operators + and += may be applied to String values, which
    results in String concatenation.

    Adding Parentheses.
    You can change the order of operation explicitly
    by wrapping parentheses around the sections you want evaluated first.

    int price = 2 * ((5 + 3) * 4 - 8);

    Verifying Parentheses Syntax.
    When working with parentheses, you need to make sure they are always valid and balanced.

    Division and Modulus Operators
    The modulus operator, often called the remainder operator, is simply the remainder
    when two numbers are divided. For example, 9 divided by 3 divides
    evenly and has no remainder; therefore, the result of 9 % 3 is 0. On the
    other hand, 11 divided by 3 does not divide evenly; therefore, the result of
    11 % 3, is 2.

    System.out.println(10 / 3); // 3
    System.out.println(10 % 3); // 1

    For a given divisor y, which is 3 in these examples, the modulus
    operation results in a value between 0 and (y - 1) for positive dividends.
    This means that the result of this modulus operation is always 0, 1, or 2.

    Floor value, it just means the value without anything after the decimal point.
    For example, the floor value is 4 for each of the values 4.0, 4.5, and 4.9999999.
    Unlike rounding, which you just take the value before the decimal point,
    regardless of what is after the decimal point.

    The modulus operation is not limited to positive integer values in
    Java; it may also be applied to negative integers and floating-point
    numbers.
     */
}
