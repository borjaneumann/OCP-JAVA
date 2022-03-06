package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_6_UsingArrayListContains {

    public static void main(String[] args) {
        //boolean contains(Object object);
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));//true
        System.out.println(birds.contains("robin"));//false
    }
}
