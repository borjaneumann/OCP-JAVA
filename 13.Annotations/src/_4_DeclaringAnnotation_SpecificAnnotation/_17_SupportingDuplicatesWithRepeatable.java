package _4_DeclaringAnnotation_SpecificAnnotation;

public class _17_SupportingDuplicatesWithRepeatable {
    /*
    The most complicated annotation. Requires creating two annotations.
    The @Repeatable annotation is used when you want to specify an annotation
    more than once on a type.
    Why? when you want to apply the same annotation with different values.

    Let's assume we have a repeatable annotation @Risk, which assigns a set
    of risk values to a zoo animal. We'll show how it is used and then work
    backward to create it.
    public class Zoo {
        public static class Monkey {}
        @Risk(danger="Silly")
        @Risk(danger="Aggressive",level=5)
        @Risk(danger="Violent",level=10)
        private Monkey monkey;
    }
    Next, let's define a simple annotation that implements these elements:
    public @interface Risk {
        String danger();
        int level() default 1;
    }
    Now, as written, the Zoo class does not compile. Why? Well, the Risk
    annotation is missing the @Repeatable annotation!

    Rules
    =====
    1) Without the @Repeatable annotation, an annotation can be applied only once.
    2) To declare a @Repeatable annotation, you must define a containing annotation type value.
    A containing annotation type is a separate annotation that defines a
    value() array element. The type of this array is the particular annotation
    you want to repeat. By convention, the name of the annotation is often the
    plural form of the repeatable annotation.

    Putting all of this together, the following Risks declaration is a containing
    annotation type for our Risk annotation:

    public @interface Risks {
        Risk[] value();
    }

    Finally, we go back to our original Risk annotation and specify the
    containing annotation class:
    import java.lang.annotation.Repeatable;

    @Repeatable(Risks.class)
        public @interface Risk {
            String danger();
            int level() default 1;
    }

    REPEATABLE ANNOTATIONS VS. AN ARRAY OF ANNOTATIONS
    Repeatable annotations were added in Java 8. Prior to this, you
    would have had to use the @Risks containing annotation type
    directly:

    @Risks({
        @Risk(danger="Silly"),
        @Risk(danger="Aggressive",level=5),
        @Risk(danger="Violent",level=10)
    })
    private Monkey monkey;

    With this implementation, @Repeatable is not required in the Risk
    annotation declaration. The @Repeatable annotation is the preferred
    approach now, as it is easier than working with multiple nested
    statements.
     */
}
