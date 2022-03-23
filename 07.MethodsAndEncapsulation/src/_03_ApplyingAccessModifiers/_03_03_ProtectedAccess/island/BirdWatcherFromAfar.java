package _03_ApplyingAccessModifiers._03_03_ProtectedAccess.island;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //they are from a different package as Bird where protected is used!
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.println(bird.text); // DOES NOT COMPILE
    }

}
