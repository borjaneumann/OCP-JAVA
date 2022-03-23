package _03_ApplyingAccessModifiers._03_01_PrivateAccess;

import _03_ApplyingAccessModifiers._03_02_DefaultAccess.MotherDuck;

public class BadCygnet {
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        //duck.quack(); it doesn not compile, not in the same package!
        //System.out.println(duck.noise); it does not compile, not in the same package!
    }
}
