import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class _3_ObtainingAPathFromTheFileSystemClass {

    /*The Paths class creates instances of the Path interface.
    Likewise, the FileSystems class creates instances of the abstract
    FileSystem class.

    FileSystems factory method
    public static FileSystem getDefault()

    FileSystem instance method
    public Path getPath(String first, String… more)
    */
    Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
    Path path2 = FileSystems.getDefault().getPath("c:\\zooinfo\\November\\employees.txt");
    Path path3 = FileSystems.getDefault().getPath("/home/zoodirectory");

    /*
    CONNECTING TO REMOTE FILE SYSTEMS
    While most of the time we want access to a Path object that is
    within the local file system, the FileSystems class does give us the
    freedom to connect to a remote file system, as follows:

    // FileSystems factory method
    public static FileSystem getFileSystem(URI uri)

    The following shows how such a method can be used:

    FileSystem fileSystem = FileSystems.getFileSystem(
    new URI("http://www.selikoff.net"));
    Path path = fileSystem.getPath("duck.txt");

    This code is useful when we need to construct Path objects
    frequently for a remote file system. NIO.2 gives us the power to
    connect to both local and remote file systems, which is a major
    improvement over the legacy java.io.File class.
     */

    /* Last but not least, we can obtain Path instances using the legacy
    java.io.File class. In fact, we can also obtain a java.io.File object from a Path instance.

    // Path to File, using Path instance method
    public default File toFile()

    // File to Path, using java.io.File instance method
    public Path toPath()

    These methods are available for convenience and also to help facilitate
    integration between older and newer APIs. The following shows examples of each:*/
    File file = new File("husky.png");
    Path path = file.toPath();
    File backToFile = path.toFile();

    /*When working with newer applications, though, you should rely on
    NIO.2's Path interface as it contains a lot more features.*/

}
