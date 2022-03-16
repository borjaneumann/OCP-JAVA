package _4_InitializingVariables;

public class _11_CreatingLocalVariables {
    /*
    Intro:
    Before you can use a variable, it needs a value. Some types of variables
    get this value set automatically, and others require the programmer to
    specify it.

    CREATING LOCAL VARIABLES
    A local variable is a variable defined within a constructor, method, or
    initializer block.

    * Local variables do not have a default value and must be initialized before use.
    * The compiler is only concerned if you try to use uninitialized local variables;
    it doesn’t mind the ones you never use.
    */
    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
//        System.out.println(onlyOneBranch); // DOES NOT COMPILE. The compiler knows there is the possibility for check to be false,
        // resulting in uninitialized code, and gives a compiler error.

        /*On the exam, be wary of any local variable that is declared but not
        initialized in a single line. This is a common place on the exam that
        could result in a “Does not compile” answer.*/
    }


}
