import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _8_WorkingWithIOStreamClasses {

    /*
    Some of the techniques for accessing streams may seem a bit new to you, but as you
    will see, they are similar among different stream classes. The I/O stream classes
    include numerous overloaded constructors and methods. Hundreds in fact.

    READING AND WRITING BINARY DATA
    ===============================
    FileInputStream and FileOutputStream

    public FileInputStream(File file) throws FileNotFoundException
    public FileInputStream(String name) throws FileNotFoundException
    public FileOutputStream(File file) throws FileNotFoundException
    public FileOutputStream(String name) throws FileNotFoundException

     */

    void copyFile(File src, File dest) throws IOException {
        try (var in = new FileInputStream(src);
             var out = new FileOutputStream(dest)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
    //If the destination file already exists, this
    //implementation will overwrite it, since the append flag was not sent. The
    //copy() method copies one byte at a time until it reads a value of ‐1.

    /* BUFFERING BINARY DATA
    While our copyFile() method is valid, it tends to perform poorly on large files.
    We can easily enhance our implementation using BufferedInputStream and BufferedOutputStream.

    As high‐level streams, these classes include constructors that take other streams as input.
    public BufferedInputStream(InputStream in)
    public BufferedOutputStream(OutputStream out)

    why use the buffered classes?
    Put simply, the Buffered classes contain a number of performance improvements
    for managing data in memory. For example, the BufferedInputStream class is capable of
    retrieving and storing in memory more data than you might request
    with a single read(byte[]) call.
     */
    void copyFileWithBuffer(File src, File dest) throws IOException {
        try (var in = new BufferedInputStream( new FileInputStream(src));
             var out = new BufferedOutputStream( new FileOutputStream(dest))) {
            var buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer))> 0) {
                out.write(buffer, 0, lengthRead);
                out.flush();
            }
        }
    }
}
