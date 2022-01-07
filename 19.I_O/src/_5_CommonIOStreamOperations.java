import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class _5_CommonIOStreamOperations {
    public _5_CommonIOStreamOperations() throws FileNotFoundException {
    }

    public static void main(String[] args) {

    /*READING AND WRITING DATA
    ================================================
    InputStream and Reader
    public int read() throws IOException
    OutputStream and Writer
    public void write(int b) throws IOException*/

    }
    /*The following copyStream() methods show an example of reading all of
        the values of an InputStream and Reader and writing them to an
        OutputStream and Writer, respectively. In both examples, ‐1 is used to
        indicate the end of the stream.*/

    void copyStream(InputStream in, OutputStream out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }
    void copyStream(Reader in, Writer out) throws IOException {
        int b;
        while ((b = in.read()) != -1) {
            out.write(b);
        }
    }

    //Most I/O stream methods declare a checked IOException.
    //The byte stream classes also include overloaded methods for reading and
    //writing multiple bytes at a time.

    // InputStream
    //public int read(byte[] b) throws IOException
    //public int read(byte[] b, int offset, int length) throws IOException
    // OutputStream
    //public void write(byte[] b) throws IOException
    //public void write(byte[] b, int offset, int length) throws IOException

    //The offset and length are applied to the array itself. For example, an
    //offset of 5 and length of 3 indicates that the stream should read up to 3
    //bytes of data and put them into the array starting with position 5.

    //equivalent methods for the character stream classes that use
    //char instead of byte.

    // Reader
    //public int read(char[] c) throws IOException
    //public int read(char[] c, int offset, int length) throws IOException
    // Writer
    //public void write(char[] c) throws IOException
    //public void write(char[] c, int offset, int length) throws IOException



    /*CLOSING THE STREAM
    ========================
    All I/O stream classes
    public void close() throws IOException;
    Since streams are considered resources, it is imperative that all I/O streams
    be closed after they are used lest they lead to resource leaks.*/

    /*Since all I/O streams implement Closeable, the best way to do this is with a
    try‐with‐resources statemen*/
//    try (var fis = new FileInputStream("zoo-data.txt")) {
//        System.out.print(fis.read());
//    }
    public void printData(InputStream is) throws IOException {
        int b;
        while ((b = is.read()) != -1) {
            System.out.print(b);
        }
    }
    public void readFile(String fileName) throws IOException {
        try (var fis = new FileInputStream(fileName)) {
            printData(fis);
        }
    }
    // In this example, the stream is created and closed in the readFile() method,
    // with the printData() processing the contents.

    /*closing wrapped streams

    The following example is valid and will result in three
    separate close() method calls but is unnecessary:*/

//    try (var fis = new FileOutputStream("zoo-banner.txt"); // Unnecessary
//    var bis = new BufferedOutputStream(fis);
//    var ois = new ObjectOutputStream(bis) {
//        ois.writeObject("Hello");
//    };
//    //The following will call only one close() method instead of three:
//    try (var ois = new ObjectOutputStream(
//            new BufferedOutputStream(
//                    new FileOutputStream("zoo-banner.txt"))) {
//        ois.writeObject("Hello");
//    };


    /*MANIPULATING INPUT STREAMS
    ============================
    InputStream and Reader
    public boolean markSupported()
    public void void mark(int readLimit)
    public void reset() throws IOException
    public long skip(long n) throws IOException

    The mark() and reset() methods return a stream to an earlier position.
    Before calling either of these methods, you should call the
    markSupported() method, which returns true only if mark() is supported.
    The skip() method is pretty simple; it basically reads data from the
    stream and discards the contents.
    */

    //mark() and reset()
    public void readData(InputStream is) throws IOException {
        System.out.print((char) is.read()); // L
        if (is.markSupported()) {
            is.mark(100); //marks up to 100 bytes
            System.out.print((char) is.read()); // I
            System.out.print((char) is.read()); // O
            is.reset(); //Resets stream to position before I
        }
        System.out.print((char) is.read()); // I
        System.out.print((char) is.read()); // O
        System.out.print((char) is.read()); // N
    }
    /*The code snippet will output LIOION if mark() is supported, and LION
    otherwise. It's a good practice to organize your read() operations so that
    the stream ends up at the same position regardless of whether mark() is
    supported.*/

    //skip()
    public void skipData(InputStream is) throws IOException {
        System.out.print ((char)is.read()); // T
        is.skip(2); // Skips I and G --> The return value tells ou where you are in the stream. The closer to 0, the closer you are to the end of the stream.
        is.read(); // Reads E but doesn't output it
        System.out.print((char)is.read()); // R
        System.out.print((char)is.read()); // S
    /*This code prints TRS at runtime. We skipped two characters, I and G. We
    also read E but didn't store it anywhere, so it behaved like calling skip(1).*/
    }


}
