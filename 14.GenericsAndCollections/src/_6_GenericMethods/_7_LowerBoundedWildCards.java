package _6_GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class _7_LowerBoundedWildCards {

    public static void addSound(List<? super String> list) {
    list.add("quack");
}
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

        //The problem is that we want to pass a List<String> and a List<Object>
        //to the same method.

        //To solve this problem, we need to use a lower bound. See addSound method

        //With a lower bound, we are telling Java that the list will be a list of String
        //objects or a list of some objects that are a superclass of String. Either
        //way, it is safe to add a String to that list.


    }

}
