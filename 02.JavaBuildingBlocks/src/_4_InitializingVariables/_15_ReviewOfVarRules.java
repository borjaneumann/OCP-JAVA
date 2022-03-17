package _4_InitializingVariables;

public class _15_ReviewOfVarRules {
    /*
    Review of var Rules
    -------------------
    1. A var is used as a local variable in a constructor, method, or initializer block.
    2. A var cannot be used in constructor parameters, method parameters, instance variables,
    or class variables.
    3. A var is always initialized on the same line (or statement) where it is
    declared.
    4. The value of a var can change, but the type cannot.
    5. A var cannot be initialized with a null value without a type.
    6. A var is not permitted in a multiple-variable declaration.
    7. A var is a reserved type name but not a reserved word, meaning it can be
    used as an identifier except as a class, interface, or enum name.

    VAR IN THE REAL WORLD
    ---------------------
    The var keyword is great for exam authors because it makes it easier
    to write tricky code. When you work on a real project, you want the
    code to be easy to read.
    Once you start having code that looks like the following, it is time to
    consider using var:

    PileOfPapersToFileInFilingCabinet pileOfPapersToFile =
    new PileOfPapersToFileInFilingCabinet();

    You can see how shortening this would be an improvement without losing any information:
    var pileOfPapersToFile = new PileOfPapersToFileInFilingCabinet();

     */
}
