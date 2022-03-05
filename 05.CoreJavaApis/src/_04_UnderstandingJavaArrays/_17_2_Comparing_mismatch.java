package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class _17_2_Comparing_mismatch {
    public static void main(String[] args) {

        /*
        If the arrays are equal, mismatch() returns -1. Otherwise, it
        returns the first index where they differ.
         */
        int[] numbers6 = {1,2,3,4};
        int[] numbers7 = {1,2,3,5};
        int[] numbers8 = {1,2,3,4,5};
        int[] numbers9 = {1,2,3,4,5};

        System.out.println("Mismatch at index: " + Arrays.mismatch(numbers6,
                numbers7));//returns the index where the mismatch occurs.
        System.out.println("No mismatch: " + Arrays.mismatch(numbers8,
                numbers9));//No mismatch returns negative value

        System.out.println(Arrays.mismatch(new int[] {1}, new int[]{1})); //-1
        System.out.println(Arrays.mismatch(new String[] {"a"}, new String[] {"A"}));//index 0
        System.out.println(Arrays.mismatch(new int[] {1, 2}, new int[]{1})); //index 1

        /*Equality vs. comparison vs. mismatch
        Method          When arrays are the same        When arrays are different
        --------------------------------------------------------------------------
        equals()        true                            false
        compare()       0                               Positive or negative number
        mismatch()      -1                              Zero or positive index

         */

    }
}
