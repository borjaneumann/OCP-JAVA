package _01_CreatingDecisionMakingStatements;

public class _04_TheSwitchStatement {
    /*
    A switch statement, as shown in Figure 4.3, is a complex
    decision-making structure in which a single value is evaluated and flow is
    redirected to the first matching branch, known as a case statement. If no
    such case statement is found that matches the value, an optional default
    statement will be called. If no such default option is available, the entire
    switch statement will be skipped.

    SWITCH SYNTAX
    =============
    switch (variableToTest) { curly brace required

    case constantExpression1 :   switch statement may contain 0 or more case branches
        ///branch for case1:
        break;
        case constantExpression2 :   switch statement may contain 0 or more case branches
        ///branch for case2:
        break; // they terminate the switch statement and return flow control to the
                    enclosing statement.
        ...
        default; //can be at any location
        //branch for default

   }curly brace required

   Switch Data Types: all primitive numeric types(int,byte, short,char),
   their wrapper classes, String, ENUMS and var if refer to the already mentioned ones.

   Acceptable Case Values:
    - only literals,
    - enum constants, or
    - final constant variables of the same data type. By final constant, we mean that the variable must be marked with
    the final modifier and initialized with a literal value in the same expression in which it is declared.

    final int getCookies() { return 4; }
        void feedAnimals() {
            final int bananas = 1;
            int apples = 2;
            int numberOfAnimals = 3;
            final int cookies = getCookies();
            switch (numberOfAnimals) {
                case bananas:
                case apples: // DOES NOT COMPILES
                case getCookies(): // DOES NOT COMPILE
                case cookies : // DOES NOT COMPILE
                case 3 * 5 :
        }
    }

    Pay attention to this!!!
    int month = 5;
    switch (month) // DOES NOT COMPILE no brackets
    case 1: System.out.print("January");
    switch (month) {
        case 1: 2: System.out.print("January"); // DOES NOT COMPILE mixing cases
    }
    switch (month) {
        case 1 || 2: System.out.print("January"); // DOES NOT COMPILE || doest operate with numbers
            //but | could have worked!

    BREAK STATEMENTS
    ----------------
    if you leave out the break statement, flow will continue to the next proceeding case or default
    block automatically.
    */

    public static void main(String[] args) {

        //Classic switch use case
        int daysOfTheWeek = 6;
        switch(daysOfTheWeek){
            case 1:
                System.out.println("Sunday, it is the first day of the week");
                break;
            case 2:
                System.out.println("Monday, it is the second day of the week");
                break;
            case 3:
                System.out.println("Tuesday, it is the third day of the week");
                break;
            case 4:
                System.out.println("Wednesday, it is the fourth day of the week");
                break;
            case 5:
                System.out.println("Thursday, it is the fifth day of the week");
                break;
            case 6:
                System.out.println("Sunday, it is the sixth day of the week");
                break;
            case 7:
                System.out.println("Sunday, it is the seventh day of the week");
                break;
            default:
                System.out.println("Please enter a number between 1 and 7");
        }
        var dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 10:
                System.out.println("Imaginary day");
            case 6:
                System.out.println("Saturday");
                break;
        }
        /*
        This prints out Weekday and Saturday. it jumps directly to the default case and executed the cases until it finds a break.
        The default is executed because there was no break in the preceeding statement.
        If there is no break statement, executes all of them.
        The order of the case and default statements is now important since
        placing the default statement at the end of the switch statement would
        cause only one word to be output.
        if day of the week is 6, the result would be "Saturday", even though the default case is before.
         */
    }
    /* A More Complex Example
    private int getSortOrder(String firstName, final String
            lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
            case middleName: // DOES NOT COMPILE
                id = 5;
                break;
            case suffix:
                id = 0;
                break;
            case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id=15;
                break;
        }
        return id;
    }
    Numeric Promotion and Casting
    Last but not least, switch statements support numeric promotion that does
    not require an explicit cast. For example, see if you can understand why
    only two of these case statements compile:

    short size = 4;
    final int small = 15;
    final int big = 1_000_000;
    switch(size) {
        case small:
        case 1+2 :
        case big: // DOES NOT COMPILE
    }

     */
}
