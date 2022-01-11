import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

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

        Path path4 = Path.of("pandas", "cuddly.png");
        Path path5 = Path.of("c:", "zooinfo", "November", "employees.txt");
        Path path6 = Path.of("/", "home", "zoodirectory");

        /*These examples are just rewrites of our previous set of Path examples,
        using the parameter list of String values instead of a single String value.
        The advantage of the varargs is that it is more robust, as it inserts the
        proper operating system path separator for you.*/

    }

    /* PATHS CLASS
    Obtaining a Path with the Paths class
    The Path.of() method is actually new to Java 11. Another way to obtain
    a Path instance is from the java.nio.file.Paths factory class. Note the s
    at the end of the Paths class to distinguish it from the Path interface.
    Paths factory method
    public static Path get(String first, String… more)
    Rewriting our previous examples is easy.*/

    public void getPaths() {
        Path path1 = Paths.get("pandas/cuddly.png");
        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");
        Path path3 = Paths.get("/", "home", "zoodirectory");
    }
    //Since Paths.get() is older, the exam is likely to have both. We'll use both
    // Path.of() and Paths.get() interchangeably in this chapter.

    /*Obtaining a Path with a URI Class
    Another way to construct a Path using the Paths class is with a URI value.
    A uniform resource identifier (URI) is a string of characters that identify a resource.
    It begins with a schema that indicates the resource type, followed by a path value.
    Examples of schema values include file:// forvlocal file systems,
    and http://, https://,
    and ftp:// for remote filevsystems.

    The java.net .URI class is used to create URI values.

    // URI Constructor
    public URI(String str) throws URISyntaxException
    Java includes multiple methods to convert between Path and URI objects.

    // URI to Path, using Path factory method
    public static Path of(URI uri)

    // URI to Path, using Paths factory method
    public static Path get(URI uri)

    // Path to URI, using Path instance method
    public URI toURI()
    The following examples all reference the same file:*/
    public void uri() throws URISyntaxException {
        java.net.URI a = new URI("file://icecream.txt");
        Path b = Path.of(a);
        Path c = Paths.get(a);
        URI d = b.toUri();
    }

    /*Some of these examples may actually throw an IllegalArgumentException at runtime,
    as some systems require URIs to be absolute. The URI class does have an isAbsolute() method,
    although this refers to whether the URI has a schema, not the file location.*/




}
