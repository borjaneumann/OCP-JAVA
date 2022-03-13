package _06_OrderingElementsInAClass;

public class _19_OrderingElementsInAClass {
    /*
    let’s take a look at the correct order to type them into a file.
    Fields and methods must be within a class.
    multiple classes can be defined in the same file, but only one of
    them is allowed to be public. The public class matches the name of the
    file.
    A file is also allowed to have neither class be public. As long as there isn’t
    more than one public class in a file, it is okay.

    Element         Example                 Required?  Where does it go?
    =================================================================
    Package         package abc;            No         First line in the file
    declaration
    ----------------------------------------------------------------------
    Import          import java.util.*;     No        Immediately after the
    statements                                        package (if present)
    -----------------------------------------------------------------------
    Class           public class C          Yes       Immediately after the import
    declaration                                       (if any)
    ----------------------------------------------------------------------------
    Field           int value;              No        Any top-level element in a
    declarations                                      class
    ---------------------------------------------------------------------------
    Method          void method()           No        Any top-level element in a class
    declarations
    ---------------------------------------------------------------------------
     */
}
