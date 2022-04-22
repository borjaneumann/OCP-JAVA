package _5_SortingData;

public class _18_ComparingComparableAndComparator {
    /*
    Comparison of Comparable and Comparator
    Difference                                  Comparable                  Comparator
    Package name                                java.lang                   java.util
    ----------------------------------------------------------------------------------
    Interface must be implemented by class      Yes                         No
    comparing?
    ----------------------------------------------------------------------------------
    Method name in interface                    compareTo()                 compare()
    ----------------------------------------------------------------------------------
    Number of parameters                        1                           2
    ----------------------------------------------------------------------------------
    Common to declare using a lambda            No                          Yes
        ----------------------------------------------------------------------------------

    Memorize this table—really. The exam will try to trick you by mixing up
    the two and seeing if you can catch it. Do you see why this one doesn't
    compile?

    var byWeight = new Comparator<Duck>() { // DOES NOT COMPILE
        public int compareTo(Duck d1, Duck d2) {
            return d1.getWeight()-d2.getWeight();
            }
    };
    The method name is wrong. A Comparator must implement a method
    named compare(). Pay special attention to method names and the number
    of parameters when you see Comparator and Comparable in questions.

     */
}
