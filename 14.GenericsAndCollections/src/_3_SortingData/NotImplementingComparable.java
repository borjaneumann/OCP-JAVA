package _3_SortingData;

import java.util.Set;
import java.util.TreeSet;

public class NotImplementingComparable {

    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));

        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit()); // ClassCastException
    }
}
