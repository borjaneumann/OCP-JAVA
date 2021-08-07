package TryAndCatch;

public class TryAndCatch {
    void explore(){
        try{
            fall();
            System.out.println("never get there");
        }catch (RuntimeException e){
            getUp();
        }
        seeAnimals();
    }
    static void fall(){
        throw new RuntimeException();
    }
    void getUp(){
        System.out.println("The little girl gets up and then see the animals");
    }
    public static void seeAnimals(){
        System.out.println("The little girl is seeing the animals");
    }

    public static void main(String[] args) {
        TryAndCatch tac = new TryAndCatch();
        tac.explore();
    }
}
