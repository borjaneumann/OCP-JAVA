package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _26_UsingVarargsToCreateAList {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("one","two");
        List<String> list2 = List.of("one","two");

        /* Array and list conversions
                                        toArray()   Arrays.asList()     List.of()
  ========================================================================================
    Type converting from                List        Array (orvarargs)   Array (or varargs)
    --------------------------------------------------------------------------------------
    Type created                        Array       List                List
    --------------------------------------------------------------------------------------
    Allowed to remove values            No          No                  No
    from created object
    --------------------------------------------------------------------------------------
    Allowed to change values in         Yes         Yes                 No
    the created object
    --------------------------------------------------------------------------------------
    Changing values in the              No          Yes                 N/A
    created object affects the
    original or vice versa.
         */

        //if you want to change the number of elements
        List<String> fixedSizeList =  Arrays.asList("a", "b", "c");
        List<String> expandableList =  new ArrayList<>(fixedSizeList);
    }
}
