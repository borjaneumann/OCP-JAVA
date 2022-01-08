import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _9_ReadingAndWritingCharacterData {

    /*
    The FileReader and FileWriter classes, along with their associated
    buffer classes, are among the most convenient I/O classes because of their
    built‐in support for text data. They include constructors that take the same
    input as the binary file classes.

    public FileReader(File file) throws FileNotFoundException
    public FileReader(String name) throws FileNotFoundException
    public FileWriter(File file) throws FileNotFoundException
    public FileWriter(String name) throws FileNotFoundException
     */
    void copyTextFile(File src, File dest) throws IOException {
        try (var reader = new FileReader(src);
             var writer = new FileWriter(dest)) {
            int b;
            while ((b = reader.read()) != -1) {
                writer.write(b);
            }
        }
    }

    /*
    Wait a second, this looks identical to our copyFile() method with byte
    stream! Since we're copying one character at a time, rather than one byte,
    it is.
     */

}
