package _5_ComparingValues;

public class _14_EqualityOperators {
    /*
    There’s a semantic difference between “two objects are the same” and “two objects
    are equivalent.”

    Equality operators
    Operator            Apply to primitives             Apply to objects
    -------------------------------------------------------------------------------------
    ==                  Returns true if the two         Returns true if the two value
                        values represent the same       reference the same object
                        values
    -------------------------------------------------------------------------------------
    !=                  Returns true if the two         Returns true if the two values do
                        values represent different      not reference the same object
                        values
    -------------------------------------------------------------------------------------

    The equality operators are used in one of three scenarios:
    1)  Comparing two numeric or character primitive types. If the numeric
        values are of different data types, the values are automatically promoted.
        For example, 5 == 5.00 returns true since the left side is promoted to a
        double.
    2)  Comparing two boolean values
    3)  Comparing two objects, including null and String values

    The comparisons for equality are limited to these three cases, so you
    cannot mix and match types.

    Tip: Pay close attention to the data types when you see an equality operator on
    the exam. As we mentioned in the previous section, the exam creators also
    have a habit of mixing assignment operators and equality operators.

    Object comparison
    For object comparison, the equality operator is applied to the references to
    the objects, not the objects they point to. Two references are equal if and
    only if they point to the same object or both point to null. Let’s take a
    look at some examples:

    File monday = new File("schedule.txt");
    File tuesday = new File("schedule.txt");
    File wednesday = tuesday;
    System.out.println(monday == tuesday); // false
    System.out.println(tuesday == wednesday); // true
    Even though all of the variables point to the same file information, only
    two references, tuesday and wednesday, are equal in terms of == since
    they point to the same object.

    In some languages, comparing null with any other value is always false,
    although this is not the case in Java.

    System.out.print(null == null); // true
     */
}
