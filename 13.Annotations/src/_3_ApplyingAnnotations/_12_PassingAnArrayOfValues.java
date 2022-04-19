package _3_ApplyingAnnotations;

public class _12_PassingAnArrayOfValues {
    /*
    Annotations support a shorthand notation for providing an array that
    contains a single element. Let's say we have an annotation Music defined
    as follows:
    public @interface Music {
        String[] genres();
    }
    If we want to provide only one value to the array, we have a choice of two
    ways to write the annotation. Either of the following is correct:

    public class Giraffe {
        @Music(genres={"Rock and roll"}) String mostDisliked;
        @Music(genres="Classical") String favorite;
    }
    The first annotation is considered the regular form, as it is clear the usage
    is for an array. The second annotation is the shorthand notation, where the
    array braces ( {}) are dropped for convenience. Keep in mind that this is
    still providing a value for an array element; the compiler is just inserting
    the missing array braces for you.
    This notation can be used only if the array is composed of a single
    element. For example, only one of the following annotations compiles:

    public class Reindeer {
        @Music(genres="Blues","Jazz") String favorite; // DOES NOT COMPILE
        @Music(genres=) String mostDisliked; // DOES NOT COMPILE
        @Music(genres=null) String other; // DOES NOT COMPILE
        @Music(genres={}) String alternate;
    }
    The first provides more than one value, while the next two do not provide
    any values. The last one does compile, as an array with no elements is still
    a valid array.
    While this shorthand notation can be used for arrays, it does not work for
    List or Collection. As mentioned earlier, they are not in the list of
    supported element types for annotations.

    COMBINING SHORTHAND NOTATIONS
    =============================
    It might not surprise you that we can combine both of our recent
    rules for shorthand notations. Consider this annotation:
    public @interface Rhythm {
        String[] value();
    }
    Each of the following four annotations is valid:

    public class Capybara {
        @Rhythm(value={"Swing"}) String favorite;
        @Rhythm(value="R&B") String secondFavorite;
        @Rhythm({"Classical"}) String mostDisliked;
        @Rhythm("Country") String lastDisliked;
    }
    The first annotation provides all of the details, while the last one
    applies both shorthand rules.

     */
}
