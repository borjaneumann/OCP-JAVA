package _06_CreatingSetsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class _28_IntroducingSets {
    public static void main(String[] args) {
        /*collection of objects that cannot contain duplicates
        set isn't ordered so Set uses all Arraylist methods except for the ones with index
        2 classes implement sets: hashset and hashtree when sorting is important.

        Do you remember that boolean return value on add() that always returned
        true for an ArrayList? Set is a reason it needs to exist. When trying to
        add a duplicate value, the method returns false and does not add the
        value.

        There are two common classes that implement Set that you might see on
        the exam. HashSet is the most common. TreeSet is used when sorting is
        important.
         */
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66));//true
        System.out.println(set.add(66));//false
        System.out.println(set.size());//1
        set.remove(66);
        System.out.println(set.isEmpty());//true
    }
}
