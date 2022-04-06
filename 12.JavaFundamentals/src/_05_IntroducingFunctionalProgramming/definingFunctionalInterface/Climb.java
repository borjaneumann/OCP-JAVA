package _05_IntroducingFunctionalProgramming.definingFunctionalInterface;

public interface Climb {
    void reach(); //This is a functional interface as it has reach() as one abstract method.
    default void fall() {}
    static int getBackUp() { return 100;}
    private static boolean checkHeight() {return true;}
}
