package _01_IntroducingNIO2;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _02_CreatingPaths {
    /*
    CREATING PATHS
    Obtaining a Path with the Path Interface
    ========================================
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

    /*ABSOLUTE VS. RELATIVE PATHS
    =============================
    Determining whether a path is relative or absolute is actually file‐
    system dependent. To match the exam, we adopt the following
    conventions:

    - If a path starts with a forward slash ( /), it is absolute, with / as the
    root directory. Examples: /bird/parrot.png and /bird/../data/./info

    - If a path starts with a drive letter ( c:), it is absolute, with the drive
    letter as the root directory. Examples: c:/bird/parrot.png and d:/bird/../data/./info

    - Otherwise, it is a relative path. Examples: bird/parrot.png and bird/../data/./info
     */

    /* PATHS CLASS
    Obtaining a Path with the Paths class
    =====================================
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
    ===================================
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

    /*Other URI Connection Types
    ============================
    A URI can be used for a web page or FTP connection.
    */
    public void otherUriConnectionTypes() throws URISyntaxException {
        Path path5 = Paths.get(new URI("http://www.wiley.com"));
        Path path6 = Paths.get(new URI("ftp://username:secret@ftp.example.com"));
    }
    /*The Paths class creates instances of the Path interface.
Likewise, the FileSystems class creates instances of the abstract
FileSystem class.

FileSystems factory method
public static FileSystem getDefault()

FileSystem instance method
public Path getPath(String first, String… more)
*/
    Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
    Path path2 = FileSystems.getDefault().getPath("c:\\zooinfo\\November\\employees.txt");
    Path path3 = FileSystems.getDefault().getPath("/home/zoodirectory");

    /*
    CONNECTING TO REMOTE FILE SYSTEMS
    =================================
    While most of the time we want access to a Path object that is
    within the local file system, the FileSystems class does give us the
    freedom to connect to a remote file system, as follows:

    // FileSystems factory method
    public static FileSystem getFileSystem(URI uri)

    The following shows how such a method can be used:

    FileSystem fileSystem = FileSystems.getFileSystem(
    new URI("http://www.selikoff.net"));
    Path path = fileSystem.getPath("duck.txt");

    This code is useful when we need to construct Path objects
    frequently for a remote file system. NIO.2 gives us the power to
    connect to both local and remote file systems, which is a major
    improvement over the legacy java.io.File class.
     */

    /* Obtaining a Path from the java.io.File Class
       ===========================================
    Last but not least, we can obtain Path instances using the legacy
    java.io.File class. In fact, we can also obtain a java.io.File object from a Path instance.

    // Path to File, using Path instance method
    public default File toFile()

    // File to Path, using java.io.File instance method
    public Path toPath()

    These methods are available for convenience and also to help facilitate
    integration between older and newer APIs. The following shows examples of each:*/
    File file = new File("husky.png");
    Path path = file.toPath();
    File backToFile = path.toFile();

    /*When working with newer applications, though, you should rely on
    NIO.2's Path interface as it contains a lot more features.*/
    /*
        NIO.2 makes extensive use of the factory
        pattern. You should become comfortable with this paradigm. Many of
        your interactions with NIO.2 will require two types: an abstract class or
        interface and a factory or helper class. Figure 20.2 shows the relationships
        among NIO.2 classes, as well as select java.io and java.net classes.

        When working with NIO.2, keep an eye on
        whether the class name is singular or plural. The classes with plural names
        include methods to create or operate on class/interface instances with
        singular names. Remember, a Path can also be created from the Path
        interface, using the static factory of() method.

        class java.nio.file.Files, which we'll
        cover later in the chapter. For now, you just need to know that it is a
        helper or utility class that operates primarily on Path instances to read or
        modify actual files and directories.

        The java.io.File is the I/O class you worked with in Chapter 19,
        while Files is an NIO.2 helper class. Files operates on Path
        instances, not java.io.File instances. We know this is confusing,
        but they are from completely different APIs!

     */

}
