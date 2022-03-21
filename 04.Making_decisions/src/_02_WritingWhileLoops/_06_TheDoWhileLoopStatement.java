package _02_WritingWhileLoops;

public class _06_TheDoWhileLoopStatement {
    /*
    The second form a while loop can take is called a do/while loop, which
    like a while loop is a repetition control structure with a termination
    condition and statement, or a block of statements.

    Unlike a while loop, though, a do/while loop guarantees that the
    statement or block will be executed at least once. Whereas a while loop is
    executed zero or more times, a do/while loop is executed one or more
    times

    Syntax
    ------
    do{ Curly brackets required for block of multiple statements, optional for single statement
        //body
    } while (booleanExpression); //semicolon required

     */
    public static void main(String[] args) {
        //Basic example
        int lizard = 0;
        do {
            lizard++;
        } while(false);
        System.out.println(lizard); // 1

        //Example
        int llama = 16;
        if (llama > 10){
            do{
                System.out.println("llama");
                llama--;
            }
            while(llama>10);
        }
    }
}
