package _5_SortingData;

public class _17_ComparingDataWithAComparator {
    /*
    Sometimes you want to sort an object that did not implement Comparable,
    or you want to sort objects in different ways at different times. Suppose
    that we add weight to our Duck class. We now have the following:

    1: import java.util.ArrayList;
    2: import java.util.Collections;
    3: import java.util.Comparator;
    4:
    5: public class Duck implements Comparable<Duck> {
    6:      private String name;
    7:      private int weight;
    8:
    9: // Assume getters/setters/constructors provided
    10:
    11:     public String toString() { return name; }
    12:
    13:     public int compareTo(Duck d) {
    14:         return name.compareTo(d.name);
    15:     }
    16:
    17:     public static void main(String[] args) {
    18:         Comparator<Duck> byWeight = new Comparator<Duck>() {
    19:             public int compare(Duck d1, Duck d2) {
    20:             return d1.getWeight()-d2.getWeight();
    21:             }
    22:         };
    23:         var ducks = new ArrayList<Duck>();
    24:         ducks.add(new Duck("Quack", 7));
    25:         ducks.add(new Duck("Puddles", 10));
    26:         Collections.sort(ducks);
    27:         System.out.println(ducks); // [Puddles, Quack]
    28:         Collections.sort(ducks, byWeight);
    29:         System.out.println(ducks); // [Quack, Puddles]
    30:     }
    31: }

    First, notice that this program imports java.util.Comparator on line 3.
    We don't always show imports since you can assume they are present if
    not shown. Here, we do show the import to call attention to the fact that
    Comparable and Comparator are in different packages, namely, java.lang
    versus java.util, respectively. That means Comparable can be used
    without an import statement, while Comparator cannot.
    The Duck class itself can define only one compareTo() method. In this
    case, name was chosen. If we want to sort by something else, we have to
    define that sort order outside the compareTo() method using a separate
    class or lambda expression.
    Lines 18‐22 of the main() method show how to define a Comparator using
    an inner class. On lines 26‐29, we sort without the comparator and then
    with the comparator to see the difference in output.
    Comparator is a functional interface since there is only one abstract
    method to implement. This means that we can rewrite the comparator on
    lines 18‐22 using a lambda expression, as shown here:
    Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-
    d2.getWeight();
    Alternatively, we can use a method reference and a helper method to
    specify we want to sort by weight.

    Comparator<Duck> byWeight = Comparator.comparing(Duck::getWeight);

    In this example, Comparator.comparing() is a static interface method
    that creates a Comparator given a lambda expression or method reference.
    Convenient, isn't it?

    IS COMPARABLE A FUNCTIONAL INTERFACE?
    =====================================
    We said that Comparator is a functional interface because it has a
    single abstract method. Comparable is also a functional interface
    since it also has a single abstract method. However, using a lambda
    for Comparable would be silly. The point of Comparable is to
    implement it inside the object being compared.
     */
}
