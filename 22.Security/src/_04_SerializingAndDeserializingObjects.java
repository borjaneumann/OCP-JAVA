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

    SPECIFYING WHICH FIELDS TO SERIALIZE
    ====================================
    Our zoo has decided that employee age information is sensitive and
    shouldn't be written to disk. You should already know how to do this.

    Marking a field as transient prevents it from being serialized.

    private transient int age;//blacklist

    Alternatively, you can specify fields to be serialized in an array.

    private static final ObjectStreamField[] serialPersistentFields = { new ObjectStreamField("name", String.class) };//whitelist

    You can think of serialPersistentFields as the opposite of transient.
    The former is a whitelist of fields that should be serialized, while the latter
    is a blacklist of fields that should not.
    If you go with the array approach, make sure you remember to use
    the private, static, and final modifiers. Otherwise, the field will be ignored.

     */
}
