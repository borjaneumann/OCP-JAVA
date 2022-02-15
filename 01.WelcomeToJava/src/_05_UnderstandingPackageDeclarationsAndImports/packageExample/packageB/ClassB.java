package _05_UnderstandingPackageDeclarationsAndImports.packageExample.packageB;

import _05_UnderstandingPackageDeclarationsAndImports.packageExample.packageA.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
    }
}
/*
Very important:
1) When compiling you need to be in the path above the packages are.
2) javac 05_UnderstandingPackageDeclarationsAndImports.packageExample.packageB\ClassB.java
I'm guessing that when entering the above command the path starts from C:\ to the package directory.
3)java 05_UnderstandingPackageDeclarationsAndImports.packageExample.packageB.ClassB
(Keep an eye on the dot between packageB and ClassB!!)
 */

/*
Compiling and Running Code with packages
========================================
We could have also complied tha classes one by one separated by a space, though when Java main is compiled,
it will also compiled the needed classes.

javac 05_UnderstandingPackageDeclarationsAndImports.packageExample.packageB\ClassB.java
05_UnderstandingPackageDeclarationsAndImports.packageExample.packageA\ClassA.java
 */
