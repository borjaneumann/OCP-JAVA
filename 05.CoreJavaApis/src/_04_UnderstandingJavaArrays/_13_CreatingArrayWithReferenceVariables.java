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
        //what do you think this array points to?
        class Names {
            String names[];// no new keyword, then to null...
        }
        class Names1 {
            String names[] = new String[2]; //Those 2 elements point to null, but have the
            // potential to point to a String Object.
        }
        //Remember casting from the previous chapter when you wanted to force a
        //bigger type into a smaller type? You can do that with arrays too:
        String[] strings = { "stringValue" };
        Object[] objects = strings; //doesn’t require a cast
        // because Object is a broader type than String.
        String[] againStrings = (String[]) objects;
//        againStrings[0] = new StringBuilder(); // DOES NOT COMPILE, it only allows String
        objects[0] = new StringBuilder(); // ArrayStoreException! objects is referencing String not
        //SteingBuilder!!
    }
}
