package TryAndCatch;

import static tryAndCatch.TryAndCatch.seeAnimals;

public class ChainingCatchBlocks {
    //1. you must be able to recognize if the
    //exception is a checked or an unchecked exception
    //2.you need to
    //determine whether any of the exceptions are subclasses of the others.class AnimalsOutForAWalk extends RuntimeException { }

    class AnimalsOutForAWalk extends RuntimeException { }
    class ExhibitClosed extends RuntimeException { }
    class ExhibitClosedForLunch extends ExhibitClosed { }

    public void visitPorcupine() {
        try{
            seeAnimals();
        }catch (AnimalsOutForAWalk e){
            System.out.println("Try back later");
        }catch (ExhibitClosed e) {
            System.out.println("not today");
        }
    }
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
        ChainingCatchBlocks ccb = new ChainingCatchBlocks();
        ccb.visitPorcupine();
        ccb.visitMonkeys();
    }

}
