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

    Pay attention to this!!!
    int month = 5;
    switch (month) // DOES NOT COMPILE no brackets
    case 1: System.out.print("January");
    switch (month) {
        case 1: 2: System.out.print("January"); // DOES NOT COMPILE mixing cases
    }
    switch (month) {
        case 1 || 2: System.out.print("January"); // DOES NOTCOMPILE || doest operate with numbers
            //but | could have worked!
     */
    public static void main(String[] args) {

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
    }
}
