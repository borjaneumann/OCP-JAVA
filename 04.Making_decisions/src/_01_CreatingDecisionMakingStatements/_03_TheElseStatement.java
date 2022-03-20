package _01_CreatingDecisionMakingStatements;

public class _03_TheElseStatement {
    /*The if statement, as shown in Figure 4.1, accomplishes this
    by allowing our application to execute a particular block of code if and
    only if a boolean expression evaluates to true at runtime.

    if (boolean expression) {   Curly braces required for block of multiple statements,
          //Branch if true
    } else {                    -> Optional else statement
        //Branch if false
    }
    */
    public static void main(String[] args) {
        int hourOfTheDay = 7;
        if (hourOfTheDay<12){
            System.out.println("Good morning");
        }else{
            System.out.println("Good afternoon");
        }

        if(hourOfTheDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfTheDay < 15) {  // unreachable. Order is important!!
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
        /*
        the Java process will continue execution until it
        encounters an if statement that evaluates to true. If neither of the first
        two expressions is true, it will execute the final code of the else block.

        Tip:
        Another common place the exam may try to lead you astray is by
        providing code where the boolean expression inside the if
        statement is not actually a boolean expression. For example, take a
        look at the following lines of code:

        int hourOfDay = 1;
        if(hourOfDay) { // DOES NOT COMPILE...
        }
         */
        // Another example
        if (hourOfTheDay == 0 && hourOfTheDay <= 12){
            System.out.println("Good morning");
        } else if (hourOfTheDay == 12 && hourOfTheDay <= 18) {
            System.out.println("Good afternoon");
        } else if (hourOfTheDay < 0 || hourOfTheDay > 24) {
            System.out.println("The day has only 24 hours!");
        } else
            System.out.println("Good night!");
    }
}
