package understandingJavaArrays;

import java.util.Arrays;

public class ArraysMethodMismatch {
    public static void main(String[] args) {
        int[] numbers6 = {1,2,3,4};
        int[] numbers7 = {1,2,3,5};
        int[] numbers8 = {1,2,3,4,5};
        int[] numbers9 = {1,2,3,4,5};

        System.out.println("Mismatch at index: " + Arrays.mismatch(numbers6,
                numbers7));//returns the index where the mismatch occurs.
        System.out.println("No mismatch: " + Arrays.mismatch(numbers8,
                numbers9));//No mismatch returns negative value
    }
}
