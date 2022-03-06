package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_5_UsingArrayListClear {

    public static void main(String[] args) {

        //void clear() -> discard all elements of the ArrayList

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); //[hawk]
        birds.add("hawk");//[hawk, hawk]
        System.out.println(birds.isEmpty());//false
        System.out.println(birds.size());//2
        birds.clear();//clear all elements
        System.out.println(birds.isEmpty());//true
        System.out.println(birds.size());//0
    }
}
