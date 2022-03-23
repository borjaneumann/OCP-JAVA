package _03_ApplyingAccessModifiers._03_03_ProtectedAccess;

public class BirdWatcher {
    public void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
