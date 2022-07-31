package _02_InteractingWithPaths;

import java.nio.file.Paths;

public class _05_CreatingANewPathWithSubpath {

    /*The Path interface includes a method to select portions of a path.
    public Path subpath(int beginIndex, int endIndex)*/

    public static void main(String[] args) {
        var p = Paths.get("/mammal/omnivore/raccoon.image"); //Path is: \mammal\omnivore\raccoon.image
        System.out.println("Path is: " + p);
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " + //Element 0 is: mammal //Element 1 is: omnivore //Element 2 is: raccoon.image
                    p.getName(i));
        }
        System.out.println();
        System.out.println("subpath(0,3): " + p.subpath(0, 3)); // subpath(0,3): mammal\omnivore\raccoon.image
        System.out.println("subpath(1,2): " + p.subpath(1, 2)); // subpath(1,2): omnivore
        System.out.println("subpath(1,3): " + p.subpath(1, 3)); // subpath(1,3): omnivore\raccoon.image

    }
    /*
    Like getNameCount() and getName(), subpath() is 0‐indexed and does
    not include the root. Also like getName(), subpath() throws an exception
    if invalid indices are provided.

    var q = p.subpath(0, 4); // IllegalArgumentException
    var x = p.subpath(1, 1); // IllegalArgumentException
     */

}
