package _04_CallingAPIsWithLambdas;

import java.util.ArrayList;
import java.util.List;

public class _13_Sort {
    /*
    While you can call Collections.sort(list), you can now sort directly
    on the list object.
    */
    public static void main(String[] args) {

        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy,hoppy]
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies); // [floppy, hoppy, longear]
        bunnies.sort((b1, b2) -> -b1.compareTo(b2));
        System.out.println(bunnies); // [long ear, hoppy, floppy] Reverse order
    }
}
