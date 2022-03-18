package _5_ComparingValues;

public class _17_ShortCircuirOperators {
    /*
    Short-circuit operators
    Operator    Description
    ==================================================================================
    &&          Short-circuit AND is true only if both values are true. If the left
                side is false, then the right side will not be evaluated.
    ----------------------------------------------------------------------------------
    ||          Short-circuit OR is true if at least one of the values is true. If the
                left side is true, then the right side will not be evaluated.
    ----------------------------------------------------------------------------------

    The short-circuit operators are nearly identical to the logical operators, &
    and |, except that the right side of the expression may never be evaluated
    if the final result can be determined by the left side of the expression.

    int hour = 10;
    boolean zooOpen = true || (hour < 4);
    System.out.println(zooOpen); // true

    Avoiding a NullPointerException
    ===============================
    if(duck!=null & duck.getAge()<5) { // Could throw a NullPointerException
        // Do something
    }

    if(duck!=null && duck.getAge()<5) {
        // Do something
    }
    In this example, if duck was null, then the short-circuit prevents a
    NullPointerException from ever being thrown, since the evaluation of
    duck.getAge() < 5 is never reached.

    Checking for Unperformed Side Effects
    =====================================
    Be wary of short-circuit behavior on the exam, as questions are known to
    alter a variable on the right side of the expression that may never be
    reached. This is referred to as an unperformed side effect.

    int rabbit = 6;
    boolean bunny = (rabbit >= 6) || (++rabbit <= 7);
    System.out.println(rabbit);
    Because rabbit >= 6 is true, the increment operator on the right side of
    the expression is never evaluated, so the output is 6.

     */
}
