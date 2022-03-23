package _03_ApplyingAccessModifiers._03_01_PrivateAccess;

public class BadDuckling {
    public void makeNoise(){
        FatherDuck duck = new FatherDuck();
//        duck.quack; //Does not compile
//        System.out.println(duck.makeNoise()); //does not compile
    }
}
