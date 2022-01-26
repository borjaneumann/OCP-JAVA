import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

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

    CUSTOMIZING THE SERIALIZATION PROCESS
    =====================================
    Security may demand custom serialization. Ee got a new
    requirement to add the Social Security number to our object.
    Unlike age, we do need to serialize this information. However, we don't want to
    store the Social Security number in plain text, so we need to write some
    custom code.

    Take a look at the following implementation that uses writeObject() and
    readObject() for serialization, which you learned about in Chapter 19.
    For brevity, we'll use ssn to stand for Social Security number.
    */
    public static class Employee implements Serializable {
        private String name;
        private String ssn;
        private int age;

        //constructors/getters/setter

        private static final ObjectStreamField[] serialPersistentFields =
                {new ObjectStreamField("name", String.class),
                new ObjectStreamField("ssn", String.class)};
        private static String encrypt (String input) {
            //implementation omitted
            return "";
        }
        private static String decrypt (String input) {
            //implementation omitted
            return "";
        }
        private void writeObject (ObjectOutputStream s) throws Exception {
            ObjectOutputStream.PutField fields = s.putFields();
            fields.put("name", name);
            fields.put("ssn", encrypt(ssn));
            s.writeFields();
        }
        private void readObject (ObjectInputStream s) throws Exception {
            ObjectInputStream.GetField fields = s.readFields();
            this.name = (String)fields.get("name", null);
            this.ssn = decrypt((String)fields.get("ssn", null));
        }
    }
    /*
    This version skips the age variable as before, although this time without
    using the transient modifier. It also uses custom read and write methods
    to securely encrypt/decrypt the Social Security number. Notice the
    PutField and GetField classes are used in order to write and read the
    fields easily.

    Suppose we were to update our writeObject() method with the age variable.

    fields.put("age", age);

    When using serialization, the code would result in an exception.
    java.lang.IllegalArgumentException: no such field age with type int
    This shows the serialPersistentFields variable is really being used.
    Java is preventing us from referencing fields that were not declared to be serializable.

    WORKING WITH PASSWORDS
    ======================
    In this example, we encrypted and then decrypted the Social
    Security number to show how to perform custom serialization for
    security reasons.
    Some fields are too sensitive even for that. In particular,
    you should never be able to decrypt a password.
    When a password is set for a user, it should be converted to a
    String value using a salt (initial random value) and one‐way
    hashing algorithm. Then, when a user logs in, convert the value they
    type in using the same algorithm and compare it with the stored
    value. This allows you to authenticate a user without having to
    expose their password.

    Databases of stored passwords can (and very often do) get stolen.
    Having them properly encrypted means the attacker can't do much
    with them, like decrypt them and use them to log in to the system.
    They also can't use them to log in to other systems in which the user
    used the same password more than once.
     */


}
