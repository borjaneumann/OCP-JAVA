import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class _29_ImprovingAttributeAccess {

    /*
    Put simply, it is far more
    efficient to ask the file system for all of the attributes at once rather than
    performing multiple round‐trips to the file system.

    NIO.2 addresses both of these concerns by allowing you to construct
    views for various file systems with a single method call. A view is a group
    of related attributes for a particular file system type. That's not to say that
    the earlier attribute methods that we just finished discussing do not have
    their uses. If you need to read only one attribute of a file or directory, then
    requesting a view is unnecessary.

    UNDERSTANDING ATTRIBUTE AND VIEW TYPES
    ---------------------------------------
    NIO.2 includes two methods for working with attributes in a single
    method call: a read‐only attributes method and an updatable view method.
    For each method, you need to provide a file system type object, which
    tells the NIO.2 method which type of view you are requesting. By
    updatable view, we mean that we can both read and write attributes with
    the same object.

    The attributes and view types

    Attributes interface        View interface                  Description
    ================================================================================================
    BasicFileAttributes         BasicFileAttribute View         Basic set of attributes supported by all file systems
    DosFile Attributes          DosFileAttribute View           Basic set of attributes along with those supported by
                                                                DOS/Windows‐based systems
    PosixFileAttributes         PosixFileAttribute View         Basic set of attributes along with those supported by POSIX systems,
                                                                such as UNIX, Linux, Mac, etc.

    Retrieving Attributes with readAttributes()
    =============================================
    read‐only capacity:

    public static <A extends BasicFileAttributes> A readAttributes( Path path, Class<A> type, LinkOption… options) throws IOException

    Applying it requires specifying the Path and BasicFileAttributes.class parameters.

    */
    public void readAttributes() throws IOException {
        var path = Paths.get("/turtles/sea.txt");
        BasicFileAttributes data = Files.readAttributes(path, BasicFileAttributes.class);

        System.out.println("Is a directory? " + data.isDirectory());
        System.out.println("Is a regular file? " + data.isRegularFile());
        System.out.println("Is a symbolic link? " + data.isSymbolicLink());
        System.out.println("Size (in bytes): " + data.size());
        System.out.println("Last modified: " + data.lastModifiedTime());
    }
    /*
    The BasicFileAttributes class includes many values with the same
    name as the attribute methods in the Files class. The advantage of using
    this method, though, is that all of the attributes are retrieved at once.

     */

}
