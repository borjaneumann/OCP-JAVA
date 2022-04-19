package _2_CreatingCustomAnnotations;

public class _05_ProvidingAnOptionalElement {
    /*
    For an element to be optional, rather than required, it must include a
    default value. Let's update our annotation to include an optional value.

    public @interface Exercise {
        int hoursPerDay();
        int startHour() default 6;
    }

    @Exercise(startHour=5, hoursPerDay=3) public class Cheetah {}
    @Exercise(hoursPerDay=0) public class Sloth {}
    @Exercise(hoursPerDay=7, startHour="8") // DOES NOT COMPILE
    public class ZooEmployee {}

    When we have more than one element value within an annotation,
    we separate them by a comma ( ,).
    Next, each element is written using the syntax elementName = elementValue.
    It's like a shorthand for a Map.
    The order of each element does not matter. Cheetah could have listed hoursPerDay first.
    We also see that Sloth does not specify a value for startHour, meaning it
    will be instantiated with the default value of 6.
    In this version, the ZooEmployee class does not compile because it defines
    a value that is incompatible with the int type of startHour.

    DEFINING A DEFAULT ELEMENT VALUE
    The default value of an annotation cannot be just any value. Similar
    to case statement values, the default value of an annotation must be
    a non‐ null constant expression.
     */

}
