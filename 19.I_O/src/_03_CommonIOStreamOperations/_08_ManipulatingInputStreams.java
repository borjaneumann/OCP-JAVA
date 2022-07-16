package _03_CommonIOStreamOperations;

import java.io.IOException;
import java.io.InputStream;

public class _08_ManipulatingInputStreams {
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

