package _03_OperatingOnFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

    /*
    When directories are copied, the copy is shallow. A shallow copy means
    that the files and subdirectories within the directory are not copied.

    A deep copy means that the entire tree is copied, including all of its content and
    subdirectories.
     */

    //COPYING AND REPLACING FILES
    /*
    By default, if the target already exists, the copy() method will throw an
    exception. You can change this behavior by providing the
    StandardCopyOption enum value REPLACE_EXISTING to the method. The
    following method call will overwrite the movie.txt file if it already exists:
    */

    Files.copy(Paths.get("book.txt"), Paths.get("movie.txt"),
    StandardCopyOption.REPLACE_EXISTING);

    //COPYING FILES WITH I/O STREAMS
    /*
    The Files class includes two copy() methods that operate with I/O
    streams.

    public static long copy(InputStream in, Path target, CopyOption… options) throws IOException
    public static long copy(Path source, OutputStream out) throws IOException

    The first method reads the contents of a stream and writes the output to a
    file. The second method reads the contents of a file and writes the output
    to a stream. They are quite convenient if you need to quickly read/write
    data from/to disk.
    The following are examples of each copy() method:

    try (var is = new FileInputStream("source-data.txt")) {
    // Write stream data to a file
    Files.copy(is, Paths.get("/mammals/wolf.txt"));
    }
    Files.copy(Paths.get("/fish/clown.xsl"), System.out);

    While we used FileInputStream in the first example, the streams could
    have been any valid I/O stream including website connections, in‐memory
    stream resources, and so forth. The second example prints the contents of
    a file directly to the System.out stream.

     */
     /*
     COPYING FILES INTO A DIRECTORY
     it is important that you understand how the copy() method
    operates on both files and directories. For example, let's say we have a file,
    food.txt, and a directory, /enclosure. Both the file and directory exist.
    What do you think is the result of executing the following process?

    var file = Paths.get("food.txt");
    var directory = Paths.get("/enclosure");
    Files.copy(file, directory);

    The command tries to create a new file, named /enclosure. Since the path /enclosure already exists, an
    exception is thrown at runtime. On the other hand, if the directory did not exist, then it would create a new
    file with the contents of food.txt, but it would be called /enclosure.
    Remember, we said files may not need to have extensions, and in this
    example, it matters.

    This behavior applies to both the copy() and the move() methods, the
    latter of which we will be covering next. In case you're curious, the correct
    way to copy the file into the directory would be to do the following:

    var file = Paths.get("food.txt");
    var directory = Paths.get("/enclosure/food.txt");
    Files.copy(file, directory);

    You also define directory using the resolve() method we saw earlier,
    which saves you from having to write the filename twice.

    var directory =
    Paths.get("/enclosure").resolve(file.getFileName());

      */


    }




}
