import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

public class _2_IntroducingIOStreams {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Byte Streams vs. Character Streams
    /*Byte streams read/write binary data ( 0s and 1s) and have class names that
    end in InputStream or OutputStream.
    Character streams read/write text data and have class names that end in
    Reader or Writer.*/

    /*
    Wrapping is the process by which an instance is passed to the
    constructor of another class, and operations on the resulting instance are
    filtered and applied to the original instance.

    A low‐level stream connects directly with the source of the data, such as a
    file, an array, or a String. Low‐level streams process the raw data or
    resource and are accessed in a direct and unfiltered manner. For example,
    a FileInputStream is a class that reads file data one byte at a time.

    Alternatively, a high‐level stream is built on top of another stream using
    wrapping. Wrapping is the process by which an instance is passed to the
    constructor of another class, and operations on the resulting instance are
    filtered and applied to the original instance.
     */
         try (var br = new BufferedReader(new FileReader("zoo-data.txt"))) {
             System.out.println(br.readLine());
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
        //FileReader is the low‐level stream reader, whereas
        //BufferedReader is the high‐level stream that takes a FileReader as input.

        //High‐level streams can take other high‐level streams as input.
        try (var ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("zoo-data.txt")))) {
            System.out.print(ois.readObject());
        }


    }


}
