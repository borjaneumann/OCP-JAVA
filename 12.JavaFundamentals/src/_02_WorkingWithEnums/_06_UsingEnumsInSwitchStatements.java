package _02_WorkingWithEnums;

public class _06_UsingEnumsInSwitchStatements {
    /*
    Enums can be used in switch statements. Pay attention to the case values
    in this code:

    Season summer = Season.SUMMER;
    switch (summer) {
    case WINTER:
        System.out.println("Get out the sled!");
        break;
    case SUMMER:
        System.out.println("Time for the pool!");
        break;
    default:
        System.out.println("Is it summer yet?");
    }
    The code prints "Time for the pool!" since it matches SUMMER. In each
    case statement, we just typed the value of the enum rather than writing
    Season.WINTER. After all, the compiler already knows that the only
    possible matches can be enum values. Java treats the enum type as
    implicit. In fact, if you were to type case Season.WINTER, it would not
    compile. Don't believe us? Take a look at the following example:

    switch (summer) {
        case Season.FALL: // DOES NOT COMPILE
            System.out.println("Rake some leaves!");
            break;
        case 0: // DOES NOT COMPILE
            System.out.println("Get out the sled!");
            break;
    }
    The first case statement does not compile because Season is used in the
    case value. If we changed Season.FALL to just FALL, then the line would
    compile. What about the second case statement? Just as earlier we said
    that you can't compare enums with int values, you cannot use them in a
    switch statement with int values either. On the exam, pay special
    attention when working with enums that they are used only as enums.
     */
}
