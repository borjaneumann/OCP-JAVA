package _05_UnderstandingPackageDeclarationsAndImports;

public class _17_CreatingAJARFile {
    /*
    Some JARs are created by others, such as those downloaded from the
    Internet or created by a teammate. Alternatively, you can create a JAR file
    yourself. To do so, you use the JAR COMMAND.
    The simplest commands create a jar containing the files in the current directory.
    You can use the short or long form for each option.

    jar -cvf myNewFile.jar . (important to add the. so the jar is created in the same directory,
    this command produces a manifest if not provided)
    jar --create --verbose --file myNewFile.jar .

    Alternatively, you can specify a directory instead of using the current
    directory. The Jar file will be saved wherever you execute the command.

    jar -cvf myNewFile.jar -C dir .

    There is no long form of the -C option. Table 1.5 lists the options you need
    to use the jar command to create a jar file. In Chapter 11, you will learn
    another option specific to modules.

    Options you need to know for the exam: jar
    Option              Description
    ---------------------------------------------------------------------------
    -c                  Creates a new JAR file
    --create
    ---------------------------------------------------------------------------
    -v                  Prints details when working with JAR files
    --verbose
    ---------------------------------------------------------------------------
    -f <fileName>       JAR filename
    --file <fileName>
    ----------------------------------------------------------------------------
    -C <directory>      Directory containing files to be used to create the JAR
    ----------------------------------------------------------------------------
     */
}
