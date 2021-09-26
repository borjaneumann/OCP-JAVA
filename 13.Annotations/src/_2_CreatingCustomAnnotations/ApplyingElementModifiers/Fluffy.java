package _2_CreatingCustomAnnotations.ApplyingElementModifiers;

public @interface Fluffy {
    int cuteness();  //considered implicitly public and abstract
    public abstract int softness() default 11;  //considered implicitly public and abstract
//    protected Material material(); //Does not compile
//    private String friendly(); //Does not compile
//    final boolean isBunny(); //Does not compile
}
