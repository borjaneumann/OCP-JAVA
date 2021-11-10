package UsingMethodReferences.Intro;

public class Duckling {
    public static void makeSound(String sound) {
//        LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound, learner);
    }
}
