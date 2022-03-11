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

    javac packageB/ClassB.java -d ../../ -> This will not create a new folder named class
    name but a compiled packagea and packageb

    To run the program we have three options:
    java -cp classes packageb.ClassB --> java -cp classes packageB.ClassB
    java -classpath classes packageb.ClassB
    java --class-path classes packageb.ClassB

     */
}
