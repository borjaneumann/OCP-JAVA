import java.nio.file.Files;
import java.nio.file.Paths;

public class _25_ManagingFileAttributes {

    /*A file attribute is data about a file within the system, such as its size and visibility,
    that is not part of the file contents. In this section, we'll show how to read file attributes
    individually or as a single streamlined call.

    DISCOVERING FILE ATTRIBUTES
    We begin our discussion by presenting the basic methods for reading file
    attributes. These methods are usable within any file system although they
    may have limited meaning in some file systems.

    // Reading Common Attributes with isDirectory(), isSymbolicLink(), and isRegularFile()

    The Files class includes three methods for determining type of a Path.

    public static boolean isDirectory(Path path, LinkOption… options)
    public static boolean isSymbolicLink(Path path)
    public static boolean isRegularFile(Path path, LinkOption… options)

    The isDirectory() and isSymbolicLink() methods should be self‐explanatory,
    although isRegularFile() warrants some discussion.
    Java defines a regular file as one that can contain content, as opposed to a
    symbolic link, directory, resource, or other nonregular file that may be
    present in some operating systems. If the symbolic link points to an actual
    file, Java will perform the check on the target of the symbolic link. In
    other words, it is possible for isRegularFile() to return true for a
    symbolic link, as long as the link resolves to a regular file.
    Let's take a look at some sample code.
    */
    public void determiningTypeOfPath() {
        System.out.print(Files.isDirectory(Paths.get("/canine/fur.jpg"))); // Prints true if fur.jpg is a directory or a symbolic link
        // to a directory and false otherwise.
        System.out.print(Files.isSymbolicLink(Paths.get("/canine/coyote"))); // Prints true if
        // /canine/coyote is a symbolic link, regardless of whether the file or directory it points to exists.
        System.out.print(Files.isRegularFile(Paths.get("/canine/types.txt"))); // The third example prints true if types.txt
        // points to a regular file or alternatively a symbolic link that points to a regular file.

    }
    //While most methods in the Files class declare IOException, these
    //three methods do not. They return false if the path does not exist.
}
