package _3_SelectingAnElementType;

import _2_CreatingCustomAnnotations.ProvidingAnOptionalElement.Exercise3;

public @interface Panda {
//    Integer height();  Wrapper classes are not supported
//    String [] [] generalInfo(); //Multi dimensional arrays not allowed, simple arrays are
    Size size() default Size.SMALL;
//    Bear friendlyBear();
    Exercise3 exercise3() default @Exercise3(hoursPerDay = 2);
}
