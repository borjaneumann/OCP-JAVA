package _4_DeclaringAnnotation_SpecificAnnotation;

public class _14_StoringAnnotationsWithRetention {
    /*
    As you saw in Chapter 7, “Methods and Encapsulation,” the compiler
    discards certain types of information when converting your source code
    into a .class file. With generics, this is known as type erasure.
    In a similar vein, annotations may be discarded by the compiler or at
    runtime. We say “may,” because we can actually specify how they are
    handled using the @Retention annotation. This annotation takes a value()
    of the enum RetentionPolicy. Table 13.2 shows the possible values, in
    increasing order of retention.

    Values for the @Retention annotation
    RetentionPolicy value   Description
    ===================================
    SOURCE                  Used only in the source file, discarded by the compiler
    CLASS                   Stored in the .class file but not available at runtime
                            (default compiler behavior)
    RUNTIME                 Stored in the .class file and available at runtime

    Using it is pretty easy.

    import java.lang.annotation.Retention;
    import java.lang.annotation.RetentionPolicy;
    @Retention(RetentionPolicy.CLASS) @interface Flier {}
    @Retention(RetentionPolicy.RUNTIME) @interface Swimmer {}

    In this example, both annotations will retain the annotation information in
    their .class files, although only Swimmer will be available (via reflection)
    at runtime
     */
}
