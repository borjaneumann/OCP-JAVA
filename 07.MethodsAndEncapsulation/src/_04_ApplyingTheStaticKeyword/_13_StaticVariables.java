package _04_ApplyingTheStaticKeyword;

import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;

public class _13_StaticVariables {
    /*
    STATIC VARIABLES CHANGE( COUNTER)
    --------------------------------
    Some static variables are meant to change as the program runs. Counters
    are a common example of this. We want the count to increase over time.
    Just as with instance variable
    s, you can initialize a static variable on the
    line it is declared:
    public class Initializers {
        private static int counter = 0; // initialization
    }

    STATIC VARIABLES DON'T CHANGE(CONSTANT)
    --------------------------------
    Other static variables are meant to never change during the program.
    This type of variable is known as a constant. It uses the final modifier to
    ensure the variable never changes. Constants use the modifier static
    final and a different naming convention than other variables. They use all
    uppercase letters with underscores between “words.” Here’s an example:

    public class Initializers {
        private static final int NUM_BUCKETS = 45;  //primitive variable
        public static void main(String[] args) {
            NUM_BUCKETS = 5; // DOES NOT COMPILE
        }
    }
    The compiler will make sure that you do not accidentally try to update a
    final variable. This can get interesting. Do you think the following
    compiles?
     */

    private static final ArrayList<String> values = new ArrayList<>(); //reference variable
    public static void main(String[] args) {
        values.add("changed");
        System.out.println(values);
    }
    /*
    It actually does compile since values is a reference variable. We are
    allowed to call methods on reference variables. All the compiler can do is
    check that we don’t try to reassign the final values to point to a different
    object.
     */

}
