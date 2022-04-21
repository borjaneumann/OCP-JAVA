package _2_CreatingCustomAnnotations;

public class _07_ApplyingElementModifiers {
    /*
    Like abstract interface methods, annotation elements are implicitly
    abstract and public, whether you declare them that way or not.
    */
    public @interface Material {}
    public @interface Fluffy {
        int cuteness();
        public abstract int softness() default 11;
    //    protected Material material(); // DOES NOT COMPILE
    //    private String friendly(); // DOES NOT COMPILE
    //    final boolean isBunny(); // DOES NOT COMPILE
    }
    /*
    The elements cuteness() and softness() are both considered abstract
    and public, even though only one of them is marked as such. The
    elements material() and friendly() do not compile because the access
    modifier conflicts with the elements being implicitly public. The element
    isBunny() does not compile because, like abstract methods, it cannot be
    marked final.
     */
}
