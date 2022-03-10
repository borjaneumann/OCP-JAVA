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

    But what do we do if we need a whole pile of other classes in the java.sql package?
    import java.util.Date;
    import java.sql.*;

    If you explicitly import a class name, it takes precedence
    over any wildcards present.

    IF YOU REALLY NEED TO USE TWO CLASSES WITH THE SAME NAME

    Sometimes you really do want to use Date from two different
    packages. When this happens, you can pick one to use in the import
    and use the other’s fully qualified class name [the package name, a
    period (.), and the class name] to specify that it’s special. Here’s an
    example:
    import java.util.Date;
    public class Conflicts {
        Date date;
        java.sql.Date sqlDate;
    }
    Or you could have neither with an import and always use the fully
    qualified class name.
    public class Conflicts {
        java.util.Date date;
        java.sql.Date sqlDate;
    }
     */
}

