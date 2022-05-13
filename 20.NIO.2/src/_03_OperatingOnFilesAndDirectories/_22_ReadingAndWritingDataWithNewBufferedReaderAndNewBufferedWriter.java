import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class _22_ReadingAndWritingDataWithNewBufferedReaderAndNewBufferedWriter {

    /*
    NIO.2 includes two convenient methods for working with I/O streams.

    public static BufferedReader newBufferedReader(Path path) throws IOException
    public static BufferedWriter newBufferedWriter(Path path, OpenOption… options) throws IOException

    You can wrap I/O stream constructors to produce the same effect, although it's a lot easier to use the factory method.

    The first method, newBufferedReader(), reads the file specified at the Path location using a BufferedReader object.
    */
    public void buffered(){
        var path = Path.of("/animals/gopher.txt");
        try (var reader = Files.newBufferedReader(path)) {
            String currentLine = null;
            while((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /*
    This example reads the lines of the files using a BufferedReader and
    outputs the contents to the screen. As you shall see shortly, there are other
    methods that do this without having to use an I/O stream.

    The second method, newBufferedWriter(), writes to a file specified at the Path location using a BufferedWriter.*/

    public void newbuffered() throws IOException {
    var list = new ArrayList<String>();
    list.add("Smokey");
    list.add("Yogi");
    var path = Path.of("/animals/bear.txt");
    try (var writer = Files.newBufferedWriter(path)) {
        for (var line : list) {
            writer.write(line);
            writer.newLine();
        }
    }
    /*
    This code snippet creates a new file with two lines of text in it. Did you
    notice that both of these methods use buffered streams rather than low‐
    level file streams? As we mentioned in Chapter 19, the buffered stream
    classes are much more performant, especially when working with files.
     */
}




}
