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

}
