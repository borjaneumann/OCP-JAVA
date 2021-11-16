package UsingWrapperClasses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class _05_CollectionMethod {
    public static void main(String[] args) {

        //add()
        //boolean add(E element)

        Collection<String> list = new ArrayList<>();
        System.out.println("Add: " + list.add("Sparrow")); // true
        System.out.println("Add: " + list.add("Sparrow")); // true
        System.out.println(list);

        Collection<String> set = new HashSet<>();
        System.out.println("Add: " + set.add("Sparrow")); // true
        System.out.println("Add: " + set.add("Sparrow")); // false. No duplicates for Set.
        System.out.println(set);

        //remove()
        //boolean remove(Object object)

        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk,hawk]
        System.out.println("Remove: " + birds.remove("cardinal")); // false
        System.out.println("Remove: " + birds.remove("hawk")); // true
        System.out.println("Remove: " + birds); // [hawk]

        //Java does not allow removing elements from a list while using the
        //enhanced for loop.
        Collection<String> birds1 = new ArrayList<>();
        birds.add("hawk");
        birds.add("hawk");
        birds.add("hawk");
        for (String bird : birds1) { // ConcurrentModificationException
            birds.remove(bird);
        }
        System.out.println("removing from Loops: " + birds1);

        //isEmpty() and size()

        //boolean isEmpty()
        //int size()
        Collection<String> birds3 = new ArrayList<>();
        System.out.println("IsEmpty: " + birds3.isEmpty()); // true
        System.out.println("size: " + birds3.size()); // 0
        birds3.add("hawk"); // [hawk]
        birds3.add("hawk"); // [hawk, hawk]
        System.out.println("IsEmpty: " + birds3.isEmpty()); // false
        System.out.println("size: " + birds3.size()); // 2

        //clear()
        //void clear()
        Collection<String> birds4 = new ArrayList<>();
        birds4.add("hawk"); // [hawk]
        birds4.add("hawk"); // [hawk, hawk]
        System.out.println("before Clear //IsEmpty: " + birds4.isEmpty()); // false
        System.out.println("before Clear //size: " + birds4.size()); // 2
        birds4.clear(); // []
        System.out.println("after Clear //IsEmpty: " + birds4.isEmpty()); // true
        System.out.println("after Clear //size: " + birds4.size()); // 0

        //contains()
        //boolean contains(Object object)
        Collection<String> birds5 = new ArrayList<>();
        birds5.add("hawk"); // [hawk]
        System.out.println("Contains: " + birds5.contains("hawk")); // true
        System.out.println("Contains: " + birds5.contains("robin")); // false


    }
}
