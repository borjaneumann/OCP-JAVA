import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class _5_UnderstandingCommonNIO2Features {
    /*APPLYING PATH SYMBOLS
    Absolute and relative paths can contain path symbols. A path symbol is a
    reserved series of characters that have special meaning within some file
    systems.

    Symbol  Description
    =============================================================
    .       A reference to the current directory
    ..      A reference to the parent of the current directory

    fish                            ../..
      |_  shark                     ..
      |     |_ swim.txt             ../swim.txt
      |     |_hammerhead            .(current Directory)
      |          |_play.png         ./play.png
      |_clownfish                   ../../clownfish

     */

    /* Providing Optional arguments
    Enum type           Interface inherited       Enum value            Details
    ========================================================================================================
    LinkOption          CopyOption                NOFOLLOW_LINKS        Do not follow symbolic links.
                        OpenOption                NOFOLLOW_LINKS        Do not follow symbolic links.
    --------------------------------------------------------------------------------------------------------
    Standard            CopyOption                ATOMIC_MOVE           Move file as atomic file system operation.
    CopyOption                                    COPY_ATTRIBUTES       Copy existing attributes to new file.
                                                  REPLACE_EXISTING      Overwrite file if it already exists.
    -------------------------------------------------------------------------------------------------------
    Standard            OpenOption                APPEND                If file is already open for write, then append to the end.
    OpenOption                                    CREATE                Create a new file if it does not exist.
                                                  CREATE_NEW            Create a new file only if it does not exist, fail otherwise.
                                                  READ                  Open for read access.
                                                  TRUNCATE_EXISTING     If file is already open for write, then erase file and append to beginning.
                                                  WRITE                 Open for write access.
    --------------------------------------------------------------------------------------------------------
    FileVisitOption     N/A                       FOLLOW_LINKS          Follow symbolic links.
     */

    /*
    With the exceptions of Files.copy() and Files.move() (which we'll cover later), we won't discuss these varargs parameters each time we
    present a method.

    Path path = Paths.get("schedule.xml");
    boolean exists = Files.exists(path,
    LinkOption.NOFOLLOW_LINKS);

    The Files.exists() simply checks whether a file exists. If the parameter
    is a symbolic link, though, then the method checks whether the target of
    the symbolic link exists instead. Providing LinkOption.NOFOLLOW_LINKS
    means the default behavior will be overridden, and the method will check
    whether the symbolic link itself exists.

    The Files.move() method takes a CopyOption vararg so it can take enums of
    different types.
    */
    void copy(Path source, Path target) throws IOException {
        Files.move(source, target,
            LinkOption.NOFOLLOW_LINKS,
            StandardCopyOption.ATOMIC_MOVE);
    }

    /*Just like String values, Path instances are immutable. In the following
    example, the Path operation on the second line is lost since p is
    immutable:
    Path p = Path.of("whale");
    p.resolve("krill"); // p is immutable!!
    System.out.println(p); // whale
    */

    /*
    Many of the methods available in the Path interface transform the path
    value in some way and return a new Path object, allowing the methods to
    be chained. We demonstrate chaining in the following example, the details
    of which we'll discuss in this section of the chapter:

    Path.of("/zoo/../home").getParent().normalize().toAbsolutePath();

     */


}
