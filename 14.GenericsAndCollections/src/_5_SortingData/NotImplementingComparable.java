package _5_SortingData;

import java.util.Set;
import java.util.TreeSet;

public class NotImplementingComparable {

    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));

//        Set<Rabbit> rabbits = new TreeSet<>();
//        rabbits.add(new Rabbit()); // ClassCastException

        Set<Rabbit> rabbits = new TreeSet<>((r1,r2) -> r1.id- r2.id);
        rabbits.add(new Rabbit());

        //Now Java knows that you want to sort by id and all is well. Comparators
        //are helpful objects. They let you separate sort order from the object to be
        //sorted.
    }
}
