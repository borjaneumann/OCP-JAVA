package _3_ApplyingAnnotations;

public class _10_MixingRequiredAndOptionalElements {
    /*
    One of the most important rules when applying annotations is the
    following: to use an annotation, all required values must be provided.
    While an annotation may have many elements, values are required only
    for ones without default values.

    Let's try this. Given the following annotation:

    public @interface Swimmer {
        int armLength = 10;
        String stroke();
        String name();
        String favoriteStroke() default "Backstroke";
    }

    which of the following compile?

    @Swimmer class Amphibian {}
    @Swimmer(favoriteStroke="Breaststroke", name="Sally") class Tadpole {}
    @Swimmer(stroke="FrogKick", name="Kermit") class Frog {}
    @Swimmer(stroke="Butterfly", name="Kip", armLength=1) class Reptile {}
    @Swimmer(stroke="", name="", favoriteStroke="") class Snake {}

    Amphibian does not compile, because it is missing the required elements
    stroke() and name(). Likewise, Tadpole does not compile, because it is
    missing the required element stroke().
    Frog provides all of the required elements and none of the optional ones,
    so it compiles. Reptile does not compile since armLength is a constant,
    not an element, and cannot be included in an annotation. Finally, Snake
    does compile, providing all required and optional values.

     */
}
