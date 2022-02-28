package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingVarargsToCreateAList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one","two");
        List<String> list2 = List.of("one","two");

        //if you want to change the number of elements
        List<String> fixedSizeList =  Arrays.asList("a", "b", "c");
        List<String> expandableList =  new ArrayList<>(fixedSizeList);
    }
}
