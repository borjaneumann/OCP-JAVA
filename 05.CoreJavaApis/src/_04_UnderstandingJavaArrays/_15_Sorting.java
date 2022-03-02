package _04_UnderstandingJavaArrays;

import java.util.Arrays;

public class _15_Sorting {
    public static void main(String[] args) {
        /*
        Arrays is the first class provided by Java we have used that requires an
        import. To use it, you must have either of the following two statements in
        your class:

        import java.util.*; // import whole package including Arrays
        import java.util.Arrays; // import just Arrays
         */

        //Sorting
        int[] numbers = {6,9,1};
        System.out.println(Arrays.toString(numbers)); //[6, 9, 1]

        System.out.print("Sort ascending: ");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.print("Sort descending: ");
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i >= 0; i--){ // This way is reversed.
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        String[] words = {"hello","world","wild"};
        System.out.print("Sort ascending: ");
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++){
            System.out.print( words[i] + " ");
        }
        System.out.println();
        System.out.print("Sort descending: ");
        Arrays.sort(words);
        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }
}

