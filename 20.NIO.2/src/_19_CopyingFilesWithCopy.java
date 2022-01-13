import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _19_CopyingFilesWithCopy {

    /*
    The NIO.2 Files class provides a method for copying files and directories
    within the file system.

    public static Path copy(Path source, Path target, CopyOption… options) throws IOException

    The method copies a file or directory from one location to another using
    Path objects. The following shows an example of copying a file and a directory:*/
    public static void main(String[] args) throws IOException {

        Files.copy(Paths.get("/panda/bamboo.txt"), Paths.get("/panda-save/bamboo.txt"));
        Files.copy(Paths.get("/turtle"), Paths.get("/turtleCopy")) ;
    }
    /*
    When directories are copied, the copy is shallow. A shallow copy means
    that the files and subdirectories within the directory are not copied.

    A deep copy means that the entire tree is copied, including all of its content and
    subdirectories.
     */




}
