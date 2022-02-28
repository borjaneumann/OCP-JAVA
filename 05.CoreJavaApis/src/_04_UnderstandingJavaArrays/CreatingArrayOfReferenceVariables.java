package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class CreatingArrayOfReferenceVariables {
    public static void main(String[] args) {
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //Equals compare whether is an object
        System.out.println("Reference on the heap: " + bugs.toString());
        System.out.println("Printing object: " + Arrays.toString(bugs));

        System.out.println("Bugs on position 0: " + bugs[0]);

    }
}
