package _05_UnderstandingPackageDeclarationsAndImports;

public class _14_CompilingAndRunningCodeWithPackages {
    /*
    Setup procedure by operating system
    Step                    Windows                         Mac/Linux
    ================================================================================
    1. Create first class.  C:\temp\packagea\ClassA.java    /tmp/packagea/ClassA.java
    2. Create second class. C:\temp\packageb\ClassB.java    /tmp/packageb/ClassB.java
    3. Go to directory.     cd C:\temp                      cd /tmp

    We will follow the classes from creatingANewPackage

    javac packagea/ClassA.java packageb/ClassB.java -> all existing classes get compiled. The new class files
    will be saved in the directories where the java files are.
    javac packageb.ClassB.java -> Only the class with the main. We use a dot instead of the bar



     */

}
