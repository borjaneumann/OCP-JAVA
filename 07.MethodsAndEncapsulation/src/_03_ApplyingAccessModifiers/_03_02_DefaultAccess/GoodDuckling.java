package defaultAccess;

public class GoodDuckling {
    public void makeNoise (){
        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
