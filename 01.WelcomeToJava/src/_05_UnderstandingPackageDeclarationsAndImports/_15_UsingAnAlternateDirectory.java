package _05_UnderstandingPackageDeclarationsAndImports;

public class _15_UsingAnAlternateDirectory {
    /*
    By default, the javac command places the compiled classes in the same
    directory as the source code.

    It also provides an option to place the class files into a different directory.
    The -d option specifies this target directory.

    Java options are case sensitive. This means you cannot pass -D
    instead of -d (directory).

    javac -d classes packagea/ClassA.java packageb/ClassB.java

    This commands create a folder named class and creates inside the same structure with the two packages.

    javac packageB/ClassB.java -d ..\..\ -> This will not create a new folder named class
    name but a compiled packagea and packageb

    javac packageb\ClassB.java -d ..\..\classes ->This will create a new folder classes (if doesnt exist)
    with the two packages folder compiled

    java -cp ..\..\classes packageB.ClassB
    to avoid writing the path you can set it: set classpath= c:\..\classes;.

    C:\>javac -d . c:\Users\ABC\Desktop\javaConsoleCommands\packageB\ClassB.java c:\Users\
    AMS\Desktop\javaConsoleCommands\packageA\ClassA.java
    C:\>java packageB.ClassB
    Got it

    C:\>javac -d \Users\ABC\classes c:\Users\AMS\Desktop\javaConsoleCommands\packageB\
    ClassB.java c:\Users\ABC\Desktop\javaConsoleCommands\packageA\ClassA.java
    java -cp c:\Users\ABC\classes packageB.ClassB

    To run the program we have three options:
    java -cp classes packageb.ClassB --> java -cp classes packageB.ClassB
    java -classpath classes packageb.ClassB
    java --class-path classes packageb.ClassB

    Options you need to know for the exam: javac
    Option                                  Description
    ============================================================
    -cp <classpath>                         Location of classes needed to compile the program
    -classpath <classpath>
    --class-path <classpath>
    -------------------------------------------------------------
    -d <dir>                                Directory to place generated class files

    Options you need to know for the exam: java
    Option                                  Description
    =====================================================================================
    -cp <classpath>                         Location of classes needed to run the program
    -classpath <classpath>
    --class-path <classpath>
     */
}
