import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _26_CheckingFileAccesibilityWithIsHiddenIsReadableIsWritableAndIsExecutable {
    /*In many file systems, it is possible to set a boolean attribute to a file that
    marks it hidden, readable, or executable. The Files class includes
    methods that expose this information.

    public static boolean isHidden(Path path) throws IOException
    public static boolean isReadable(Path path)
    public static boolean isWritable(Path path)
    public static boolean isExecutable(Path path)
    */

    public static void main(String[] args) throws IOException {
        System.out.print(Files.isHidden(Paths.get("/walrus.txt"))); // If the walrus.txt exists and is hidden within the
        // file system, then the first example prints true.
        System.out.print(Files.isReadable(Paths.get("/seal/baby.png"))); //The second example prints true if the baby.png file
        // exists and its contents are readable.
        System.out.print(Files.isWritable(Paths.get("dolphin.txt"))); // The third example prints true if the
        // dolphin.txt file is able to be modified.
        System.out.print(Files.isExecutable(Paths.get("whale.png"))); // Finally, the last example prints true if the file is
        // able to be executed within the operating system.
    }
    /*
    Note that the file extension does not necessarily determine whether a file is
    executable. For example, an image file that ends in .png could be marked
    executable in some file systems.
    With the exception of isHidden(), these methods do not declare any
    checked exceptions and return false if the file does not exist.
     */




}
