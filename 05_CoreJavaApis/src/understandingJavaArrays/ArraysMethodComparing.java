package understandingJavaArrays;

import java.util.Arrays;

public class ArraysMethodComparing {
    public static void main(String[] args) {
        int[] numbers1 = {1,2,3};
        int[] numbers2 = {1,2,4};
        System.out.println(Arrays.compare(numbers1,numbers2));
    }
}
