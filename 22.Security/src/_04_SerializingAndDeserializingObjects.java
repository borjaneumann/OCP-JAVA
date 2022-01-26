import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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

    /*
    PRE/POST‐SERIALIZATION PROCESSING
    =================================
    Suppose our zoo employee application is having a problem with duplicate
    records being created for each employee. They decide that they want to
    maintain a list of all employees in memory and only create users as
    needed. Furthermore, each employee's name is guaranteed to be unique.
    Unlikely in practice we know, but this is a special zoo!
    From what you learned about concurrent collections in Chapter 18,
    “Concurrency,” and factory methods, we can accomplish this with a
    private constructor and factory method.
    */
    public static class Employee1 implements Serializable {
        private static Map<String, Employee1> pool = new ConcurrentHashMap<>();
        //…
        private String name;

        private Employee1() {
        }

        public synchronized static Employee1 getEmployee1(String name) {
            if (pool.get(name) == null) {
                var e = new Employee1();
                e.name = name;
                pool.put(name, e);
            }
            return pool.get(name);
        }
    }
    /*
    This method creates a new Employee if one does not exist. Otherwise, it
    returns the one stored in the memory pool.
     */

    /*
    Applying readResolve()
    ======================
    Now we want to start reading/writing the employee data to disk, but we
    have a problem. When someone reads the data from the disk, it
    deserializes it into a new object, not the one in memory pool.
    This could result in two users holding different versions of the Employee in memory!
    Enter the readResolve() method. When this method is present, it is run
    after the readObject() method and is capable of replacing the reference of the object returned by deserialization.
   */
    public static class Employee3 implements Serializable {
    //…
        private String name;
        private String ssn;
        public Employee3(){};
    private static Map<String, Employee3> pool = new ConcurrentHashMap<>();
        public synchronized Object readResolve() throws ObjectStreamException {
            var existingEmployee = pool.get(name);
            if (pool.get(name) == null) {
                // New employee not in memory
                pool.put(name, this);
                return this;
            } else {
                // Existing user already in memory
                existingEmployee.name = this.name;
                existingEmployee.ssn = this.ssn;
                return existingEmployee;
            }
        }
    }
    /*
    If the object is not in memory, it is added to the pool and returned.
    Otherwise, the version in memory is updated, and its reference is returned.

    Notice that we added the synchronized modifier to this method. Java
    allows any method modifiers (except static) for the readResolve()
    method including any access modifier. This rule applies to
    writeReplace(), which is up next.

     */


}
