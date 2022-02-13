package _03_RunningAProgramWithOneLine;

public class Learning {
    public static void main(String[] args) {
//        ehhh; //DOES NOT COMPILE
        System.out.println("This works");
    }
}
/*
Learning.java:5: error: not a statement
        ehhh; //DOES NOT COMPILE
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

