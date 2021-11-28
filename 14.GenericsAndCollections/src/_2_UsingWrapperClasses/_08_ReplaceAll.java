package _2_UsingWrapperClasses;

import java.util.Arrays;
import java.util.List;

public class _08_ReplaceAll {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.replaceAll (x -> x * 2);
        System.out.println(numbers);
    }
}
