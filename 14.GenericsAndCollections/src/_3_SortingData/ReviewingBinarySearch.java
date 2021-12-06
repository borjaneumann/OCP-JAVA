package _3_SortingData;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReviewingBinarySearch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,9,1,8);
        Collections.sort(list); // [1,6,8,9]
        System.out.println(Collections.binarySearch(list,6)); //1
        System.out.println(Collections.binarySearch(list,3)); //-2
        //. The number 3 would need to be inserted at index 1 (after the number 1 but
        //before the number 6). Negating that gives us −1, and subtracting 1 gives
        //us −2.

        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);
        //The correct answer is ‐1. Before you panic, you don't need to know that
        //the answer is ‐1. You do need to know that the answer is not defined. Line
        //3 creates a list, [Fluffy, Hoppy]. This list happens to be sorted in
        //ascending order. Line 4 creates a Comparator that reverses the natural
        //order. Line 5 requests a binary search in descending order. Since the list is
        //in ascending order, we don't meet the precondition for doing a search.
     }
}
