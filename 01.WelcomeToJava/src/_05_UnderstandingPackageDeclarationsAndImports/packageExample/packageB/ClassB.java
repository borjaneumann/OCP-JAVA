package _05_UnderstandingPackageDeclarationsAndImports.packageExample.packageB;

import _05_UnderstandingPackageDeclarationsAndImports.packageExample.packageA.ClassA;


import java.util.Date;

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
/*
Compiling With WildCards
=========================
You can use an asterisk to specify that you’d like to include all Java
files in a directory. This is convenient when you have a lot of files in
a package. We can rewrite the previous javac command like this:

packagea = 05_UnderstandingPackageDeclarationsAndImports.packageExample.packageA
packageb = 05_UnderstandingPackageDeclarationsAndImports.packageExample.packageB

javac packagea/*.java packageb/*.java

However, you cannot use a wildcard to include subdirectories. If you
were to write javac *.java, the code in the packages would not be
picked up.
 */
/*
USING AN ALTERNATE DIRECTORY
============================
By default, the javac command places the compiled classes in the same
directory as the source code. It also provides an option to place the class
files into a different directory. The -d option specifies this target directory.

Java options are case sensitive. This means you cannot pass -D
instead of -d.

javac -d classes packagea/ClassA.java packageb/ClassB.java

creates a folder called classes. Within this folder two other folders: packagea and packageb
with their respctive compiled classes.

how to run it
-------------
To run the program, you specify the classpath so Java knows where to find
the classes. There are three options you can use. All three of these do the
same thing:

java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB
java --class-path classes packageb.ClassB

Notice that the last one requires two dashes (--), while the first two
require one dash (-). If you have the wrong number of dashes, the program
will not run.
 */

/*
Compiling With JAR files
========================
 A Java archive (JAR) file is like a zip file of mainly Java class files.

On Windows, you type the following:

java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar"
myPackage.MyClass

The period (.) indicates you want to include the current directory in the
classpath.

Just like when you’re compiling, you can use a wildcard (*) to match all
the JARs in a directory. Here’s an example:
java -cp "C:\temp\directoryWithJars\*" myPackage.MyClass
This command will add all the JARs to the classpath that are in
directoryWithJars. It won’t include any JARs in the classpath that are in
a subdirectory of directoryWithJars.

Creating a Jar File
===================
jar -cvf myNewFile.jar .
jar --create --verbose --file myNewFile.jar .

Alternatively, you can specify a directory instead of using the current
directory.
jar -cvf myNewFile.jar -C dir .
There is no long form of the -C option. Table 1.5 lists the options you need
to use the jar command to create a jar file. In Chapter 11, you will learn
another option specific to modules.

jar -cvf MyJar.jar manifest.txt
added manifest
adding: manifest.txt(in = 76) (out= 74)(deflated 2%)

The manifest must be outside the classes folder

jar -cvf MyJar.jar Manifest.txt jarTest\
added manifest
adding: Manifest.txt(in = 76) (out= 74)(deflated 2%)
adding: jarTest/(in = 0) (out= 0)(stored 0%)
adding: jarTest/Manifest.txt(in = 76) (out= 74)(deflated 2%)
adding: jarTest/MyJar.jar(in = 530) (out= 279)(deflated 47%)
adding: jarTest/SingleFileZoo.java(in = 187) (out= 152)(deflated 18%)
adding: jarTest/Zoo.java(in = 121) (out= 100)(deflated 17%)
adding: jarTest/Zoo2.java(in = 157) (out= 99)(deflated 36%)

Entry Point and Classpath
===========================
If our JAR contains a runnable application then we can specify the entry point. Similarly, we can provide the classpath.
By doing so, we avoid having to specify it when we want to run it.

Main-Class: the package and name of the class with a main method (no .class extension)
Class-Path: a space separated list of relative paths to libraries or resources
For example, if our application entry point is in Application.class and it uses libraries and resources then we can add the needed headers:

Main-Class: com.baeldung.Application
Class-Path: core.jar lib/ properties/

Options you need to know for the exam: jar
Option                  Description
 ================================================================
-c                      Creates a new JAR file
--create
------------------------------------------------------------------
-v                      Prints details when working with JAR files
--verbose
------------------------------------------------------------------
-f <fileName>           JAR filename
--file <fileName>
------------------------------------------------------------------
-C <directory>          Directory containing files to be used to create the JAR


Running a Program in One line With Packages
===========================================
You can use single-file source-code programs from within a package as
long as they rely only on classes supplied by the JDK. This code meets the
criteria.

package singleFile;
import java.util.*;

public class Learning {
    private ArrayList list;
    public static void main(String[] args) {
        System.out.println("This works!");
    }
}

You can run either of these commands:

java Learning.java // from within the singleFile directory
java singleFile/Learning.java // from the directory above singleFile




 */