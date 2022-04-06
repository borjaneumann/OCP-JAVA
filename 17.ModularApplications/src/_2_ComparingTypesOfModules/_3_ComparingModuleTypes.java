package _2_ComparingModules;

public class _3_ComparingModuleTypes {

    //A key point to remember is that:
    // 1. code on the classpath can access the module path.
    // 2. By contrast, code on the module path is unable to read from the classpath.

    /*
    Properties of modules types
    Property                                                            Named           Automatic           Unnamed
    =========================================================================================================================
    - A ______ module contains a module‐info file?                      Yes             No                  Ignored if present
    ---------------------------------------------------------------------------------------------------------------------------
    - A ______ module exports which packages                            Those in the    All packages        No packages
        to other modules?                                               module‐info file
    ---------------------------------------------------------------------------------------------------------------------------
    - A ______ module is readable by other modules on                   Yes             Yes                 No
    the module path?
    ---------------------------------------------------------------------------------------------------------------------------
    - A ______ module is readable by other JARs on the classpath?       Yes             Yes                 Yes

    ==========================================================================================================================
     */

}
