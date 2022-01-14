import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _21_DeletingAFileWithDeleteAndDeleteIfExists {

    /*The Files class includes two methods that delete a file or empty directory within the file system.

    public static void delete(Path path) throws IOException
    public static boolean deleteIfExists(Path path) throws IOException


    To delete a directory, it must be empty. Both of these methods throw an
    exception if operated on a nonempty directory. In addition, if the path is a
    symbolic link, then the symbolic link will be deleted, not the path that the
    symbolic link points to.*/

    public void deleteAndDeleteIfExists() throws IOException {
        Files.delete(Paths.get("/vulture/feathers.txt"));
        Files.deleteIfExists(Paths.get("/pigeon"));
    }

    /*The first example deletes the feathers.txt file in the vulture directory,
    and it throws a NoSuchFileException if the file or directory does not
    exist. The second example deletes the pigeon directory, assuming it is
    empty. If the pigeon directory does not exist, then the second line will not
    throw an exception.
    */
}
