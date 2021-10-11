package _3_ApplyingAnnotations.MixingRequiredAndOptionalElements;

public @interface Swimmer {
    int armLength = 10;
    String stroke(); //required
    String name(); //required
    String favoriteStroke() default "BackStroke";
}
