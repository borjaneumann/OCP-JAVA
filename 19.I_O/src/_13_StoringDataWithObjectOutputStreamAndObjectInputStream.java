import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class _13_StoringDataWithObjectOutputStreamAndObjectInputStream {

    /*
    The ObjectInputStream class is used to deserialize an object from a
    stream, while the ObjectOutputStream is used to serialize an object to a
    stream. They are high‐level streams that operate on existing streams.
    public ObjectInputStream(InputStream in) throws IOException
    public ObjectOutputStream(OutputStream out) throws IOException.

    You need to know two methods:

    // ObjectInputStream
    public Object readObject() throws IOException, ClassNotFoundException

    // ObjectOutputStream
    public void writeObject(Object obj) throws IOException

    We now provide a sample method that serializes a List of Gorilla
    objects to a file.
    */
    void saveToFile(List<_11_SerializingData.Gorilla> gorillas, File dataFile) throws IOException {
        try (var out = new ObjectOutputStream(
            new BufferedOutputStream(new FileOutputStream(dataFile)))) {
            for (_11_SerializingData.Gorilla gorilla : gorillas)
                out.writeObject(gorilla);
        }
    }
}
