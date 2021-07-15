package UnderstandingArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingArrayListSorting {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(9);
        numbers.add(109);
        Collections.sort(numbers);//it uses the collections interface.
        System.out.println(numbers);
    }
}
