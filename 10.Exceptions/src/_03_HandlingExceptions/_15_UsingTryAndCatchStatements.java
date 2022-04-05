package _03_HandlingExceptions;

import javax.management.RuntimeMBeanException;

public class _15_UsingTryAndCatchStatements {
    /*
    Java uses a try statement to separate the logic that might throw an
    exception from the logic to handle that exception.

    try {
        // protected code
    } catch (exception type identifier) { //type of exception being caught
        //Exception handler
    }

    The code in the try block is run normally. If any of the statements throws
    an exception that can be caught by the exception type listed in the catch
    block, the try block stops running and execution goes to the catch
    statement. If none of the statements in the try block throws an exception
    that can be caught, the catch clause is not run.

    You probably noticed the words block and clause used interchangeably.
    The exam does this as well, so get used to it. Both are correct. Block is
    correct because there are braces present. Clause is correct because they are
    part of a try statement.

     */
    void explore(){
        try{
            fall();
            System.out.println("never get here");

        }catch (RuntimeMBeanException e){
            getUp();
        }
        seeAnimals();
    }
    public static void fall(){
        throw new RuntimeException();
    }
    public static void seeAnimals() {}
    private static void getUp() {}

    //Another example
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);//throws ArrayIndexOutOfBoundsExceptions
        } catch (Exception e) {
            System.out.println("Something went wrong.");
//        } finally {
//            System.out.println("The 'try catch' is finished.");
        }
    }}
    /*
    The try statements are like methods in that the curly braces are required
    even if there is only one statement inside the code blocks, while if
    statements and loops are special and allow you to omit the curly braces.
     */
