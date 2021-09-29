package _2_CreatingCustomAnnotations.ProvidingAnOptionalElement;

public @interface Exercise3 {
    int hoursPerDay();
    int startHour() default 6;
}
