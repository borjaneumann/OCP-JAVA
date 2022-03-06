package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_2_UsingArrayListRemove {
    public static void main(String[] args) {

        //boolean remove (Object object) -> remove the first matching value in the ArrayList
        //E remove (int index) -> remove the element at a specified index.

        //This time the boolean return value tells us whether a match was removed.
        //The E return type is the element that actually got removed.

        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        System.out.println(birds.remove("cardinal"));//false
        System.out.println(birds.remove("hawk"));//true
        System.out.println(birds.remove(0));//removes hawk
        System.out.println(birds);//[]

        /*
        Since calling remove() with an int uses the index, an index that doesn’t
        exist will throw an exception. For example, birds.remove(100) throws an
        IndexOutOfBoundsException.
        There is also a removeIf() method. We’ll cover it in the next chapter
        because it uses lambda expressions (a topic in that chapter).
         */
    }
}
