import java.io.FileOutputStream;
import java.io.InputStream;

public class _6_FlushingOutputStreams {
    public static void main(String[] args) {

        /* All output stream classes provide a flush() method, which requests
        that all accumulated data be written immediately to disk.

        OutputStream and Writer
        public void flush() throws IOException

        In the following sample, 1,000 characters are written to a file stream. The
        calls to flush() ensure that data is sent to the hard drive at least once
        every 100 characters. The JVM or operating system is free to send the data
        more frequently.

        try (var fos = new FileOutputStream(fileName)) {
            for(int i=0; i<1000; i++) {
                fos.write('a');
                if(i % 100 == 0) {
                    fos.flush();
                }
            }
        }
        The flush() method helps reduce the amount of data lost if the
        application terminates unexpectedly. It is not without cost, though. Each
        time it is used, it may cause a noticeable delay in the application,
        especially for large files. Unless the data that you are writing is extremely
        critical, the flush() method should be used only intermittently. For
        example, it should not necessarily be called after every write.
        You also do not need to call the flush() method when you have finished
        writing data, since the close() method will automatically do this.*/
    }
}
