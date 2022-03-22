package _04_ControllingFlowWithBranching;

public class _17_UnreachableCode {
    /*
    One facet of break, continue, and return that you should be aware of is
    that any code placed immediately after them in the same block is
    considered unreachable and will not compile.
    it does not matter if loop or decision structure actually visits the line of code.
    For example, the loop could execute zero or infinite times at runtime.
    Regardless of execution, the compiler will report an error if it finds
    any code it deems unreachable, in this case any statements
    immediately following a break, continue, or return statement.

    int checkDate = 0;
    while(checkDate<10) {
        checkDate++;
        if(checkDate>100) {
            break;
            checkDate++; // DOES NOT COMPILE
        }
    }

    Even though it is not logically possible for the if statement to evaluate to
    true in this code sample, the compiler notices that you have statements
    immediately following the break and will fail to compile with
    “unreachable code” as the reason. The same is true for continue and
    return statements too, as shown in the following two examples:

    int minute = 1;
    WATCH: while(minute>2) {
        if(minute++>2) {
            continue WATCH;
            System.out.print(minute); // DOES NOT COMPILE
        }
    }
    int hour = 2;
    switch(hour) {
        case 1: return; hour++; // DOES NOT COMPILE
        case 2:
    }
     */
}
