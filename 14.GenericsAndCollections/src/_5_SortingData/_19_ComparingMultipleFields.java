package _5_SortingData;

public class _19_ComparingMultipleFields {
    /*
    When writing a Comparator that compares multiple instance variables, the
    code gets a little messy. Suppose that we have a Squirrel class, as shown
    here:
    public class Squirrel {
        private int weight;
        private String species;
        // Assume getters/setters/constructors provided
    }
    We want to write a Comparator to sort by species name. If two squirrels
    are from the same species, we want to sort the one that weighs the least
    first. We could do this with code that looks like this:

    public class MultiFieldComparator implements Comparator<Squirrel> {
        public int compare(Squirrel s1, Squirrel s2) {
            int result = s1.getSpecies().compareTo(s2.getSpecies());
            if (result != 0) return result;
            return s1.getWeight()-s2.getWeight();
    }}
    This works assuming no species names are null. It checks one field. If
    they don't match, we are finished sorting. If they do match, it looks at the
    next field. This isn't that easy to read, though. It is also easy to get wrong.
    Changing != to == breaks the sort completely.
    Alternatively, we can use method references and build the comparator.
    This code represents logic for the same comparison.

    Comparator<Squirrel> c = Comparator.comparing(Squirrel::getSpecies)
    .thenComparingInt(Squirrel::getWeight);

    This time, we chain the methods. First, we create a comparator on species
    ascending. Then, if there is a tie, we sort by weight. We can also sort in
    descending order. Some methods on Comparator, like
    thenComparingInt(), are default methods. As discussed in Chapter 12,
    default methods were introduced in Java 8 as a way of expanding APIs.
    Suppose we want to sort in descending order by species.
    var c = Comparator.comparing(Squirrel::getSpecies).reversed();
    Table 14.12 shows the helper methods you should know for building
    Comparator. We've omitted the parameter types to keep you focused on
    the methods. They use many of the functional interfaces you'll be learning
    about in the next chapter.
    TABLE 14.12 Helper static methods for building a Comparator

    Method                          Description
    =====================================================================================
    comparing(function)             Compare by the results of a function that returns any
                                    Object (or object autoboxed into an Object).
    -------------------------------------------------------------------------------------
    comparingDouble(function)       Compare by the results of a function that returns a
                                    double.
    -------------------------------------------------------------------------------------
    comparingInt(function)          Compare by the results of a function that returns an
                                    int.
    -------------------------------------------------------------------------------------
    comparingLong(function)         Compare by the results of a function that returns a
                                    long.
    -------------------------------------------------------------------------------------
    naturalOrder()                  Sort using the order specified by the Comparable
                                    implementation on the object itself.
    -------------------------------------------------------------------------------------
    reverseOrder()                  Sort using the reverse of the order specified by the
                                    Comparable implementation on the object itself.
    -------------------------------------------------------------------------------------

    Table 14.13 shows the methods that you can chain to a Comparator to
    further specify its behavior.
    TABLE 14.13 Helper default methods for building a Comparator
    Method                          Description
    ====================================================================================
    reversed()                      Reverse the order of the chained Comparator.
    -------------------------------------------------------------------------------------
    thenComparing(function)         If the previous Comparator returns 0, use this
                                    comparator that returns an Object or can be autoboxed
                                    into one.
    -------------------------------------------------------------------------------------
    thenComparingDouble(function)   If the previous Comparator returns 0, use this
                                    comparator that returns a double. Otherwise, return the
                                    value from the previous Comparator.
    -------------------------------------------------------------------------------------
    thenComparingInt(function)      If the previous Comparator returns 0, use this
                                    comparator that returns an int. Otherwise, return the
                                    value from the previous Comparator.
    -------------------------------------------------------------------------------------
    thenComparingLong(function)     If the previous Comparator returns 0, use this
                                    comparator that returns a long. Otherwise, return the
                                    value from the previous Comparator.

    You've probably noticed by now that we often ignore null values in
    checking equality and comparing objects. This works fine for the
    exam. In the real world, though, things aren't so neat. You will have
    to decide how to handle null values or prevent them from being in
    your object.
     */
}
