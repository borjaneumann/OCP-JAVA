package _01_CreatingDecisionMakingStatements;

public class _02_TheIfStatement {
    /*The if statement executes a particular block of code if and
    only if a boolean expression evaluates to true at runtime.

    if (boolean expression) {   Curly braces required for block of multiple statements,
          //Branch if true      optional for single statement
    }
    */
    public static void main(String[] args) {

        int ticketsTaken = 5;
        int patrons = 0;
        if (ticketsTaken>1){
            patrons++;
            System.out.println("Patrons: " + patrons);
        }
        // The exam will try to trick you with the brackets.
        int hourOfDay = 70;
        int morningGreetingCount = 0;
        if(hourOfDay < 11)
        System.out.println("Good Morning"); //Here finishes the if-statement
        morningGreetingCount++;
        System.out.println("Morning Greeting Count: " + morningGreetingCount);
        /*WATCH INDENTATION AND BRACES
        One area where the exam writers will try to trip you up is on if
        statements without braces ({}).
         */
    }
}
