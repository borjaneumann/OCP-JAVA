package _04_WorkingWithIOStreamClasses;

import java.io.*;

public class _12_BufferingCharacterData {

    /*
    Like we saw with byte streams, Java includes high‐level buffered
    character streams that improve performance. The constructors take
    existing Reader and Writer instances as input.

    public BufferedReader(Reader in)
    public BufferedWriter(Writer out)

    They add two new methods, readLine() and newLine(), that are
    particularly useful when working with String values.

    // BufferedReader
    public String readLine() throws IOException
    // BufferedWriter
    public void newLine() throws IOException
     */

    //Putting it all together, the following shows how to copy a file, one line at a time:
    void copyTextFileWithBuffer(File src, File dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src));
             var writer = new BufferedWriter(new FileWriter(dest)))
        {
            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(s);
                writer.newLine();
            }
        }
    }

    /*
    We are checking for the end of the stream with a null value instead
    of ‐1. Finally, we are inserting a newLine() on every iteration of the loop.
    This is because readLine() strips out the line break character. Without the
    call to newLine(), the copied file would have all of its line breaks
    removed.
     */

}
