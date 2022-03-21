package _02_WritingWhileLoops;

public class _05_TheWhileStatement {
    /*
    A loop is a repetitive control structure that can execute a
    statement of code multiple times in succession. By making use of
    variables being able to be assigned new values, each repetition of the
    statement may be different.

    THE WHILE STATEMENT
    -------------------
    The simplest repetitive control structure in Java is the while statement.
    Like all repetition control structures, it has a termination condition,
    implemented as a boolean expression, that will continue as long as
    the expression evaluates to true.
    During execution, the boolean expression is evaluated before
    each iteration of the loop and exits if the evaluation returns false.

    Syntax
    ------
    while(booleanExpression) Parentheseis required{ Curly brackets required for block of multiple statements, optional for single statement.
        //body
    }

    One thing to remember is that a while loop may terminate after its first
    evaluation of the boolean expression. How many times is ot full! printed in the following example?
    int full = 5;
    while(full < 5) {
        System.out.println("Not full!");
        full++;
    }
    While loops are often used in places where you expect zero or more executions of the loop.
     */
    public static void main(String[] args) {
        int counter = 0;
        while(counter<5){  //Termination condition
            counter++;
            System.out.println(counter);  //1,2,3,4,5
        }
    }
    int roomInBelly = 5;
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }
}
