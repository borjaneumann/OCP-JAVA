package _1_ReviewingModulesDirectives;

public class _01_ReviewingModuleDirectives {

    /*Derivative                        Description
    ----------------------------------------------------------------------------------------
    exports <package>                   Allows all modules to access the package
    exports <package> to <module>       Allows a specific module to access the package
    requires <module>                   Indicates module is dependent on another module
    requires transitive <module>        Indicates the module and that all modules that use this
                                        module are dependent on another module
    uses <interface>                    Indicates that a module uses a service
    provides<interface> with <class>    Indicates that a module provides an implementation of a service */

    //Comparing Types of Modules

    /* The modules you learned about in Chapter 11 are called named modules.
    There are two other types of modules: automatic modules and unnamed
    modules. In this section, we describe these three types of modules. On the
    exam, you will need to be able to compare them.*/

    //NAMED MODULES
    /* A named module is one containing a module‐info file. To review, this file
    appears in the root of the JAR alongside one or more packages. Unless
    otherwise specified, a module is a named module. Named modules appear
    on the module path rather than the classpath. As a way of remembering this, a named module has the name inside the
    module‐info file and is on the module path.*/

    //AUTOMATIC MODULES
    /*An automatic module appears on the module path but does not contain a
    module‐info file. It is simply a regular JAR file that is placed on the
    module path and gets treated as a module.
    As a way of remembering this, Java automatically determines the module name.*/

    //UNNAMED MODULES
    /*An unnamed module appears on the classpath. Like an automatic module,
    it is a regular JAR. Unlike an automatic module, it is on the classpath
    rather than the module path. This means an unnamed module is treated
    like old code and a second‐class citizen to modules.
    An unnamed module does not usually contain a module‐info file. If it
    happens to contain one, that file will be ignored since it is on the classpath.

    Unnamed modules do not export any packages to named or automatic
    modules. The unnamed module can read from any JARs on the classpath
    or module path. You can think of an unnamed module as code that works
    the way Java worked before modules. Yes, we know it is confusing to
    have something that isn't really a module having the word module in its
    name.

    CLASSPATH VS. MODULE PATH
    =========================
    Before we get started, a brief reminder that the Java runtime is
    capable of using class and interface types from both the classpath
    and the module path, although the rules for each are a bit different.

    An application can access any type in the classpath that is exposed
    via standard Java access modifiers, such as a public class.
    On the other hand, public types in the module path are not
    automatically available. While Java access modifiers must still be
    used, the type must also be in a package that is exported by the
    module in which it is defined. In addition, the module making use of
    the type must contain a dependency on the module.
    */


}
