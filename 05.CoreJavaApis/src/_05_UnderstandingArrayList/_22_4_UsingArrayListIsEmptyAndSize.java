package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_4_UsingArrayListIsEmptyAndSize {
    public static void main(String[] args) {
        //boolean isEmpty;
        //int size();
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty());//true
        System.out.println(birds.size());//0
        birds.add("hawk");//[hawk]
        birds.add("hawk");//[hawk, hawk]
        System.out.println(birds.isEmpty());//false
        System.out.println(birds.size());//2

        //isEmpty -> size() == 0;

    }
}
