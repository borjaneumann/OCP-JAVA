package _03_CommonIOStreamOperations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _07_ClosingTheStream {
    /*CLOSING THE STREAM
    ========================
    All I/O stream classes
    public void close() throws IOException;
    Since streams are considered resources, it is imperative that all I/O streams
    be closed after they are used lest they lead to resource leaks.*/

    /*Since all I/O streams implement Closeable, the best way to do this is with a
    try‐with‐resources statemen*/
//    try (var fis = new FileInputStream("zoo-data.txt")) {
//        System.out.print(fis.read());
//    }
    public void printData(InputStream is) throws IOException {
        int b;
        while ((b = is.read()) != -1) {
            System.out.print(b);
        }
    }
    public void readFile(String fileName) throws IOException {
        try (var fis = new FileInputStream(fileName)) {
            printData(fis);
        }
    }
    // In this example, the stream is created and closed in the readFile() method,
    // with the printData() processing the contents.

    /*closing wrapped streams

    The following example is valid and will result in three
    separate close() method calls but is unnecessary:*/

//    try (var fis = new FileOutputStream("zoo-banner.txt"); // Unnecessary
//    var bis = new BufferedOutputStream(fis);
//    var ois = new ObjectOutputStream(bis) {
//        ois.writeObject("Hello");
//    };
//    //The following will call only one close() method instead of three:
//    try (var ois = new ObjectOutputStream(
//            new BufferedOutputStream(
//                    new FileOutputStream("zoo-banner.txt"))) {
//        ois.writeObject("Hello");
//    };
}
