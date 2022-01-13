import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _18_MakingDirectoriesWithCreateDirectoryAndCreateDirectories {

    /*
    To create a directory, we use these Files methods:

    public static Path createDirectory(Path dir, FileAttribute<?>… attrs) throws IOException
    public static Path createDirectories(Path dir, FileAttribute<?>… attrs) throws IOException

    The createDirectory() will create a directory and throw an exception if
    it already exists or the paths leading up to the directory do not exist.

    The createDirectories() works just like the java.io.File method
    mkdirs(), in that it creates the target directory along with any nonexistent
    parent directories leading up to the path. If all of the directories already
    exist, createDirectories() will simply complete without doing
    anything. This is useful in situations where you want to ensure a directory
    exists and create it if it does not.
    Both of these methods also accept an optional list of FileAttribute<?>
    values to apply to the newly created directory or directories. We will
    discuss file attributes more later in the chapter.
     */
    public static void main(String[] args) throws IOException {
        Files.createDirectory(Path.of("/bison/field"));//The first example creates a new directory, field, in the directory /bison, assuming /bison exists;
        // or else an exception is thrown.
        Files.createDirectories(Path.of("/bison/field/pasture/green")); //In windows creates it from C:\
        //It created too all the folders if they dont exist.

    }

}
