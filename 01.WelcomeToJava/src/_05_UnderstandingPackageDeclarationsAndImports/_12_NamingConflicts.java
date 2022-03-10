package _05_UnderstandingPackageDeclarationsAndImports;

public class _12_NamingConflicts {
    /*
    One of the reasons for using packages is so that class names don’t have to
    be unique across all of Java. This means you’ll sometimes want to import
    a class that can be found in multiple places.
    A common example of this is
    the Date class. Java provides implementations of java.util.Date and
    java.sql.Date.

    public class Conflicts {
        Date date; //java.util.*; or import java.util.Date;.
        // some more code
    }

    When other imports are present.
    import java.util.*;
    import java.sql.*; // causes Date declaration to not compile

    When the class is found in multiple packages, Java gives you a compiler
    error.
    error: reference to Date is ambiguous
        Date date;
        ^
        both class java.sql.Date in java.sql and class
    java.util.Date in java.util match

     */
}

