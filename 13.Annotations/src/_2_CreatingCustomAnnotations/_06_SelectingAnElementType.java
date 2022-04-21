package _2_CreatingCustomAnnotations;

import _2_CreatingCustomAnnotations.Exercise;
import _2_CreatingCustomAnnotations.SpecifyingARequiredElement.Exercise2;

public class _06_SelectingAnElementType {
    /*
    Similar to a default element value, an annotation element cannot be
    declared with just any type.
    It must be a primitive type, a String, a Class,
    an enum, another annotation, or an array of any of these types.
    Given this information and our previous Exercise annotation, which of
    the following elements compile?*/

    public class Bear { }

    public enum Size {SMALL, MEDIUM, LARGE}

    public @interface Panda {
        //Integer height(); // does not compile.

        //String[][] generalInfo(); // does not compile.

        Size size() default Size.SMALL;

        class Bear {};

        //Bear friendlyBear(); // does not compile.

        Exercise2 exercise() default @Exercise2(hoursPerDay = 2);
    }
/*
    The height() element does not compile. While primitive types like int
    and long are supported, wrapper classes like Integer and Long are not.
    The generalInfo() element also does not compile. The type String[] is
    supported, as it is an array of String values, but String[][] is not.
    The size() and exercise() elements both compile, with one being an
    enum and the other being an annotation. To set a default value for
    exercise(), we use the @Exercise annotation. Remember, this is the only
    way to create an annotation value. Unlike instantiating a class, the new
    keyword is never used to create an annotation.

    Finally, the friendlyBear() element does not compile. The type of
    friendlyBear() is Bear (not Class). Even if Bear were changed to an
    interface, the friendlyBear() element would still not compile since it is
    not one of the supported types.

     */
}
