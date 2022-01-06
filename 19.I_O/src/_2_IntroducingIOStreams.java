import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _2_IntroducingIOStreams {

    public static void main(String[] args) {
        //Byte Streams vs. Character Streams
    /*Byte streams read/write binary data ( 0s and 1s) and have class names that
    end in InputStream or OutputStream.
    Character streams read/write text data and have class names that end in
    Reader or Writer.*/

    /*
    Wrapping is the process by which an instance is passed to the
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
    }

}
