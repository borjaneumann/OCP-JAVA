package _04_ControllingFlowWithBranching;

public class _15_TheContinueStatement {
    /*
    Let’s now extend our discussion of advanced loop control with the
    continue statement, a statement that causes flow to finish the execution of
    the current loop.

    Syntax:

    optionalLabel: while(booleanExpression) {
        // Body
        //Somewhere in loop
        continue optionalLabel; //semicolon required
     }

     While the break statement transfers control to the enclosing statement,
     the continue statement transfers control to the boolean expression that determines if the loop should continue.

    In other words, it ends the current iteration of the loop. Also, like the break
    statement, the continue statement is applied to the nearest inner loop
    under execution using optional label statements to override this behavior.
     */
    public static void main(String[] args) {
        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    //continue CLEANING;
                    continue;
                }
                System.out.println("Cleaning:" + stables + "," + leopard);
            }
        }
        /*
        continue CLEANING;  continue;       No continue statement;
        Cleaning:a,1        Cleaning:a,1    Cleaning: a,1
        Cleaning:c,1        Cleaning:a,3    Cleaning: a,2
        Cleaning:d,1        Cleaning:c,1    Cleaning: a,3
                            Cleaning:c,3    Cleaning: b,1
                            Cleaning:d,1    Cleaning: b,2
                            Cleaning:d,3    Cleaning: b,3
                                            Cleaning: c,1
                                            Cleaning: c,2
                                            Cleaning: c,3
                                            Cleaning: d,1
                                            Cleaning: d,2
                                            Cleaning: d,3
         */
    }
}
