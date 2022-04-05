package HandlingExceptions;


import static HandlingExceptions.TryAndCatch.seeAnimals;

public class _16_ChainingCatchBlocks {
    /*what happens when different types of exceptions can be thrown from the
    same try/catch block.
    1. you must be able to recognize if the exception is a checked or an unchecked exception
    2.you need to determine whether any of the exceptions are
    subclasses of the others.class AnimalsOutForAWalk extends RuntimeException { }
     */

    class AnimalsOutForAWalk extends RuntimeException { }
    class ExhibitClosed extends RuntimeException { }
    class ExhibitClosedForLunch extends ExhibitClosed { }

    /*
    In this example, there are three custom exceptions. All are unchecked
    exceptions because they directly or indirectly extend RuntimeException.
    Now we chain both types of exceptions with two catch blocks and handle
    them by printing out the appropriate message:
     */

    public void visitPorcupine() {
        try{
            seeAnimals();
        }catch (AnimalsOutForAWalk e){
            System.out.println("Try back later");
        }catch (ExhibitClosed e) {
            System.out.println("not today");
        }
    }
    /*
    There are three possibilities for when this code is run. If seeAnimal()
    doesn’t throw an exception, nothing is printed out. If the animal is out for
    a walk, only the first catch block runs. If the exhibit is closed, only the
    second catch block runs. It is not possible for both catch blocks to be
    executed when chained together like this.

    A rule exists for the order of the catch blocks. Java looks at them in the
    order they appear. If it is impossible for one of the catch blocks to be
    executed, a compiler error about unreachable code occurs. For example,
    this happens when a superclass catch block appears before a subclass
    catch block.

    The following example shows exception types that do inherit from each other:
     */

    public void visitMonkeys(){
        try{
            seeAnimals();
        }catch (ExhibitClosedForLunch e){
            System.out.println("try back later");
        }catch (ExhibitClosed e){
            System.out.println("not today");
        }
    }
    public void visitMonkeysReversed(){
        try{
            seeAnimals();
        }catch (ExhibitClosed e){
            System.out.println("not today");
//        }catch (ExhibitClosedForLunch e){ // the reverse does not work, it is an unreachable catch block
            System.out.println("try back later");
        }
    }
//    public void visitSnakes() {
//        try {
//        } catch (IllegalArgumentException e) {
//        } catch (NumberFormatException e) {//NumberFormatException inherits from IllegalArgumentException
//            //  the error has been already caught.
//        }
//    }
    public static void main(String[] args) {
        _16_ChainingCatchBlocks ccb = new _16_ChainingCatchBlocks();
        ccb.visitPorcupine();
        ccb.visitMonkeys();
    }

}
