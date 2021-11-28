package _2_UsingWrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class _02_NullValues {

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

}
