package UnderstandingArrayList;

import java.util.Arrays;
import java.util.List;

public class UsingVarargsToCreateAList {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one","two");
        List<String> list2 = List.of("one","two");
    }
}
