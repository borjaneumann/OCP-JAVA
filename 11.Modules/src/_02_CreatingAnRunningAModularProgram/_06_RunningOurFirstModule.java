package _02_CreatingAnRunningAModularProgram;

public class _06_RunningOurFirstModule {
    /*
    4) Before we package our module, we should make sure it works by running it.
    Suppose there is a module named book.module. Inside that module is a package named com.sybex,
    which has a class named OCP with a main() method. Figure 11.5 shows the
    syntax for running a module. Pay special attention to the
    book.module/com.sybex.OCP part.
    It is important to remember that you specify the module name
    followed by a slash (/) followed by the fully qualified class name.

    java --module-path mods --module book.module/com.sybex.OCP

    --module-path mods  --> Location of modules
    book.module         --> Module anme
    com.sybex.          --> Package name
    OCP                 --> Class Name

    There is a short form of --module, is -m. The following command is equivalent:

    java -p feeding -m zoo.animal.feeding/zoo.animal.feeding.Task

    In these examples, we used feeding as the module path because that’s
    where we compiled the code. This will change once we package the
    module and run that.

    java --module-path feeding --module zoo.animal.feeding/zoo.animal.feeding.Task
    All fed!

    Options you need to know for using modules with java
    Use for             Abbreviation            Long form
    ===============================================================
    Module name         -m <name>               --module <name>
    Module path         -p <path>               --module-path <path>


     */
}
