package _04_WorkingWithIOStreamClasses;

import java.io.Serializable;

public class _15_SerializingData {

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

    Marking Data transient
    ======================
    Oftentimes, the transient modifier is used for sensitive data of the class,
    like a password.
    There are other objects it does not make sense to serialize, like
    the state of an in‐memory Thread. If the object is part of a serializable
    object, we just mark it transient to ignore these select instance members.

    What happens to data marked transient on deserialization? It reverts to
    its default Java values, such as 0.0 for double, or null for an object.

    Marking static fields transient has little effect on serialization.
    Other than the serialVersionUID, only the instance members of a
    class are serialized.

    Ensuring a Class Is Serializable
    ==================================
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


