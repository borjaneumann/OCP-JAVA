public class _5_CompilingWithModules {
    /*
    COMPILING WITH MODULES
    =======================
    Almost all the packages on the exam are in the java.base module.
    As you may recall from Chapter 11, “Modules,” this module is
    included automatically when you run your application as a module.

    By contrast, the JDBC classes are all in the module java.sql. They
    are also in the package java.sql. The names are the same, so it
    should be easy to remember. When working with SQL, you need the
    java.sql module and import java.sql.*.

    We recommend separating your studies for JDBC and modules. You
    can use the classpath when working with JDBC and reserve your
    practice with the module path for when you are studying modules.

    That said, if you do want to use JDBC code with modules,
    remember to update your module‐info file to include the following:

    requires java.sql;

     */
}
