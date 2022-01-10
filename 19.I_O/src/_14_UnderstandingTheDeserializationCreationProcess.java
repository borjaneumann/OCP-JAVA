import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

public class _14_UnderstandingTheDeserializationCreationProcess {

    /*For the exam, you need to understand how a deserialized object is created.
    When you deserialize an object, the constructor of the serialized class,
    along with any instance initializers, is not called when the object is
    created. Java will call the no‐arg constructor of the first nonserializable
    parent class it can find in the class hierarchy.*/

    public class Chimpanzee implements Serializable {
        private static final long serialVersionUID = 2L;
        private transient String name;
        private transient int age = 10;
//        private static char type = 'C';
        { this.age = 14; }
        public Chimpanzee() {
            this.name = "Unknown";
            this.age = 12;
//            this.type = 'Q';
        }
        public Chimpanzee(String name, int age, char type) {
            this.name = name;
            this.age = age;
//            this.type = type;
        }
        // Getters/Setters/toString() omitted
    }

    /*
    var chimpanzees = new ArrayList<Chimpanzee>();
    chimpanzees.add(new Chimpanzee("Ham", 2, 'A'));
    chimpanzees.add(new Chimpanzee("Enos", 4, 'B'));
    File dataFile = new File("chimpanzee.data");
    saveToFile(chimpanzees, dataFile);
    var chimpanzeesFromDisk = readFromFile(dataFile);
    System.out.println(chimpanzeesFromDisk);

    Ready for the answer? Well, for starters, none of the instance members
    would be serialized to a file. The name and age variables are both marked
    transient, while the type variable is static. We purposely accessed the
    type variable using this to see whether you were paying attention

    In this case, the name variable is initialized to null since that's the default
    value for String in Java. Likewise, the age variable is initialized to 0. The
    program prints the following, assuming the toString() method is
    implemented:
    [[name=null,age=0,type=B],
    [name=null,age=0,type=B]]

    For the exam, make sure you understand that the constructor and any
    instance initializations defined in the serialized class are ignored during
    the deserialization process. Java only calls the constructor of the first non‐
    serializable parent class in the class hierarchy.

     */



}
