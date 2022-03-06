package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _27_UsingArrayListSorting {
    public static void main(String[] args) {
        //Sorting an ArrayList is similar to sorting an array.
        // You just use the collections interface.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(9);
        numbers.add(109);
        Collections.sort(numbers);//it uses the collections interface.
        System.out.println(numbers);// [9, 99, 109]
    }
}
