package _03_OperatingOnFilesAndDirectories;

import java.nio.file.Files;
import java.nio.file.Paths;

public class _16_CheckingForExistenceWithExists {

    /*It just checks whether the file exists.

    public static boolean exists(Path path, LinkOption… options)

    Let's take a look at some sample code that operates on a features.png file
    in the /ostrich directory.*/
    public static void main(String[] args) {
        var b1 = Files.exists(Paths.get("/ostrich/feathers.png")); // checking a file
        System.out.println("Path " + (b1 ? "Exists" : "Missing")); // Path Missing
        var b2 = Files.exists(Paths.get("/ostrich")); // checking a directory
        System.out.println("Path " + (b2 ? "Exists" : "Missing")); // Path Missing
    }

    //This method does not throw an exception if the file does not exist, as doing so would prevent this method
    //from ever returning false at runtime.

    /*
    Remember, a file and directory may both have extensions. In the last
    example, the two paths could refer to two files or two directories.
    Unless the exam tells you whether the path refers to a file or
    directory, do not assume either.

     */




}
