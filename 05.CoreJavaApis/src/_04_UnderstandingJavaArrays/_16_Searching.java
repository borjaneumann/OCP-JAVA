package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class _16_Searching {
    public static void main(String[] args) {

        /*
        Java also provides a convenient way to search—but only if the array is
        already sorted.

        Scenario            Result
        -------------------------------------------------------
        Target element      Index of match
        found in sorted
        array
        ------------------------------------------------------
        Target element      Negative value showing one smaller than the
        not found in        negative of the index, where a match needs to be
        sorted array        inserted to preserve sorted order
        ---------------------------------------------------------
        Unsorted array      A surprise—this result isn’t predictable

        A binary search splits the array into two equal pieces
        (remember 2 is binary) and determines which half the target is in. It
        repeats this process until only one element is left.
         */
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers,2));
        System.out.println(Arrays.binarySearch(numbers,4));
        System.out.println(Arrays.binarySearch(numbers,1));//0-1
        System.out.println(Arrays.binarySearch(numbers,3));//-1-1
        System.out.println(Arrays.binarySearch(numbers,9));//-1-4

        //only with sorted arrays, otherwise we get surprises
        int[] unsortedArray = { 3, 12, 5, 4};
        System.out.println(Arrays.binarySearch(unsortedArray,12));
    }
}
