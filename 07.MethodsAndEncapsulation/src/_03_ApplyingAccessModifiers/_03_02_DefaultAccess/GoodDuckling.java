package _03_ApplyingAccessModifiers._03_02_DefaultAccess;

public class GoodDuckling {
    public void makeNoise (){
        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
