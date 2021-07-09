package UnderstandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingArrayListSet {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>();
        birds.add("blackbird");
        System.out.println("Birds size: " + birds.size());
        birds.set(0,"pigeon");
        System.out.println("Birds size: " + birds.size());
        birds.set(1, "robin");//IndexOutOfBoundsException
    }
}
