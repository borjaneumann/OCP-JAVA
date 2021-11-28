package _2_UsingWrapperClasses;

import java.util.Arrays;
import java.util.List;

public class _06_CreatingAListWithAFactory {

    public static void main(String[] args) {

        //Arrays.asList(varargs) --> Returns fixed size list backed by an array
        //List.of(varargs) --> Returns immutable
        //List.copyOf(collection) --> Returns immutable list with copy of original collection's values

        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array); // [a, b, c]
        List<String> copy = List.copyOf(asList); // [a, b, c]

        array[0] = "z";

        System.out.println(asList); // [z, b, c]
        System.out.println(of); // [a, b, c]
        System.out.println(copy); // [a, b, c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]
        copy.add("y"); // throws UnsupportedOperationException
    }
}
