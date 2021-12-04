package _3_SortingData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAndSearching {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Collections.sort(rabbits);//does not compile
        // Java knows that the Rabbit class is not Comparable.
    }
}
