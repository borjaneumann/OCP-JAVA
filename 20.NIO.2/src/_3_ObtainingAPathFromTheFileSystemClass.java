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



}
