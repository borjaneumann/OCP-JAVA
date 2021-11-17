package UsingWrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class _07_WorkingWithListMethods {
    public static void main(String[] args) {
        //boolean add(Eelement)
        //Adds element to end (available on all Collection APIs)

        //void add(int index, Elelement)
        //Adds element at index and moves the rest toward the end

        //E get(int index)
        //Returns element at index

        //E remove(int index)
        //Removes element at index and moves the rest toward the front

        //void replaceAll(UnaryOperator<E> op)
        //Replaces each element in the list with the result of the operator

        //E set(int index, E e)
        //Replaces element at index and returns original.Throws IndexOutOfBoundsException if the index is
        //larger than the maximum one set

        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0, "NY"); // [NY,SD]
        list.set(1, "FL"); // [NY,FL]
        System.out.println(list.get(0)); // NY
        list.remove("NY"); // [FL]
        list.remove(0); // []
        list.set(0, "?"); //IndexOutOfBoundsException
    }
}
