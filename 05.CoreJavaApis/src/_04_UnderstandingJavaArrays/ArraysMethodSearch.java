package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class ArraysMethodSearch {
    public static void main(String[] args) {
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
