package _03_HandlingExceptions;

import static _03_HandlingExceptions._15_UsingTryAndCatchStatements.fall;
import static _03_HandlingExceptions._15_UsingTryAndCatchStatements.seeAnimals;

public class TryCatchFinally {
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
        TryCatchFinally tcf = new TryCatchFinally();
        tcf.explore();
    }
}
