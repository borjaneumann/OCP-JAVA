package _03_ApplyingAccessModifiers._03_02_DefaultAccess;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //they are from a different package as Bird where protected is used!
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.println(bird.text); // DOES NOT COMPILE
    }

}
