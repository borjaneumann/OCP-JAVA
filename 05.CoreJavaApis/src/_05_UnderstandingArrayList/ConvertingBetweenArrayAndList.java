package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingBetweenArrayAndList {
    public static void main(String[] args) {
        //ArrayList into Array. Actually makes a copy
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);//this is what we want. we can suggest another size. if
        //it is not big enough. A new Array with the correct size will be created.
        list.clear();
        System.out.println(objectArray.length); //2
        System.out.println(stringArray.length); //2

        //Array to a List
        //Option 1. Create a List that is linked to the original Array.
        String[] array = { "hawk", "robin"};
        List<String> list1 = Arrays.asList(array);
        System.out.println(list1.size());  //2
        list1.set(1,"test");
        array[0] = "new";
        System.out.println("Arrays: " + Arrays.toString(array));
        System.out.println("list1: " + list1);
//        list.remove(1); throws exception we are not allowed to change te size

        //Option 2. Create an immutable list. YOu cannot change values or the size of the list.
        String[] array1 = {"hawk", "robin"};
        List<String> list2 = List.of(array1); //returns immutable list
        System.out.println(list2.size()); //2
        array1[0] = "new";
        System.out.println(Arrays.toString(array)); // [new, robin]
        System.out.println(list2); //[hawk, robin]
        list2.set(1,"test"); //not allowed in an immutable list
    }
}
