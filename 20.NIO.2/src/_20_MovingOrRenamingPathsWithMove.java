import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _20_MovingOrRenamingPathsWithMove {
    /*
    The Files class provides a useful method for moving or renaming files and directories.

    public static Path move(Path source, Path target, CopyOption… options) throws IOException

    The following is some sample code that uses the move() method:*/

    public void renameAndMove() throws IOException {
        Files.move(Path.of("c:\\zoo"), Path.of("c:\\zoo-new"));
        Files.move(Path.of("c:\\user\\addresses.txt"), Path.of("c:\\zoo-new\\addresses2.txt"));
    }
    /*
    The first example renames the zoo directory to a zoo‐new directory,
    keeping all of the original contents from the source directory. The second
    example moves the addresses.txt file from the directory user to the
    directory zoo‐new, and it renames it to addresses2.txt.
     */

    /*
    Similarities between move() and copy()
    Like copy(), move() requires REPLACE_EXISTING to overwrite the target if
    it exists, else it will throw an exception. Also like copy(), move() will not
    put a file in a directory if the source is a file and the target is a directory.
    Instead, it will create a new file with the name of the directory.
     */

    /*
    Performing an Atomic Move
    Another enum value that you need to know for the exam when working
    with the move() method is the StandardCopyOption value ATOMIC_MOVE.

    Files.move(Path.of("mouse.txt"), Path.of("gerbil.txt"), StandardCopyOption.ATOMIC_MOVE);

    An atomic move is one in which a file is moved within the file system as a single indivisible
    operation. Put another way, any process monitoring the file system never
    sees an incomplete or partially written file. If the file system does not
    support this feature, an AtomicMoveNotSupportedException will be thrown.

    Note that while ATOMIC_MOVE is available as a member of the StandardCopyOption type,
    it will likely throw an exception if passed to a copy() method.

     */

}
