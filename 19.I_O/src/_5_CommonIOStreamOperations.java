import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class _5_CommonIOStreamOperations {
    public static void main(String[] args) {

        //READING AND WRITING DATA

        // InputStream and Reader
        //public int read() throws IOException

        // OutputStream and Writer
        //public void write(int b) throws IOException
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
    public int read(char[] c) throws IOException
    public int read(char[] c, int offset, int length) throws IOException
    // Writer
    public void write(char[] c) throws IOException
    public void write(char[] c, int offset, int length) throws IOException


}
