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



    }
}
