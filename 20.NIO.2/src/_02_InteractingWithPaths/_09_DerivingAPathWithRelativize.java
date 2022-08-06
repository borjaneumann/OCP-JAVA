package _02_InteractingWithPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _09_DerivingAPathWithRelativize {

    /*The Path interface includes a method for constructing the relative path
    from one Path to another, often using path symbols.

    public Path relativize()

   */
    public static void main(String[] args) {
        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2)); // ../friendly/birds.txt
        System.out.println(path2.relativize(path1)); // ../../fish.txt

    /*
    The idea is this: if you are pointed at a path in the file system, what steps
    would you need to take to reach the other path? For example, to get to
    fish.txt from friendly/birds.txt, you need to go up two levels (the
    file itself counts as one level) and then select fish.txt.
    If both path values are relative, then the relativize() method computes
    the paths as if they are in the same current working directory.

    Alternatively, if both path values are absolute, then the method computes
    the relative path from one absolute location to another, regardless of the
    current working directory. The following example demonstrates this
    property when run on a Windows computer: */

    Path path3 = Paths.get("E:\\habitat");
    Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
    System.out.println(path3.relativize(path4)); //..\sanctuary\raven\poe.txt
    System.out.println(path4.relativize(path3)); // ..\..\..\habitat

    //Remember, most methods defined in the Path interface do not require the path to exist
    /*The relativize() method requires that both paths are absolute or both
    relative and throws an exception if the types are mixed.*/
    Path path5 = Paths.get("/primate/chimpanzee");
    Path path6 = Paths.get("bananas.txt");
    path5.relativize(path6); // IllegalArgumentException

    /* On Windows‐based systems, it also requires that if absolute paths are
    used, then both paths must have the same root directory or drive letter.*/

    Path path7 = Paths.get("c:\\primate\\chimpanzee");
    Path path8 = Paths.get("d:\\storage\\bananas.txt");
    path7.relativize(path8); // IllegalArgumentException
    }





}
