package _04_SerializingAndDeserializingObjects;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class _12_PrePostSerializationProcessing {
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

    /*
    Applying writeReplace()
    =======================
    Now, what if we want to write an Employee record to disk but we don't
    completely trust the instance we are holding? For example, we want to
    always write the version of the object in the pool rather than the this
    instance. By construction, there should be only one version of this object
    in memory, but for this example let's pretend we're not 100 percent
    confident of that.
    The writeReplace() method is run before writeObject() and allows us to replace the object that gets serialized.

    public class Employee implements Serializable {
    …
        public Object writeReplace() throws ObjectStreamException {
            var e = pool.get(name);
            return e != null ? e : this;
        }
    }
    This implementation checks whether the object is found in the pool. If it is
    found in the pool, that version is sent for serialization; otherwise, the
    current instance is used. We could also update this example to add it to the
    pool if it is somehow missing.

    If these last few examples seemed a bit contrived, it's because they
    are. While the exam is likely to test you on these methods,
    implementing these advanced serialization methods in detail is way
    beyond the scope of the exam. Besides, transient will probably
    meet your needs for customizing what gets serialized.
     */
}
