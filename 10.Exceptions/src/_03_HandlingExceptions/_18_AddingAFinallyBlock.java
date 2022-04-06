package _03_HandlingExceptions;

import static _03_HandlingExceptions._15_UsingTryAndCatchStatements.fall;
import static _03_HandlingExceptions._15_UsingTryAndCatchStatements.seeAnimals;

public class _18_AddingAFinallyBlock {
    /*
    The try statement also lets you run code at the end with a finally clause
    regardless of whether an exception is thrown.

    Syntax
    ======
    try {
        //Protected code
    } catch (exception_type identifier) { // The catch block is optional when finally is used.
        // Exception handler
    } finally { //The finally block always executes, whether or not an exception occurs.
        // finally block
    }

    There are two paths through code with both a catch and a finally. If an
    exception is thrown, the finally block is run after the catch block. If no
    exception is thrown, the finally block is run after the try block
    completes.
     */
    void explore(){
        try{
            seeAnimals();
            fall();
        }catch (Exception e){
            getHugFromDaddy();
        }finally {
            seeMoreAnimals();
        }
        goHome();
    }
    static void getHugFromDaddy(){
        System.out.println("Daddy hugs the little girl");
    }
    static void seeMoreAnimals(){
        System.out.println("it is time to see more animals");
    }
    static void goHome(){
        System.out.println("it is time to go home!");
    }
    public static void main(String[] args) {
        _18_AddingAFinallyBlock tcf = new _18_AddingAFinallyBlock();
        tcf.explore();
    }
    /*
    The girl falls on line 15. If she gets up by herself, the code goes on to the
    finally block and runs line 19. Then the try statement is over, and the
    code proceeds on line 21. If the girl doesn’t get up by herself, she throws
    an exception. The catch block runs, and she gets a hug on line 17. With
    that hug she is ready to see more animals on line 19. Then the try
    statement is over, and the code proceeds on line 21. Either way, the ending
    is the same. The finally block is executed, and execution continues after
    the try statement.
     */

}
