package _05_UnderstandingPackageDeclarationsAndImports;

public class _10_Wildcards {

    /*
    Wildcards are a shortcut to import all the classes in a package.

    import java.util.*; // imports java.util.Random among other things

    public class ImportExample {
        public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
        }
    }

    The * is a wildcard that matches all classes in the package. Every
    class in the java.util package is available to this program when Java
    compiles it. It doesn’t import child packages, fields, or methods; it
    imports only classes.

    You might think that including so many classes slows down your program
    execution, but it doesn’t. The compiler figures out what’s actually needed.

     */
}
