package privateAccess;

import defaultAccess.MotherDuck;

public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        //duck.quack(); it doesn not compile
        //System.out.println(duck.noise); it does not compile
    }
}
