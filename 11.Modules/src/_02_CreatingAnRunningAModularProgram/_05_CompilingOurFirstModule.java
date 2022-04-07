package _02_CreatingAnRunningAModularProgram;

public class _05_CompilingOurFirstModule {
    /*
    3) Before we can run modular code, we need to compile it. Other than the
    module-path option, this code should look familiar from Chapter 1:

    javac --module-path mods
    -d feeding
    feeding/zoo/animal/feeding/*.java
    feeding/module-info.java

    javac --module-path mods -d feeding feeding/zoo/animal/feeding/*.java feeding/module-info.java

    As a review, the -d option specifies the directory to place the class files in.
    The end of the command is a list of the .java files to compile. You can
    list the files individually or use a wildcard for all .java files in a
    subdirectory.

    The new part is the module-path. This option indicates the location of any
    custom module files. In this example, module-path could have been
    omitted since there are no dependencies. You can think of module-path as
    replacing the classpath option when you are working on a modular
    program.

    When you’re entering commands at the command line, they should
    be typed all on one line. We use line breaks in the book to make the
    commands easier to read and study. If you wanted to use multiple
    lines at the command prompt, the approach varies by operating
    system. Linux uses a backslash (\) as the line break.

    The syntax --module-path and -p are equivalent. That means we could have
    written many other commands in place of the previous command. The
    following four commands show the -p option:

    javac -p mods
    -d feeding
    feeding/zoo/animal/feeding/*.java
    feeding/*.java

    javac -p mods
    -d feeding
    feeding/zoo/animal/feeding/*.java
    feeding/module-info.java

    javac -p mods
    -d feeding
    feeding/zoo/animal/feeding/Task.java
    feeding/module-info.java

    javac -p mods
    -d feeding
    feeding/zoo/animal/feeding/Task.java
    feeding/*.java

    Options you need to know for using modules with javac
    Use for                     Abbreviation                Long form
    ===========================================================================
    Directory for class files   -d <dir>                    n/a
    Module path                 -p <path>                   --module-path <path>

    BUILDING MODULES
    ================
    Even before modules, it was rare to run javac and java commands
    manually on a real project. They get long and complicated very
    quickly. Most developers use a build tool such as Maven or Gradle.
    These build tools suggest directories to place the class files like
    target/classes.
    With modules, there is even more typing to run these commands by
    hand. After all, with modules, you are using more directories by
    definition. This means that it is likely the only time you need to
    know the syntax of these commands is when you take the exam. The
    concepts themselves are useful regardless.
    Do be sure to memorize the module command syntax. You will be
    tested on it on the exam. We will be sure to give you lots of practice
    questions on the syntax to reinforce it.
     */
}
