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

/*
Redundant imports
=================

Files and Paths are both in the package java.nio.file.

What imports do you think would work to get this code to compile?

    public class InputImports {
        public void read(Files files) {
        Paths.get("name");
        }
    }
There are two possible answers.
The shorter one is to use a wildcard to import both at the same time.

import java.nio.file.*;

The other answer is to import both classes explicitly.

import java.nio.file.Files;
import java.nio.file.Paths;

Now let’s consider some imports that don’t work.

import java.nio.*;      // NO GOOD - a wildcard only matches
                        // class names, not "file.Files"
import java.nio.*.*;    // NO GOOD - you can only have one wildcard
                        // and it must be at the end
import java.nio.file.Paths.*; // NO GOOD - you cannot import methods
                        // only class names

 */
