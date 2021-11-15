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





    }
}
