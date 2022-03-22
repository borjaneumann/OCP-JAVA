package _04_CallingAPIsWithLambdas;

import java.util.ArrayList;
import java.util.List;

public class _12_RemoveIf {
    /*
    List and Set declare a removeIf() method that takes a Predicate.
    Imagine we have a list of names for pet bunnies. We decide we want to
    remove all of the bunny names that don’t begin with the letter h because
    our little cousin really wants us to choose an h name. We could solve this
    problem by writing a loop. Or we could solve it in one line:
     */
    public static void main(String[] args) {
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies); // [long ear, floppy,hoppy]
        bunnies.removeIf(s -> s.charAt(0) != 'h');
        System.out.println(bunnies); // [hoppy]
    }
}
