package _4_InitializingVariables;

public class _13_DefiningInstanceAndClassVariables {
    /*
    Variables that are not local variables are defined either as instance
    variables or as class variables.

    Instance Variable
    -----------------
    An instance variable, often called a field, is a value defined within a
    specific instance of an object.
    Two instances could have the same value for name, but changing the value
    for one does not modify the other.

    Class Variable
    --------------
    A class variable is one that is defined on the class level
    and shared among all instances of the class.
    It can even be publicly accessible to classes outside
    the class without requiring an instance to use.
    You can tell a variable is a class variable because it has the keyword static before it.

    Default Value
    -------------
    Instance and class variables do not require you to initialize them. As soon
    as you declare these variables, they are given a default value. You’ll need
    to memorize everything in the table below except the default value of char.
    To make this easier, remember that the compiler doesn’t know what value to
    use and so wants the simplest value it can give the type: null for an object
    and 0/false for a primitive.

    Default initialization values by type
    Variable type                           Default initialization value
    -------------------------------------------------------------
    boolean                                 false
    byte, short, int, long                  0
    float, double                           0.0
    char                                    '\u0000' (NUL)
    All object references (everything else) null

     */
}
