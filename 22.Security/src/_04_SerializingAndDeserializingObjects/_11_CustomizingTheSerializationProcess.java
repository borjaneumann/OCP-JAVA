package _04_SerializingAndDeserializingObjects;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;

public class _11_CustomizingTheSerializationProcess {
    /*
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
        private static final ObjectStreamField[] serialPersistentFields =
                {new ObjectStreamField("name", String.class),
                        new ObjectStreamField("ssn", String.class)};
        private String name;
        private String ssn;

        //constructors/getters/setter
        private int age;

        private static String encrypt(String input) {
            //implementation omitted
            return "";
        }

        private static String decrypt(String input) {
            //implementation omitted
            return "";
        }

        private void writeObject(ObjectOutputStream s) throws Exception {
            ObjectOutputStream.PutField fields = s.putFields();
            fields.put("name", name);
            fields.put("ssn", encrypt(ssn));
            s.writeFields();
        }

        private void readObject(ObjectInputStream s) throws Exception {
            ObjectInputStream.GetField fields = s.readFields();
            this.name = (String) fields.get("name", null);
            this.ssn = decrypt((String) fields.get("ssn", null));
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
