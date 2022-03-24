package _06_OverloadingMethods;

public class _19_Varargs {
    /*
    Which method do you think is called if we pass an int[]?

    public void fly(int[] lengths) {}
    public void fly(int... lengths) {} // DOES NOT COMPILE

    Remember that Java treats varargs as if they were an array.
    Even though the code doesn’t look the same, it compiles to the same parameter list.

    It shouldn’t be a surprise that you can call either method by passing an array:
    fly(new int[] { 1, 2, 3 });

    However, you can only call the varargs version with stand-alone parameters:
    fly(1, 2, 3);

    They don’t compile exactly the same.
     */
}
