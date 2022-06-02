package _03_OperatingOnFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _23_ReadingAFileWithReadAllLines {

    /*The Files class includes a convenient method for turning the lines of a file into a List.

    public static List<String> readAllLines(Path path) throws IOException
    The following sample code reads the lines of the file and outputs them to
    the user: */

    public void readAllLines() throws IOException {
        var path = Path.of("/animals/gopher.txt");
        final List<String> lines = Files.readAllLines(path);
        lines.forEach(System.out::println);
    }
    /*
    Be aware that the entire file is read when readAllLines() is called, with
    the resulting List<String> storing all of the contents of the file in
    memory at once. If the file is significantly large, then you may trigger an
    OutOfMemoryError trying to load all of it into memory. Later in the
    chapter, we will revisit this method and present a stream‐based NIO.2
    method that can operate with a much smaller memory footprint.
     */
}
