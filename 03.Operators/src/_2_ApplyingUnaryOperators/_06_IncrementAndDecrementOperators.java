package _2_ApplyingUnaryOperators;

public class _06_IncrementAndDecrementOperators {
    /*
    Increment and decrement operators require special care because the order
    in which they are attached to their associated variable can make a
    difference in how an expression is processed.

    Pre-increment operator (++expression) and the pre-decrement operator (--expression)
    --------------------------------------------------------------------------------------
    The operator is applied first and the value returned is the new value of the expression.


    Post-increment operator (expression++) and the post-decrement operator (expression--)
    -------------------------------------------------------------------------------------
    The original value of the expression is returned, with operator applied after the value is returned.

    int parkAttendance = 0;
    System.out.println(parkAttendance); // 0
    System.out.println(++parkAttendance); // 1
    System.out.println(parkAttendance); // 1
    System.out.println(parkAttendance--); // 1
    System.out.println(parkAttendance); // 0

    int lion = 3;
    int tiger = ++lion * 5 / lion--; // tiger = 5 //lion-- is calculated first!!
    System.out.println("lion is " + lion); // 3
    System.out.println("tiger is " + tiger); // 5

     */
}
