package _01_LearningAboutTheJavaEnvironment;

public class _01_MajorComponentsOfJava {
    /*
    The Java Development Kit (JDK) contains the minimum software you
    need to do Java development. Key pieces include:

     - the compiler (javac), which converts .java files to .class files
     - the launcher java, which creates the virtual machine and executes the program.
     - the archiver (jar) command, which can package files together
     - API documentation (javadoc) command for generating documentation.
     - Java comes with a large suite of application programming interfaces (APIs) that you can use.

    The javac program generates instructions in a special format that the java
    command can run called bytecode. Then java launches the Java Virtual
    Machine (JVM) before running the code. The JVM knows how to run
    bytecode on the actual machine it is on. You can think of the JVM as a
    special magic box on your machine that knows how to run your .class
    file.
     */
    /*
    WHERE DID THE JRE GO?
    In previous versions of Java, you could download a Java Runtime
    Environment (JRE) instead of the full JDK. The JRE was a subset of
    the JDK that was used for running a program but could not compile
    one. It was literally a subset. In fact, if you looked inside the
    directory structure of a JDK in older versions of Java, you would see
    a folder named jre.

    In Java 11, the JRE is no longer available as a stand-alone download
    or a subdirectory of the JDK. People can use the full JDK when
    running a Java program. Alternatively, developers can supply an
    executable that contains the required pieces that would have been in
    the JRE.
    The jlink command creates this executable.
     */
}
