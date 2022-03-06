package _05_UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class _22_3_UsingArrayListSet {

    //E set(int index, E newElement) //Replace without changing the size

    public static void main(String[] args) {

        List<String> birds = new ArrayList<>();
        birds.add("blackbird");
        System.out.println("Birds size: " + birds.size()); // Birds size: 1
        birds.set(0, "pigeon");
        System.out.println("Birds size: " + birds.size()); // Birds size: 1
        birds.set(1, "robin");//IndexOutOfBoundsException
    }
}
