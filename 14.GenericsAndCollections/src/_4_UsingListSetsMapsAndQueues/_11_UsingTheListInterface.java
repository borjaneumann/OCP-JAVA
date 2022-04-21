package _4_UsingListSetsMapsAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _11_UsingTheListInterface {
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

        //Working with List Methods

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

        List<Integer> numbers = Arrays.asList(1,2,3);
        numbers.replaceAll (x -> x * 2);
        System.out.println(numbers);

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

        //ITERATING THROUGH A LIST
        List<String> list2 = new ArrayList<>();
        for (String string: list2) {
            System.out.println(string);
        }

        //There is another approach.
        //The hasNext() method checks whether there is a next value. In other
        //words, it tells you whether next() will execute without throwing an
        //exception.
        // The next() method actually moves the Iterator to the next element.

        Iterator<String> iter = list.iterator();
        while  (iter.hasNext()){
            String string = iter.next();
            System.out.println(string);
        }
    }
}
