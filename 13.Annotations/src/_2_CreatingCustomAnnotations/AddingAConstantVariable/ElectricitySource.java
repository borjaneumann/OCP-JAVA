package _2_CreatingCustomAnnotations.AddingAConstantVariable;

public @interface ElectricitySource {
    public int voltage();
    int MIN_VOLTAGE = 2;
    public static final int MAX_VOLTAGE = 18;
}
