package UsingWrapperClasses;

import java.util.HashSet;
import java.util.Set;

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

    }
}
