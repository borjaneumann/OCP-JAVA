package _1_CreatingObjects._01_CallingConstructors;

//The purpose of a constructor is to initialize fields, although you can put
//any code in there. Another way to initialize fields is to do so directly on
//the line on which they’re declared.

public class Chick {
    public Chick() {
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        Chick c = new Chick();
    }

}
