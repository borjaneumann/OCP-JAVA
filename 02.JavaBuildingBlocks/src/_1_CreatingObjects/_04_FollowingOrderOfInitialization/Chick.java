package _1_CreatingObjects._04_FollowingOrderOfInitialization;

public class Chick {
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }
    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }
    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}

