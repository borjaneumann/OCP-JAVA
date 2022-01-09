import java.io.Serializable;

public class _12_EnsuringAClassIsSerializable {

    /*
    Any process attempting to serialize an object
    will throw a NotSerializableException if the class does not implement
    the Serializable interface properly.

    How to Make a Class Serializable
    - The class must be marked Serializable.
    - Every instance member of the class is serializable, marked transient, or
    has a null value at the time of serialization.
    Be careful with the second rule. For a class to be serializable, we must
    apply the second rule recursively. Do you see why the following Cat class
    is not serializable?

     */
    public class Cat implements Serializable {
        private Tail tail = new Tail();
    }
    public class Tail implements Serializable {
        private Fur fur = new Fur();
    }
    public class Fur {} //Fur is not marked serializable

    /*
    Either of the following changes fixes the problem and allows Cat to be serialized:

    public class Tail implements Serializable {
    private transient Fur fur = new Fur();
    }
    public class Fur implements Serializable {}

    We could also make our tail or fur instance members null, although this
    would make Cat serializable only for particular instances, rather than all
    instances.
     */
}