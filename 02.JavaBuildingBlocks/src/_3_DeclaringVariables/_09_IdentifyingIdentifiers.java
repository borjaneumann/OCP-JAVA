package _3_DeclaringVariables;

public class _09_IdentifyingIdentifiers {
    /*
    An identifier is the name of a variable, method, class, interface, or package.

    There are only four rules to remember for legal identifiers:

    1) Identifiers must begin with a letter, a $ symbol, or a _ symbol.
    2) Identifiers can include numbers but not start with them.
    3) Since Java 9, a single underscore _ is not allowed as an identifier.
    4) You cannot use the same name as a Java reserved word.

     Reserved words
     -----------------------------------------------------------------------------
    abstract    assert      boolean     break       byte    case    catch       char    class
    const*      continue    default     do          double  else    enum        extends false**
    final       finally     float       for         goto*   if      implements
    import      instanceof  int         interface   long    native  new         null**
    package     private     protected   public      return  short   static      strictfp
    super       switch      synchronized this       throw   throws  transient   true**  try
    void        volatile    while       _ (underscore)
    -------------------------------------------------------------------------------------------
    * The reserved words const and goto aren’t actually used in Java. They are reserved so that people
    coming from other programming languages don’t use them by accident—and in theory, in case Java
    wants to use them one day.
    ** true/false/null are not actually reserved words, but literal values. Since they cannot be used as
    identifier names, we include them in this table.

    Tip: When you see a nonstandard identifier, be sure to check if it is legal. If it’s not, you
    get to mark the answer “does not compile” and skip analyzing everything else in the question.

    Style:

    camelCase : In camelCase, the first letter of each word is capitalized.
        - Method and variable names are written in camelCase with the first
        letter being lowercase.
        - Class and interface names are written in camelCase with the first
        letter being uppercase. Also, don’t start any class name with $, as
        the compiler uses this symbol for some files.

     snake_case : It simply uses an underscore (_) to separate words, often
        entirely in lowercase. Constant static final values are often written
        in snake_case, such as THIS_IS_A_CONSTANT. In addition, enum values
        tend to be written with snake_case, as in Color.RED, Color.DARK_GRAY, and so on.
     */

}
