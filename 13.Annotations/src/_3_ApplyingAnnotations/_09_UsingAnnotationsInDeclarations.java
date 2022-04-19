package _3_ApplyingAnnotations;

public class _09_UsingAnnotationsInDeclarations {
    /*
    Up until now, we've only been applying annotations to classes and
    methods, but they can be applied to any Java declaration including the
    following:
    - Classes, interfaces, enums, and modules
    - Variables ( static, instance, local)
    - Methods and constructors
    - Method, constructor, and lambda parameters
    - Cast expressions
    - Other annotations

    The following compiles, assuming the annotations referenced in it exist:

    1: @FunctionalInterface interface Speedster {
    2:  void go(String name);
    3: }
    4: @LongEars
    5: @Soft @Cuddly public class Rabbit {
    6: @Deprecated public Rabbit(@NotNull Integer size) {}
    7:
    8: @Speed(velocity="fast") public void eat(@Edible String input) {
    9: @Food(vegetarian=true) String m = (@Tasty String) "carrots";
    10:
    11: Speedster s1 = new @Racer Speedster() {
    12: public void go(@FirstName @NotEmpty String name) {
    13: System.out.print("Start! "+name);
    14:     }
    15: };
    16:
    17: Speedster s2 = (@Valid String n) -> System.out.print(n);
    18:     }
    19: }

    It's a little contrived, we know. Lines 1, 4, and 5 apply annotations to the
    interface and class declarations. Some of the annotations, like @Cuddly, do
    not require any values, while others, like @Speed, do provide values. You
    would need to look at the annotation declaration to know if these values
    are optional or required.
    Lines 6 and 8 contain annotations applied to constructor and method
    declarations. These lines also contain annotations applied to their
    parameters.
    Line 9 contains the annotation @Food applied to a local variable, along
    with the annotation @Tasty applied to a cast expression.

    When applying an annotation to an expression, a cast operation
    including the Java type is required.

    An annotation can specify which declaration type they can be applied to using the @Target annotation.

     */
}
