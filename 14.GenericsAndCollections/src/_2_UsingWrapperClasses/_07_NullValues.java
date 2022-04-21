package _2_UsingWrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class _07_NullValues {

    public static void main(String[] args) {
//        var heights = new ArrayList<Integer>();
//        heights.add(null);
//        int h = heights.get(0); // NullPointerException

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(Integer.valueOf(3));
        numbers.add(Integer.valueOf(5));
        numbers.remove(1);
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);
    }
    /*
    WRAPPER CLASSES AND NULL
    Speaking of null, one advantage of a wrapper class over a primitive
    is that it can hold a null value. While null values aren't particularly
    useful for numeric calculations, they are quite useful in data‐based
    services. For example, if you are storing a user's location data using
    (latitude, longitude), it would be a bad idea to store a missing point
    as (0,0) since that refers to an actual location off the cost of Africa
    where the user could theoretically be.
     */

}
