package _3_ApplyingAnnotations;

public class _11_CreatingAValueElement {
    /*
    In your development experience, you may have seen an annotation with a
    value, written without the elementName. For example, the following is
    valid syntax under the right condition:

    @Injured("Broken Tail") public class Monkey {}

    This is considered a shorthand or abbreviated annotation notation. What
    qualifies as the right condition? An annotation must adhere to the
    following rules to be used without a name:

    - The annotation declaration must contain an element named value(),
         which may be optional or required.
    - The annotation declaration must not contain any other elements that are
    required.
    - The annotation usage must not provide values for any other elements.

    Let's create an annotation that meets these requirements.

    public @interface Injured {
        String veterinarian() default "unassigned";
        String value() default "foot";
        int age() default 1;
    }

    This annotation is composed of multiple optional elements. In this
    example, we gave value() a default value, but we could have also made it
    required. Using this declaration, the following annotations are valid:

    public abstract class Elephant {
        @Injured("Legs") public void fallDown() {}
        @Injured(value="Legs") public abstract int trip();
        @Injured String injuries[];
    }

    The usage in the first two annotations are equivalent, as the compiler will
    convert the shorthand form to the long form with the value() element
    name. The last annotation with no values is permitted because @Injured
    does not have any required elements.

    The value() of an annotation should be related to the
    name of the annotation.

    For the exam, make sure that if the shorthand notation is used, then there
    is an element named value(). Also, check that there are no other required
    elements. For example, the following annotation declarations cannot be
    used with a shorthand annotation:
    public @interface Sleep {
        int value();
        String hours();
    }
    public @interface Wake {
        String hours();
    }
    The first declaration contains two required elements, while the second
    annotation does not include an element named value().
    Likewise, the following annotation is not valid as it provides more than one value:

    @Injured("Fur",age=2) public class Bear {} // DOES NOT COMPILE
     */
}
