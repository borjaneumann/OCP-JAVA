package _05_UnderstandingPackageDeclarationsAndImports;

public class _13_CreatingANewPackage {
    /*
    You can tell the code is in the default package, because there’s no package name.
    Now it’s time to create a new package. The directory structure on your
    computer is related to the package name.

    Suppose we have these two classes in the C:\temp directory:
    package packagea;
    public class ClassA {
    }

    package packageb;
    import packagea.ClassA;
    public class ClassB {
        public static void main(String[] args) {
        ClassA a;
        System.out.println("Got it");
        }
    }
    When you run a Java program, Java knows where to look for those
    package names. In this case, running from C:\temp works because both
    packagea and packageb are underneath it.
     */

}
