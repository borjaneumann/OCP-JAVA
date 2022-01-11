import java.nio.file.Path;

public class _1_IntroducingNIO2 {

    /*
     In this chapter, we focus on the java.nio version 2 API, or NIO.2 for short,
     to interact with files. NIO.2 is an acronym that stands for the second version
     of the Non‐blocking Input/Output API, and it is sometimes referred to as the “New I/O.
     When talking about streams we refered to functional programming.

    By legacy, we mean that the preferred approach for working with files and
    directories with newer software applications is to use NIO.2, rather than
    java.io.File.

    People sometimes refer to NIO.2 as just NIO, although for clarity
    and to distinguish it from the first version of NIO, we will refer to it
    as NIO.2 throughout the chapter.
     */

    /*
    INTRODUCING PATH
    The cornerstone of NIO.2 is the java.nio.file.Path interface. You can think
    of a Path as the NIO.2 replacement for the java.io.File class, although how you
    use it is a bit different.

    You can think of a Path as the NIO.2 replacement for the
    java.io.File class, although how you use it is a bit different.
    As we did in Chapter 19 and continue to do in this chapter, we treat an instance
    that points to a directory as a file since it is stored in the file system with similar properties.

    IMPORTANT!
    Now for something completely different. Unlike the java.io.File class,
    the Path interface contains support for symbolic links. A symbolic link is a
    special file within a file system that serves as a reference or pointer to
    another file or directory.

    /zoo/cats/lion/Cubs.java
    /zoo/favorite/Cubs.java
     */

    /*
    CREATING PATHS
    Obtaining a Path with the Path Interface
    The simplest and most straightforward way to obtain a Path object is to
    use the static factory method defined within the Path interface.

    // Path factory method
    public static Path of (String first, String…more)
    */
    public void obtainingPaths() {
        //It 's easy to create Path instances from String values, as shown here:
        Path path1 = Path.of("pandas/cuddly.png"); //current directory
        Path path2 = Path.of("c:\\zooinfo\\November\\employees.txt"); //windows
        Path path3 = Path.of("/home/zoodirectory"); //linux
    }


}
