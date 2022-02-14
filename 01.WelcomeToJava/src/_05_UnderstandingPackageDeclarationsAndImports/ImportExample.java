package _05_UnderstandingPackageDeclarationsAndImports;

//import java.util.Random;
import java.util.*; //Wildcard
/*it imports only classes. (There is a special type of import called the static
import that imports other types, which you’ll learn more about in Chapter 7.)
*/

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10)); // it prints out a random number between 0 and 9
    }
}
/* java.lang
There’s one special package in the Java world
called java.lang. This package is special in that it is automatically
imported. You can type this package in an import statement, but you don’t
have to.
 */
