package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class _17_Comparing {

    public static void main(String[] args) {
        /*
        Java also provides methods to compare two arrays to determine which is
        “smaller.” First we will cover the compare() method and then go on to
        mismatch().

        There are a bunch of rules you need to know before calling compare().

        - A negative number means the first array is smaller than the second.
        - A zero means the arrays are equal.
        - A positive number means the first array is larger than the second.
         */
        System.out.println("Single value comparison: " + Arrays.compare(new int[]{1},new int[]{2}));// -1

        int[] numbers1 = {1,2,3};
        int[] numbers2 = {1,2,4};
        int[] numbers3 = {1,2,3};
        int[] numbers4 = {1,2,3,4};
        int[] numbers5 = {5,2,3};

        //--------------------------------------------
        System.out.println("First Array smaller than second one: " + Arrays.compare(numbers1, numbers2));// -1
        System.out.println("Arrays are equal: " + Arrays.compare(numbers1, numbers3)); // 0
        System.out.println("First Array larger than second one: " + Arrays.compare(numbers5, numbers3)); // 1

        System.out.println("---------------------------------------------");
        /*
        - If both arrays are the same length and have the same values in each spot in the same order, return zero.
        - If all the elements are the same but the second array has extra elements at the end, return a negative number.
        - If all the elements are the same but the first array has extra elements at the end, return a positive number.
        - If the first element that differs is smaller in the first array, return a negative number.
        - If the first element that differs is larger in the first array, return a positive number.
         */
        System.out.println("Now Arrays of different length");
        int[] numbers6 = {1,2,3,4};
        int[] numbers7 = {1,2,3,4};
        int[] numbers8 = {1,2,3,4,5};
        int[] numbers9 = {1,2,2,4,5};
        int[] numbers10= {1,2,3,4,5};


        System.out.println("Same length, same values: " + Arrays.compare(numbers6,
                numbers7));
        System.out.println("Elements are the same but the second array has extra elements at the end: "
                + Arrays.compare(numbers7,
                numbers8));
        System.out.println("Elements are the same but the first array has extra elements at the end: "
                + Arrays.compare(numbers8,
                numbers7));
        System.out.println("First element that differs is smaller in the first Array: "
                + Arrays.compare(numbers9,
                numbers10));
        System.out.println("First element that differs is larger in the first Array: "
                + Arrays.compare(numbers10,
                numbers9));

    }
}
