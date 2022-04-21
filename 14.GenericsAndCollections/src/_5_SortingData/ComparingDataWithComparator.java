package _5_SortingData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparingDataWithComparator implements  Comparable<ComparingDataWithComparator>{

    private String name;
    private int weight;

    public ComparingDataWithComparator(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int compareTo(ComparingDataWithComparator d) {
        return name.compareTo(d.name); }
    @Override
    public String toString() {
        return "ComparingDataWithComparator{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Comparator<ComparingDataWithComparator> byWeight = new Comparator<ComparingDataWithComparator>() {
            @Override
            public int compare(ComparingDataWithComparator o1, ComparingDataWithComparator o2) {
                return o1.getWeight()-o2.getWeight();
            }
        };
        var ducks = new ArrayList<ComparingDataWithComparator>();
        ducks.add(new ComparingDataWithComparator("Quack", 7));
        ducks.add(new ComparingDataWithComparator("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks); // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks); //[Quack, Puddles]

        //Comparator is a functional interface since there is only one abstract
        //method to implement. This means that we can rewrite the comparator on
        //lines 43‐48 using a lambda expression, as shown here:
        //Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-
        //d2.getWeight();

        //Alternatively, we can use a method reference and a helper method to
        //specify we want to sort by weight.
        //Comparator<Duck> byWeight =
        //Comparator.comparing(Duck::getWeight);


    }
}
