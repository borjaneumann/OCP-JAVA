package UsingWrapperClasses;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _10_UsingTheSetInterface {

    public static void main(String[] args) {

        //Like List, you can create an immutable Set in one line or make a copy of
        //an existing one.

        Set<Character> letters = Set.of('z','o','e'); //no repetions please!
        Set<Character> copy = Set.copyOf(letters);

        //Hashset
        Set<Integer> setOfNumbers = new HashSet<>();
        boolean b1 = setOfNumbers.add(66); //true
        boolean b2 = setOfNumbers.add(10); //true
        boolean b3 = setOfNumbers.add(66); //false, no repetions please!
        boolean b4 = setOfNumbers.add(8); //true
        setOfNumbers.forEach(System.out::println);

        System.out.println();
        //TreeSet
        Set<Integer> set = new TreeSet<>();
        boolean b5 = set.add(66); // true
        boolean b6 = set.add(10); // true
        boolean b7 = set.add(66); // false
        boolean b8 = set.add(8); // true
        set.forEach(System.out::println); // they get printed in their natural sorted order



    }
}
