package _2_CreatingCustomAnnotations;

public class _04_SpecifyingARequiredElement {
    /*
    An annotation element is an attribute that stores values about the
    particular usage of an annotation. To make our previous example more
    useful, let's change @Exercise from a marker annotation to one that
    includes an element.

    public @interface Exercise {
        int hoursPerDay();
    }
    It looks a lot like an abstract method, although we're calling it an
    element (or attribute). Remember, annotations have their roots in
    interfaces.

    Let's see how this new element changes our usage:

    @Exercise(hoursPerDay=3) public class Cheetah {}
    @Exercise hoursPerDay=0 public class Sloth {} // DOES NOT COMPILE
    @Exercise public class ZooEmployee {} // DOES NOT COMPILE
     */
}
