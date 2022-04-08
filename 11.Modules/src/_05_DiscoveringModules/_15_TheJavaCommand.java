package _05_DiscoveringModules;

public class _15_TheJavaCommand {
    /*
    In this section, we will show you how to use commands to learn about modules.
    You do not need to know the output of the commands in this section. You
    do, however, need to know the syntax of the commands and what they do.
    We include the output where it facilitates remembering what is going on.

    THE JAVA COMMAND
    ================
    The java command has three module-related options.
    1) One describes a module,
    2) Another lists the available modules, and
    3) the third shows the module resolution logic.

    1. Describing a Module
    =======================
    module zoo.animal.feeding {
        exports zoo.animal.feeding;
    }

    The following two commands are equivalent:

    java -p mods -d zoo.animal.feeding
    java -p mods --describe-module zoo.animal.feeding

    For example, it might print this:
    zoo.animal.feeding
    file:///absolutePath/mods/zoo.animal.feeding.jar
    exports zoo.animal.feeding
    requires java.base mandated

    The java.base module is special. It is automatically added as a
    dependency to all modules. This module has frequently used packages like
    java.util. That’s what the mandated is about. You get java.base
    whether you asked for it or not.

    for clarification (qualified exports and contains):
    zoo.animal.care
    file:///absolutePath/mods/zoo.animal.care.jar
    requires zoo.animal.feeding transitive
    requires java.base mandated
    qualified exports zoo.animal.care.medical to zoo.staff -->The qualified exports is the full name of
                                                                exporting to a specific module.
    contains zoo.animal.care.details -->contains means that there is a package in the module
                                        that is not exported at all. T


    2. Listing Available modules
    ============================
    java --list-modules

    When we ran it, the output went on for 70 lines and looked like this:
    java.base@11.0.2
    java.compiler@11.0.2
    java.datatransfer@11.0.2 ...to make a total of 70

    This is a listing of all the modules that come with Java and their version
    numbers.
    More interestingly, you can use this command with custom code. Let’s try
    again with the directory containing our zoo modules.

    java -p mods --list-modules

    3. Showing Module Resolution
    ============================
    In case listing the modules didn’t give you enough output, you can also
    use the --show-module-resolution option. You can think of it as a way
    of debugging modules. It spits out a lot of output when the program starts
    up. Then it runs the program.

    java --show-module-resolution -p feeding -m zoo.animal.feeding/zoo.animal.feeding.Task

    root zoo.animal.feeding file:///absolutePath/feeding/
    java.base binds java.desktop jrt:/java.desktop
    java.base binds jdk.jartool jrt:/jdk.jartool
    ...
    jdk.security.auth requires java.naming jrt:/java.naming
    jdk.security.auth requires java.security.jgss
    jrt:/java.security.jgss
    ...
    All fed!
    It starts out by listing the root module. That’s the one we are running:
    zoo.animal .feeding. Then it lists many lines of packages included by
    the mandatory java.base module. After a while, it lists modules that have
    dependencies. Finally, it outputs the result of the program All fed!. The
    total output of this command is 66 lines.

     */
}
