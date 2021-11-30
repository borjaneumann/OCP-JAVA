package understandingJavaArrays;

import java.util.Arrays;

public class ArraysMethodsSort {
    public static void main(String[] args) {
        //Sorting
        int[] numbers = {6,9,1};
        System.out.print("Sort ascending: ");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.print("Sort descending: ");
        Arrays.sort(numbers);
        for (int i = numbers.length-1; i >= 0; i--){
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

