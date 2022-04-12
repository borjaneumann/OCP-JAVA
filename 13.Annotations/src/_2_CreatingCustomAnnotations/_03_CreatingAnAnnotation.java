package _2_CreatingCustomAnnotations;

public class _03_CreatingAnAnnotation {
    /*
    You just give it a name, define a list of optional and required elements,
    and specify its usage. We use an annotation to create an annotation.

    public @interface Exercise {}

    The Exercise annotation is referred to as a marker annotation, since it does not contain
    any elements.

    How do we use our new annotation? It's easy. We use the at ( @) symbol,
    followed by the type name. In this case, the annotation is @Exercise.
    Then, we apply the annotation to other Java code, such as a class.
    Let's apply @Exercise to some classes.

    @Exercise() public class Cheetah {}
    @Exercise public class Sloth {}
    @Exercise
    public class ZooEmployee {}

    Like interfaces, annotations can be applied to unrelated classes.

    When using a marker annotation, parentheses are optional.Once we start adding
    elements, though, they are required if the annotation includes any values.

    If an annotation is declared on a line by itself, then it applies to
    the next nonannotation type found on the proceeding lines. In fact, this
    applies when there are multiple annotations present.

    @Scaley @Flexible
    @Food("insect") @Food("rodent") @FriendlyPet
    @Limbless public class Snake {}

    Some annotations are on the same line, some are on their own line, and
    some are on the line with the declaration of Snake. Regardless, all of the
    annotations apply to Snake. As with other declarations in Java, spaces and
    tabs between elements are ignored.

    Annotation names are case sensitive. Like class and interface
    names, it is common practice to have them start with an uppercase letter,
    although it is not required.
    Some annotations, like @Food, can be applied more than once.




     */
}
