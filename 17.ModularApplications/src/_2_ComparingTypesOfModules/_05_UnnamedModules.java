package _2_ComparingTypesOfModules;

public class _05_UnnamedModules {
    /*
    An unnamed module appears on the classpath. Like an automatic module,
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

     */
}
