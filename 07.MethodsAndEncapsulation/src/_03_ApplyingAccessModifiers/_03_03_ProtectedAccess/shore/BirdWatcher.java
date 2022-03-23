package _03_ApplyingAccessModifiers._03_03_ProtectedAccess.shore;

import _03_ApplyingAccessModifiers._03_03_ProtectedAccess.shore.Bird;

public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
