package UsingWrapperClasses;

import java.util.Set;

public class _10_UsingTheSetInterface {

    public static void main(String[] args) {

        //Like List, you can create an immutable Set in one line or make a copy of
        //an existing one.

        Set<Character> letters = Set.of('z','o','o');
        Set<Character> copy = Set.copyOf(letters);

    }
}
