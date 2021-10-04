package _3_ApplyingAnnotations.CreatingAValueElement;

public @interface Injured {
    String veterinarian() default "unassigned";
    String value() default "foot";
    int age() default 1;
}
