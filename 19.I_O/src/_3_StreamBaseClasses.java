import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class _3_StreamBaseClasses {
    public static void main(String[] args) {

        /*
        The java.io library defines four abstract classes that are the parents of all
        stream classes defined within the API: InputStream, OutputStream,
        Reader, and Writer.
         */

//        new BufferedInputStream(new FileReader("z.txt")); // DOES NOT COMPILE
//        new BufferedWriter(new FileOutputStream("z.txt")); // DOES NOT COMPILE
//        new ObjectInputStream(new FileOutputStream("z.txt")); // DOES NOT COMPILE
//        new BufferedInputStream(new InputStream()); // DOES NOT COMPILE

        /*
        The first two examples do not compile because they mix Reader/ Writer
        classes with InputStream/ OutputStream classes, respectively. The third
        example does not compile because we are mixing an OutputStream with
        an InputStream. Although it is possible to read data from an InputStream
        and write it to an OutputStream, wrapping the stream is not the way to do
        so. As you will see later in this chapter, the data must be copied over,
        often iteratively. Finally, the last example does not compile because
        InputStream is an abstract class, and therefore you cannot create an
        instance of it.
         */


    }
}
