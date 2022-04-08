package _05_DiscoveringModules;

public class _17_TheJDEPSCommand {
    /*
    The jdeps command gives you information about dependencies within a
    module. Unlike describing a module, it looks at the code in addition to the
    module-info file. This tells you what dependencies are actually used
    rather than simply declared.

    Let’s start with a simple example and ask for a summary of the
    dependencies in zoo.animal.feeding. Both of these commands give the
    same output:

    jdeps -s mods/zoo.animal.feeding.jar
    jdeps -summary mods/zoo.animal.feeding.jar

    Notice that there is one dash (-) before -summary rather than two

    Regardless, the output tells you that there is only one package and it
    depends on the built-in java.base module.
    zoo.animal.feeding -> java.base

    Alternatively, you can call jdeps without the summary option and get the long form:
    jdeps mods/zoo.animal.feeding.jar
    [file:///absolutePath/mods/zoo.animal.feeding.jar]
    requires mandated java.base (@11.0.2)
    zoo.animal.feeding -> java.base
        zoo.animal.feeding -> java.io
            java.base
        zoo.animal.feeding -> java.lang
            java.base

    Finally, the last four lines of the output list the specific packages within
    the java.base modules that are used by zoo.animal.feeding.

    This time, we pick a module that depends on zoo.animal.feeding. We need to specify the
    module path so jdeps knows where to find information about the
    dependent module. We didn’t need to do that before because all dependent
    modules were built into the JDK.
    Following convention, these two commands are equivalent:

    jdeps -s --module-path mods mods/zoo.animal.care.jar
    jdeps -summary --module-path mods mods/zoo.animal.care.jar

    There is not a short form of --module-path in the jdeps command.

    Output:
    zoo.animal.care -> java.base
    zoo.animal.care -> zoo.animal.feeding

    In case you were worried the output was too short, we can run it in full mode:

    jdeps --module-path mods mods/zoo.animal.care.jar



     */
}
