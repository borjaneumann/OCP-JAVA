package _03_HandlingExceptions;

import static _03_HandlingExceptions._15_UsingTryAndCatchStatements.fall;
import static _03_HandlingExceptions._15_UsingTryAndCatchStatements.seeAnimals;

public class _18_0_AddingAFinallyBlock {
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
        _18_0_AddingAFinallyBlock tcf = new _18_0_AddingAFinallyBlock();
        tcf.explore();

    /*
    The girl falls on line 29. If she gets up by herself, the code goes on to the
    finally block and runs line 33. Then the try statement is over, and the
    code proceeds on line 35. If the girl doesn’t get up by herself, she throws
    an exception. The catch block runs, and she gets a hug on line 31. With
    that hug she is ready to see more animals on line 33. Then the try
    statement is over, and the code proceeds on line 35. Either way, the ending
    is the same. The finally block is executed, and execution continues after
    the try statement.

    A finally block is typically used to close resources such as files or databases
     */
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("t");
        } catch (Exception e) {
            sb.append("c");
        } finally {
            sb.append("f");
        }
        sb.append("a");
        System.out.print(sb.toString()); //tfa
    }
    /*
    Rule: If a try statement with a finally block is entered, then the finally block will
    always be executed, regardless of whether the code completes successfully.

    12: int goHome() {
    13:     try {
    14:         // Optionally throw an exception here
    15:         System.out.print("1");
    16:         return -1;
    17:     } catch (Exception e) {
    18:         System.out.print("2");
    19:         return -2;
    20:     } finally {
    21:         System.out.print("3");
    22:         return -3;
    23:     }
    24: }

    What is the return value of the goHome() method? In this case, it’s always
    -3. Because the finally block is executed shortly before the method
    completes, it interrupts the return statement from inside both the try and
    catch blocks.

    Rule:  You see that while a finally block will always be executed, it may not finish.
    If info is null, then the finally block would be executed, but it would stop on line 32 and
    throw a NullPointerException. Lines 33–34 would not be executed.

    31: } finally {
    32:     info.printDetails();
    33:     System.out.print("Exiting");
    34:     return "zoo";
    35: }
     */

}
