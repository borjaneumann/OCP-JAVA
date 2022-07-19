package _04_WorkingWithIOStreamClasses;

import java.io.*;

public class _12_BufferingBinaryData {
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
    /*
    Instead of reading the data one byte at a time, we read and write up to
    1024 bytes at a time. The return value lengthRead is critical for
    determining whether we are at the end of the stream and knowing how
    many bytes we should write into our output stream. We also added a
    flush() command at the end of the loop to ensure data is written to disk
    between each iteration.
     */

    //CHOOSING A BUFFER SIZE
    /*Given the way computers organize data, it is often appropriate to
    choose a buffer size that is a power of 2, such as 1,024.
    What buffer size should you use? Any buffer size that is a power of
    2 from 1,024 to 65,536 is a good choice in practice.*/
}
