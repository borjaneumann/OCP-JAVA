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
Naming Conflicts
================
One of the reasons for using packages is so that class names don’t have to
be unique across all of Java. This means you’ll sometimes want to import
a class that can be found in multiple places. A common example of this is
the Date class. Java provides implementations of java.util.Date and
java.sql.Date.

What import could we use if we want the java.util.Date version?

public class Conflicts {
Date date;
// some more code
}

The answer should be easy by now. You can write either import
java.util.*; or import java.util.Date;. The tricky cases come about
when other imports are present.

import java.util.*;
import java.sql.*; // causes Date declaration to not compile

When the class is found in multiple packages, Java gives you a compiler error.
error: reference to Date is ambiguous
Date date;
^

But what do we do if we need a whole pile of other
classes in the java.sql package?
import java.util.Date;
import java.sql.*;

One more example. What does Java do with “ties” for precedence?

import java.util.Date;
import java.sql.Date;

Java is smart enough to detect that this code is no good. As a programmer,
you’ve claimed to explicitly want the default to be both the
java.util.Date and java.sql.Date implementations. Because there
can’t be two defaults, the compiler tells you the following:

error: reference to Date is ambiguous
Date date;
^
both class java.util.Date in java.util and class
java.sql.Date in java.sql match

If You really need to use two classes with the same name
========================================================
Sometimes you really do want to use Date from two different
packages. When this happens, you can pick one to use in the import
and use the other’s fully qualified class name [the package name, a
period (.), and the class name] to specify that it’s special. Here’s an
example:
import java.util.Date;
*/
class Conflicts {
    Date date;
    java.sql.Date sqlDate;
}
/*
Or you could have neither with an import and always use the fully qualified class name.*/
class Conflicts1 {
    java.util.Date date;
    java.sql.Date sqlDate;
}
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

 */