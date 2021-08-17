package javaFundamentals;

public class AddingFinalToInstanceVaribles {
    final int age = 10;
    final int fishEaten;
    final String name;

    { fishEaten = 10;}
    public AddingFinalToInstanceVaribles() {
        name = "Robert";
    }
    public AddingFinalToInstanceVaribles(int height) {
        this();
    }
}
