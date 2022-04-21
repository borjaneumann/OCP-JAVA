package _5_UsingCommonAnnotations;

public class Wolf  extends Canine{
    @Override
    public int cunning() {
        return Integer.MAX_VALUE;
    }
    @Override
    void howl() {
        System.out.println("Howl!");
    }
}
