import java.io.Serializable;

public class _11_SerializingData {

    /*To serialize an object using the I/O API, the object must implement the
    java.io.Serializable interface.

    By marker interface, it means the interface does not have any methods.
    Any class can implement the Serializable interface
    since there are no required methods to implement.
    The purpose of using the Serializable interface is to inform any process
    attempting to serialize the object that you have taken the proper steps to
    make the object serializable. All Java primitives and many of the built‐in
    Java classes that you have worked with throughout this book are
    Serializable. For example, this class can be serialized:
    */

    public class Gorilla implements Serializable {
        private static final long serialVersionUID = 1L;
        private String name;
        private int age;
        private Boolean friendly;
        private transient String favoriteFood;
        // Constructors/Getters/Setters/toString() omitted
    }

    //Any field
    //that is marked transient will not be saved to a stream when the class is
    //serialized.

    /*
    MAINTAINING A SERIALVERSIONUID
    It's a good practice to declare a static serialVersionUID variable
    in every class that implements Serializable. The version is stored
    with each object as part of serialization. Then, every time the class
    structure changes, this value is updated or incremented.

    The serialVersionUID helps inform the JVM that the stored data
    may not match the new class definition. If an older version of the
    class is encountered during deserialization, a
    java.io.InvalidClassException may be thrown. Alternatively,
    some APIs support converting data between versions.
     */

}
