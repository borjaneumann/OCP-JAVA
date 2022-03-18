package _4_AssigningValues;

public class _12_CompoundAssignmentOperators {
    /*
    Compound assignment operators
    Operator            Description
    =======================================================================================
    +=                  Adds the value on the right to the variable on the left and assigns
                        the sum to the variable
    ---------------------------------------------------------------------------------------
    -=                  Subtracts the value on the right from the variable on the left and
                        assigns the difference to the variable
    ---------------------------------------------------------------------------------------
    *=                  Multiplies the value on the right with the variable on the left and
                        assigns the product to the variable
    ---------------------------------------------------------------------------------------
    /=                  Divides the variable on the left by the value on the right and
                        assigns the quotient to the variable
    ---------------------------------------------------------------------------------------

    int camel = 2, giraffe = 3;
    camel = camel * giraffe; // Simple assignment operator
    camel *= giraffe; // Compound assignment operator

    The left side of the compound operator can be applied only to a variable
    that is already defined and cannot be used to declare a new variable. In
    this example, if camel were not already defined, then the expression camel
    *= giraffe would not compile.

    Compound operators are useful for more than just shorthand—they can
    also save us from having to explicitly cast a value.
*/
    public static void main(String[] args) {

        int camel;
        int horse;
//        long goat = 10;

        int sheep = 5;
//        sheep = sheep * goat; // DOES NOT COMPILE

        long cat = 10;
        int lion = 5;
        lion *= cat;
    }
    /*
    The compound operator will first cast cat to a long, apply the
    multiplication of two long values, and then cast the result to an int.
     */
}
