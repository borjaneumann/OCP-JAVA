package _5_ComparingValues;

public class _15_RelationalOperators {
    /*
    Relational operators compare two expressions and return a boolean value.

    Relational operators
    Operator    Description
    ===============================================================================
    <           Returns true if the value on the left is strictly less than the
                value on the right
    -------------------------------------------------------------------------------
    <=          Returns true if the value on the left is less than or equal to the
                value on the right
    -------------------------------------------------------------------------------
    >           Returns true if the value on the left is strictly greater than the
                value on the right
    -------------------------------------------------------------------------------
    >=          Returns true if the value on the left is greater than or equal to
                the value on the right
    -------------------------------------------------------------------------------
    a           Returns true if the reference that a points to is an instance of a
    instance    class, subclass, or class that implements a particular interface,
    of b        as named in b
    -------------------------------------------------------------------------------

    If the two numeric operands are not of the same data type, the
    smaller one is promoted as previously discussed.

    instanceof Operator
    It is useful for determining whether an arbitrary object is a member of a
    particular class or interface at runtime.
     */
    public static void openZoo(Number time) {
        if(time instanceof Integer)
            System.out.print((Integer)time + " O'clock");
        else
            System.out.print(time);
    }

    public static void main(String[] args) {
        _15_RelationalOperators.openZoo(7); // 7 O'clock
        System.out.println();
        _15_RelationalOperators.openZoo(4.56); // 4.56
    }
    /*
    Notice that we cast the Integer value in this example. It is common to use
    casting and instanceof together when working with objects that can be
    various different types, since it can give you access to fields available only
    in the more specific classes. It is considered a good coding practice to use
    the instanceof operator prior to casting from one object to a narrower
    type.

    Invalid instanceof
    For example, Number cannot possibly hold a String
    value, so the following would cause a compilation error:
    public static void openZoo(Number time) {
    if(time instanceof String) // DOES NOT COMPILE

    Null and the instanceof operator
    You should know that calling instanceof on the null literal or a null
    reference always returns false.

    System.out.print(null instanceof Object);
    Object noObjectHere = null;
    System.out.print(noObjectHere instanceof String);

    System.out.print(null instanceof null); // DOES NOT COMPILE
     */

}
