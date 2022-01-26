public class _04_SerializingAndDeserializingObjects {
    /*
    INTRO
    =====
    Imagine we are storing data in an Employee record. We want to write this
    data to a file and read this data back into memory, but we want to do so
    without writing any potentially sensitive data to disk. From Chapter 19,
    you should already know how to do this with serialization.

    Recall from Chapter 19 that Java skips calling the constructor when
    deserializing an object. This means it is important not to rely on the
    constructor for custom validation logic.

    Let's define our Employee class used throughout this section. Remember,
    it's important to mark it Serializable.

    import java.io.*;
    public class Employee implements Serializable {
        private String name;
        private int age;
        // Constructors/getters/setters
    }
     */
}
