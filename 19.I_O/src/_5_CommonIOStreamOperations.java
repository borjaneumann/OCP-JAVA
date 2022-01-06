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

}
