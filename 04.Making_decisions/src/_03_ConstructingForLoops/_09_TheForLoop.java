package _03_ConstructingForLoops;

public class _09_TheForLoop {
    /*
    INTRO
    =====
    Even though while and do/while statements are quite powerful, some
    tasks are so common in writing software that special types of loops were
    created—for example, iterating over a statement exactly 10 times or
    iterating over a list of names. You could easily accomplish these tasks
    with various while loops that you’ve seen so far, but they usually require
    writing multiple lines of code and managing variables manually.

    With that, we present the most convenient repetition control structure, for
    loops. There are TWO types of for loops, although both use the same for
    keyword. The first is referred to as the basic for loop, and the second is
    often called the enhanced for loop. For clarity, we’ll refer to them as the
    for loop and the for-each loop, respectively, throughout the book.

    FOR LOOP (BASIC FOR LOOP)
    =========================
    Syntax(paranthesis and semicolons required):

    for (initialization; booleanExpression; updateStatement) { Curly brackets required for block of multiple statements,
     //body                                                    optional for single statement
    }

    1. initialization statement executes
    2. If BooleanExpression is true continue, else exit loop
    3. Body executes
    4. Execute updateStatement
    5. Return to Step 2

    Variables declared in the initialization block of a for loop have limited
    scope and are accessible only within the for loop. Be wary of any exam
    questions in which a variable is declared within the initialization block of
    a for loop and then read outside the loop. For example, this code does not
    compile because the loop variable i is referenced outside the loop:

    for(int i=0; i < 10; i++)
    System.out.print("Value is: "+i);
    System.out.println(i); // DOES NOT COMPILE

    Alternatively, variables declared before the for loop and assigned a value
    in the initialization block may be used outside the for loop because their
    scope precedes the creation of the for loop.

    for(int i = 0; i < 5; i++) {
        System.out.print(i + " ");
    }

    i:
    Programmers started using i as short for increment variable, and the practice exists today, even though many
    of those programming languages no longer do!
     */
    public static void main(String[] args) {
        String name = "Super Mario";
        for (int i = 0; i <name.length() ; i++) {
            System.out.println("Mario's loop: " + name.charAt(i));
        }
        System.out.println();
        name = "Luigi";
        for (int i = 0; i <name.length() ; i+= 2) {
            System.out.println("Luigi's loop: " + name.charAt(i));
        }
        System.out.println();
        String [] animals = {"lion", "tiger", "elephant"};
        boolean [] isPredator = {true,true,false};
        for (int i = 0; i < animals.length ; i++) {
            System.out.println("Animals's loop: " + animals[i]);
        }
        System.out.println();

        String animalsAmounts [] [] = {{"Elephants", "2"},{"Tigers", "5","7"},{"Monkeys", "10"}};
        System.out.println("Before loops: " + animalsAmounts[0][1]); // 2
        for (int i = 0; i < animalsAmounts.length ; i++) {
            for (int j = 0; j <animalsAmounts[i].length ; j++) {

                System.out.println("Animals's loop (nested loop): " + animalsAmounts[i][j]);
            }
        }
    }
}
