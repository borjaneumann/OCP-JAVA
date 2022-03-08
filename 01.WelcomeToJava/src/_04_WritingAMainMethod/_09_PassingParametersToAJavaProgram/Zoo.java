package _04_WritingAMainMethod._09_PassingParametersToAJavaProgram;

public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
/*
javac Zoo.java
java Zoo peter johnny
peter
johnny

when needing to pass arguments with spaces
java Zoo peter "Mister Robinson"
peter
Mister Robinson

javac Zoo.java
java Zoo San Diego Zoo
The first one is San, and the second is Diego.
Since the program doesn’t read from args[2], the third element (Zoo) is
ignored.

All command-line arguments are treated as String objects, even if they
represent another data type like a number:
javac Zoo.java
java Zoo Zoo 2
Zoo
2

what happens if you don’t pass in enough arguments?

javac Zoo.java
java Zoo Zoo

Reading args[0] goes fine, and Zoo is printed out. Then Java panics.
There’s no second argument! What to do? Java prints out an exception
telling you it has no idea what to do with this argument at position 1.

Zoo
Exception in thread "main"
java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 at Zoo.main(Zoo.java:4)

 */
