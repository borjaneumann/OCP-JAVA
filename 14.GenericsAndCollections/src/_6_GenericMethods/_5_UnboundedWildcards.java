package _6_GenericMethods;

import java.util.ArrayList;
import java.util.List;

public class _5_UnboundedWildcards {

    public static void printList(List<Object> list) {
        for (Object x: list)
            System.out.println(x);
    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
//        printList(keywords); // DOES NOT COMPILE

    // A String is a subclass of an Object. This is true.
    //However, List<String> cannot be assigned to List<Object>. We know,
    //it doesn't sound logical. Java is trying to protect us from ourselves with
    //this one. Imagine if we could write code like this:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(42));
//        List<Object> objects = numbers; //Does not compile
//        objects.add("forty-two");
        System.out.println(numbers.get(1));
    }
}
