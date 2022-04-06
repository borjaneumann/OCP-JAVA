package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _25_ConvertingBetweenArrayAndList {
    public static void main(String[] args) {

        //ARRAYLIST INTO AN ARRAY. A new not linked array is created!
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();//We don't want of type Object
        String[] stringArray = list.toArray(new String[0]);//String is the type we are after!
        // we can suggest another size. if it is not big enough,
        // a new Array with the correct size will be created.
        list.clear(); // this doesnt affect the new created arrays
        System.out.println("objectArray size: " + objectArray.length); //2
        System.out.println("stringArray size: " + stringArray.length); //2

        //ARRAY TO A LIST

        //OPTION 1. Create a List that is linked to the original Array.
        String[] array = { "hawk", "robin"};
        List<String> list1 = Arrays.asList(array);
        System.out.println(list1.size());  //2
        list1.set(1,"test");
        array[0] = "new";
        System.out.println("Arrays: " + Arrays.toString(array));//[new, test]
        System.out.println("list1: " + list1);//[new, test]
//        list.remove(1); throws exception we are not allowed to change the size

        //OPTION 2. Create an immutable list. That means you cannot
        //change the values or the size of the List. You can change the original
        //array, but changes will not be reflected in the immutable List.
        String[] array1 = {"hawk", "robin"};
        List<String> list2 = List.of(array1); //returns immutable list
        System.out.println(list2.size()); //2
        array1[0] = "new";
        System.out.println(Arrays.toString(array)); // [new, robin]
        System.out.println(list2); //[hawk, robin]
        list2.set(1,"test"); //not allowed in an immutable list // throws
        // UnsupportedOperationException
    }
}
