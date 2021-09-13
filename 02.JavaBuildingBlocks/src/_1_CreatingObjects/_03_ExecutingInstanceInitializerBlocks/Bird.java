package _1_CreatingObjects._03_ExecutingInstanceInitializerBlocks;

public class Bird {
    public static void main(String[] args) {
        {
            System.out.println("Feathers");
        }
    }
    { System.out.println("Snowy");} // instance initializer
}
