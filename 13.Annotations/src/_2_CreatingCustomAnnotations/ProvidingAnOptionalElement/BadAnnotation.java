package _2_CreatingCustomAnnotations.ProvidingAnOptionalElement;

//the default value of an annotation must be a non‐ null constant expression

public @interface BadAnnotation {
//    String name() default new String("");     Does not compile
    String address() default "";
//    String title() default null;              Does not compile

}
