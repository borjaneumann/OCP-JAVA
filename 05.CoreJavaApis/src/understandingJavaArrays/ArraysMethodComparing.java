package understandingJavaArrays;

import java.util.Arrays;

public class ArraysMethodComparing {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {1,2,4};
        int[] numbers3 = {1,2,3};
        int[] numbers4 = {1,2,3,4};
        int[] numbers5 = {5,2,3};

        //--------------------------------------------
        System.out.println("First Array smaller than second one: " + Arrays.compare(numbers1,
                        numbers2));
        System.out.println("Arrays are equal: " + Arrays.compare(numbers1,
                numbers3));
        System.out.println("First Array larger than second one: " + Arrays.compare(numbers5,
                numbers3));

        System.out.println("---------------------------------------------");
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
