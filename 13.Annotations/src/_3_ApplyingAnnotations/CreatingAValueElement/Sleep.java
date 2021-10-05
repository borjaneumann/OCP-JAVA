package _3_ApplyingAnnotations.CreatingAValueElement;

// the following annotation declarations cannot be
//used with a shorthand annotation: it contains 2 required elements.

public @interface Sleep {
    int value();
    String hours();
}
