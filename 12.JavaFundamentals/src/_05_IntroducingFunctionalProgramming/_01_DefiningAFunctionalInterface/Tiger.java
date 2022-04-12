package _05_IntroducingFunctionalProgramming.definingFunctionalInterface;

public class Tiger implements Sprint {
    public void sprint(int speed) {
        System.out.println("Animal is sprinting fast! " + speed);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.sprint(65);
    }
}
