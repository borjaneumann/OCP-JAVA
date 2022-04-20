package _4_DeclaringAnnotation_SpecificAnnotation;

public class _18_ReviewingAnnotationSpecificAnnotations {
    /*
    Annotation‐specific annotations
    Annotation  Marker annotation   Type of value()        Default compiler behavior (if annotation not present)
    ============================================================================================================
    @Target     No                  Array of ElementType    Annotation able to be applied to all
                                                            locations except TYPE_USE and
                                                            TYPE_PARAMETER
    ------------------------------------------------------------------------------------------------------------
    @Retention  No                  RetentionPolicy         RetentionPolicy.CLASS
    ------------------------------------------------------------------------------------------------------------
    @Documented Yes                 —                       Annotations are not included in the generated Javadoc.
    ------------------------------------------------------------------------------------------------------------
    @Inherited  Yes                 —                       Annotations in supertypes are not inherited.
    ------------------------------------------------------------------------------------------------------------
    @Repeatable No                  Annotation              Annotation cannot be repeated.
    ------------------------------------------------------------------------------------------------------------
    Prior to this section, we created numerous annotations, and we never used
    any of the annotations in Table 13.3. So, what did the compiler do? Like
    implicit modifiers and default no‐arg constructors, the compiler auto‐
    inserted information based on the lack of data.

    The default behavior for most of the annotations in Table 13.3 is often
    intuitive. For example, without the @Documented or @Inherited
    annotation, these features are not supported. Likewise, the compiler will
    report an error if you try to use an annotation more than once without the
    @Repeatable annotation.

    The @Target annotation is a bit of a special case. When @Target is not
    present, an annotation can be used in any place except TYPE_USE or
    TYPE_PARAMETER scenarios (cast operations, object creation, generic
    declarations, etc.).

    WHY DOESN'T @TARGET'S DEFAULT BEHAVIOR APPLY TO ALL TYPES?
    We learn from Table 13.3 that to use an annotation in a type use or
    type parameter location, such as a lambda expression or generic
    declaration, you must explicitly set the @Target to include these
    values. If an annotation is declared without the @Target annotation
    that includes these values, then these locations are prohibited.
    One possible explanation for this behavior is backward
    compatibility. When these values were added to Java 8, it was
    decided that they would have to be explicitly declared to be used in
    these locations.
    That said, when the authors of Java added the MODULE value in Java
    9, they did not make this same decision. If @Target is absent, the
    annotation is permitted in a module declaration by default.

     */
}
