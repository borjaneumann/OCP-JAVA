package SetsAndMaps;

import java.util.HashSet;
import java.util.Set;

public class IntroducingSets {
    public static void main(String[] args) {
        //collection of objects that cannot contain duplicates
        //set isnt ordered so Set uses all Arraylist methods except for the ones with index
        //2 classes implement sets: hashset and hashtree when sorting is important.

        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66));//true
        System.out.println(set.add(66));//false
        System.out.println(set.size());//1
        set.remove(66);
        System.out.println(set.isEmpty());//true
    }
}
