import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

    /*Notice we start with a file stream, wrap it in a buffered
    stream to improve performance, and then wrap that with an object stream.
    Serializing the data is as simple as passing it to writeObject().
    Once the data is stored in a file, we can deserialize it using the following
    method:
    */

    List<_11_SerializingData.Gorilla> readFromFile(File dataFile) throws IOException, ClassNotFoundException {
        var gorillas = new ArrayList<_11_SerializingData.Gorilla>();
        try (var in = new ObjectInputStream(
                new BufferedInputStream( new FileInputStream(dataFile)))) {
                    while (true) {
                        var object = in.readObject();
                        if (object instanceof _11_SerializingData.Gorilla)
                            gorillas.add((_11_SerializingData.Gorilla) object);
                    }
        } catch (EOFException e) {
            // File end reached
        }
        return gorillas;
    }

}
