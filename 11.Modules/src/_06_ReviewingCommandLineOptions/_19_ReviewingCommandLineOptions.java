package _06_ReviewingCommandLineOptions;

public class _19_ReviewingCommandLineOptions {
    /*
    Comparing command-line operations
    Description                     Syntax
    ========================================================================================
    Compile nonmodular code         javac -cp classpath -d directory classesToCompile
                                    javac --class-path classpath -d directory classesToCompile
                                    javac -classpath classpath -d directory classesToCompile
    -----------------------------------------------------------------------------------------
    Run nonmodular code             java -cp classpath package.className
                                    java -classpath classpath package.className
                                    java --class-path classpath package.className
    -----------------------------------------------------------------------------------------
    Compile a module                javac -p moduleFolderName -d directory
                                    classesToCompileIncludingModuleInfo
                                    javac --module-path moduleFolderName -d
                                    directory classesToCompileIncludingModuleInfo
    -----------------------------------------------------------------------------------------
    Run a module                    java -p moduleFolderName -m
                                    moduleName/package.className
                                    java --module-path moduleFolderName --module
                                    moduleName/package.className
    -----------------------------------------------------------------------------------------
    Describe a module               java -p moduleFolderName -d moduleName
                                    java --module-path moduleFolderName --
                                    describe-module moduleName
                                    jar --file jarName --describe-module
                                    jar -f jarName -d
    -----------------------------------------------------------------------------------------
    List available modules          java --module-path moduleFolderName --listmodules
                                    java -p moduleFolderName --list-modules
                                    java --list-modules
    -----------------------------------------------------------------------------------------
    View dependencies               jdeps -summary --module-path moduleFolderName jarName
                                    jdeps -s --module-path moduleFolderName jarName
    -----------------------------------------------------------------------------------------
    Show module resolution          java --show-module-resolution -p moduleFolderName -m moduleName
                                    java --show-module-resolution --module-path
                                    moduleFolderName --module moduleName


    Options you need to know for the exam: javac
    Option                      Description
    ======================================================================
    -cp <classpath>             Location of JARs in a nonmodular program
    -classpath <classpath>
    --class-path <classpath>
    ---------------------------------------------------------------------
    -d <dir>                    Directory to place generated class files
    ---------------------------------------------------------------------
    -p <path>                   Location of JARs in a modular program
    --module-path <path>

    Options you need to know for the exam: java
    Option                      Description
    ====================================================================
    -p <path>                   Location of JARs in a modular program
    --module-path <path>
    ---------------------------------------------------------------------
    -m <name>                   Module name to run
    --module <name>
    --------------------------------------------------------------------
    -d                          Describes the details of a module
    --describe-module
    --------------------------------------------------------------------
    --list-modules              Lists observable modules without running a program
    --------------------------------------------------------------------
    --show-module-resolution    Shows modules when running program

    Options you need to know for the exam: jar
    Option                      Description
    ====================================================================
    -c                          Create a new JAR file
    --create
    --------------------------------------------------------------------
    -v                          Prints details when working with JAR files
    --verbose
    --------------------------------------------------------------------
    -f                          JAR filename
    --file
    --------------------------------------------------------------------
    -C                          Directory containing files to be used to create the JAR
    --------------------------------------------------------------------
    -d                          Describes the details of a module
    --describe-module

    TABLE 11.9 Options you need to know for the exam: jdeps
    Option                      Description
    ====================================================================
    --module-path <path>        Location of JARs in a modular program
    --------------------------------------------------------------------
    -s                          Summarizes output
    -summary



     */
}
