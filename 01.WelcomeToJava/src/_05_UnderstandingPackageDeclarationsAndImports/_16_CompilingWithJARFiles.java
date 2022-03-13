package _05_UnderstandingPackageDeclarationsAndImports;

public class _16_CompilingWithJARFiles {
    /*
    A Java archive (JAR) file is like a zip file of mainly Java class files.
    On Windows, you type the following:

    java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar"
    myPackage.MyClass

    The period (.) indicates you want to include the current directory in the
    classpath. The rest of the command says to look for loose class files (or
    packages) in some other Location and within myJar.jar. Windows uses
    semicolons (;) to separate parts of the classpath; other operating systems
    use colons.

    Just like when you’re compiling, you can use a wildcard (*) to match all
    the JARs in a directory. Here’s an example:

    java -cp "C:\temp\directoryWithJars\*" myPackage.MyClass

    This command will add all the JARs to the classpath that are in
    directoryWithJars. It won’t include any JARs in the classpath that are in
    a subdirectory of directoryWithJars.

     */
}
