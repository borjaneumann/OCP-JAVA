package _04_WritingAMainMethod;

public class _08_CreatingAMainMethod {

    //The simplest possible
    //class with a main() method looks like this:
    public static void main(String[] args) {
    }
    /*
     Any legal Java code will do.
    In fact, the only reason we even need a class structure to start a Java
    program is because the language requires it. To compile and execute this
    code, type it into a file called Zoo.java and execute the following:

    javac Zoo.java
    java Zoo

    To compile Java code, the file must have the extension .java. The name
    of the file must match the name of the class. The result is a file of
    bytecode by the same name, but with a .class filename extension.
    Remember that bytecode consists of instructions that the JVM knows how
    to execute. Notice that we must omit the .class extension to run
    Zoo.java.

    * Each file can contain only one public class.
    * The filename must match the class name, including case, and have a .java
    extension.

    Main method:
    public. Access modifier that declares this method’s level of exposure
    to potential callers in the program.

    static. Binds a method to its class so it can be called by just
    the class name, as in, for example, Zoo.main(). Java doesn’t need to
    create an object to call the main() method

    void. Represents the return type. A method that returns no
    data returns control to the caller silently.

     main() method’s parameter list, represented as an
    array of java.lang.String objects. In practice, you can write any of the
    following:

    String[] args
    String args[]
    String... args;

    args. Arguments

    The characters [] are brackets and represent an array. An array is a
    fixed-size list of items that are all of the same type. The characters ... are called
    varargs (variable argument lists).

    you can use any valid variable name you like. The following three are also allowed:

    String[] options
    String options []
    String... options;
     */
}
