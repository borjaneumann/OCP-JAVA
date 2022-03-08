package _04_WritingAMainMethod._10_RunningAProgramWithOneLine;

public class _10_RunningAProgramWithOneLine {
    /*you can run a program without compiling it first—
    well, without typing the javac command that is. it is compiled in memory
     */


    public static void main(String[] args) {
//        ehhh; //DOES NOT COMPILE
        System.out.println("This works");
    }
}
class Learning {
    public static void main(String[] args) {
//        UhOh; // DOES NOT COMPILE
        System.out.println("This works!");
    }
}

/*
Java is still a compiled language, which means the code is being compiled
in memory and the java command can give you a compiler error.
Learning.java:3: error: not a statement
UhOh; // DOES NOT COMPILE
^
1 error
error: compilation failed
 */

/*
Notice how we said “in memory.” Even if the code compiles properly, no .class file is created.
 */

/*
Full command                Single-file source-code command
===========================================================
javac HelloWorld.java       java HellowWorld.java
java HelloWorld
-----------------------------------------------------------
Produces a class file       Fully in memory
-----------------------------------------------------------
For any program             For programs with one file
-----------------------------------------------------------
Can import code in          Can only import code that came
any available               with the JDK
Java library

 */

