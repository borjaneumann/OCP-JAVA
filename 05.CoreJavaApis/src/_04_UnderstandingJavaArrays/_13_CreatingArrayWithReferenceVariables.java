package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class _13_CreatingArrayWithReferenceVariables {
    public static void main(String[] args) {

        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //True. Equals compare whether is an object
        System.out.println("Reference on the heap: " + bugs.toString()); // [Ljava.lang.String;@4dd8dc3
        System.out.println("Printing object: " + Arrays.toString(bugs)); // [cricket, beetle, ladybug]
        //Heads up! The array does not allocate space for the String objects.
        // Instead, it allocates space for a reference to where the objects are really stored.

        System.out.println("Bugs on position 0: " + bugs[0]); //cricket

        /*
        We can call equals() because an array is an object. It returns true
        because of reference equality. The equals() method on arrays does not
        look at the elements of the array. Remember, this would work even on an
        int[] too. int is a primitive; int[] is an object.
         */
    }
}
