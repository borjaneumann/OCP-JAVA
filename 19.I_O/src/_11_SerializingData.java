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

}
