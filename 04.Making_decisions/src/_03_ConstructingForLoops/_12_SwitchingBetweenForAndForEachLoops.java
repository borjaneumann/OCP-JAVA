package _03_ConstructingForLoops;

import java.util.ArrayList;
import java.util.List;

public class _12_SwitchingBetweenForAndForEachLoops {
    public static void main(String[] args) {
        //This is not as short as our for-each example, but it does create the output
        //we wanted, without the extra comma.
        List<String> names = new ArrayList<String>();
        names.add("Lisa");
        names.add("Kevin");
        names.add("Roger");
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(name); //Lisa, Kevin, Roger
        }
        System.out.println();
        /*
        It is also common to use a standard for loop over a for-each loop if
        comparing multiple elements in a loop within a single iteration, as in the
        following example:
         */
        int[] values = new int[3];
        values[0] = 1;
        values[1] = Integer.valueOf(3);
        values[2] = 6;
        for (int i = 1; i < values.length; i++) {
            System.out.print((values[i] - values[i - 1]) + ", "); // 2, 3,
        }

        /* Extra
        COMPARING FOR AND FOR-EACH LOOPS

        Since for and for-each both use the same keyword, you might be
        wondering how they are related. While this discussion is out of
        scope for the exam, let’s take a moment to explore how for-each
        loops are converted to for loops by the compiler.
        When for-each was introduced in Java 5, it was added as a compile-time enhancement.
        This means that Java actually converts the for-each loop into a standard for loop during compilation. For example,
        assuming names is an array of String as we saw in the first example,
        the following two loops are equivalent:

        for(String name : names) {
        System.out.print(name + ", ");
        }
        for(int i=0; i < names.length; i++) {
        String name = names[i];
        System.out.print(name + ", ");
        }

        For objects that inherit Iterable, there is a different, but similar,
        conversion. For example, assuming values is an instance of
        List<Integer>, the following two loops are equivalent:

        for(int value : values) {
        System.out.print(value + ", ");
        }
        for(Iterator<Integer> i = values.iterator(); i.hasNext();
        ) {
        int value = i.next();
        System.out.print(value + ", ");
        }
        Notice that in the second version, there is no update statement in the
        for loop as next() both retrieves the next available value and
        moves the iterator forward.

         */
    }
}
