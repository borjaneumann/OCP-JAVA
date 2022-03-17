package _6_DestroyingObjects;

public class _22_TracingEligibility {
    /*
    An object is no longer reachable when one of two situations occurs:

    1) The object no longer has any references pointing to it.
    2) All references to the object have gone out of scope.

    OBJECTS VS. REFERENCES
    Do not confuse a reference with the object that it refers to; they are
    two different entities. The reference is a variable that has a name and
    can be used to access the contents of an object. A reference can be
    assigned to another reference, passed to a method, or returned from
    a method. All references are the same size, no matter what their type is.

    An object sits on the heap and does not have a name. Therefore, you
    have no way to access an object except through a reference. Objects
    come in all different shapes and sizes and consume varying amounts
    of memory. An object cannot be assigned to another object, and an
    object cannot be passed to a method or returned from a method. It is
    the object that gets garbage collected, not its reference.

    Get pencil and paper!
    1: public class Scope {
    2:      public static void main(String[] args) {
    3:          String one, two;
    4:          one = new String("a");
    5:          two = new String("b"); //This means "b" doesn’t go
                                        out of scope until the
                                        end of the method on line 9.
    6:          one = two; // we got rid of the only arrow
                            pointing to "a", making that
                            object eligible for garbage collection.
    7:          String three = one;
    8:          one = null;
    9: } }

    FINALIZE()
    Java allows objects to implement a method called finalize().
    In a nutshell, the garbage collector would call the finalize() method once. If the
    garbage collector didn’t run, there was no call to finalize(). If the
    garbage collector failed to collect the object and tried again later,
    there was no second call to finalize().

    Just remember that finalize() can run zero or one times. It cannot run twice.
     */

}
