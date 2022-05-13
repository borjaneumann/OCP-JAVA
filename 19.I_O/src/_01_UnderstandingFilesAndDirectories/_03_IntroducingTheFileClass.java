package _01_UnderstandingFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class _03_IntroducingTheFileClass {

    /*
    The File class is used to read information about existing files and directories,
    list the contents of a directory, and create/delete files and directories.
    An instance of a File class represents the path to a particular file or
    directory on the file system. The File class cannot read or write data
    within a file, although it can be passed as a reference to many stream
    classes to read or write data, as you will see in the next section.

    Remember, a File instance can represent a file or a directory.

    Creating a File Object
    ======================
    A File object often is initialized with a String containing either an
    absolute or relative path to the file or directory within the file system. The
    absolute path of a file or directory is the full path from the root directory
    to the file or directory, including all subdirectories that contain the file or
    directory. Alternatively, the relative path of a file or directory is the path
    from the current working directory to the file or directory. For example,
    the following is an absolute path to the stripes.txt file:

    /home/tiger/data/stripes.txt

    The following is a relative path to the same file, assuming the user's
    current directory is set to /home/tiger:

    data/stripes.txt

    Different operating systems vary in their format of pathnames. For
    example, Unix‐based systems use the forward slash, /, for paths, whereas
    Windows‐based systems use the backslash, \, character. That said, many
    programming languages and file systems support both types of slashes
    when writing path statements.

    For convenience, Java offers two options to
    retrieve the local separator character: a system property and a static
    variable defined in the File class.*/

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("file.separator")); // \
        System.out.println(File.separator); // \

        //The following code creates a File object and determines whether the path
        //it references exists within the file system:
        var zooFile1 = new File("/home/tiger/data/stripes.txt");
        System.out.println(zooFile1.exists()); // true if the file exists. In our case it shows false
//        File zooFile2 = new File("C:\\Users\\anyName\\Desktop\\Home\\", "stripes.txt");//Creates a File from a String path.
//        zooFile2.createNewFile();


    //Constructing files
    File zooFile3 = new File("\\Home\\", "data\\stripes.txt");//Creates a File from a String path.
    File parent = new File("/home/tiger"); //This one and the one below work together.
    File zooFile4 = new File(parent, "data/stripes.txt");

    /*The File Object vs. the Actual File
    =====================================

    File Methods
    Method Name                 Description
    ====================================================================================================
    boolean delete()            Deletes the file or directory and returns true only if successful.
                                If this instance denotes a directory, then the directory must be empty
                                in order to be deleted.
    boolean exists()            Checks if a file exists
    String  getAbsolutePath()   Retrieves the absolute name of the file or directory within the file system
    String getName()            Retrieves the name of the file or directory.
    String getParent()          Retrieves the parent directory that the path is contained in or null if there is none
    boolean isDirectory()       Checks if a File reference is a directory within the file system
    boolean isFile()            Checks if a File reference is a file within the file system
    long lastModified()         Returns the number of milliseconds since the epoch (number of milliseconds since 12 a.m. UTC on January 1,
                                1970) when the file was last modified
    long length()               Retrieves the number of bytes in the file
    File[] listFiles()          Retrieves a list of files within a directory
    boolean mkdir()             Creates the directory named by this path
    boolean mkdirs()            Creates the directory named by this path including any nonexistent parent directories
    boolean renameTo(File dest) Renames the file or directory denoted by this path to dest and returns true only if successful

    The following is a sample program that given a file path outputs
    information about the file or directory, such as whether it exists, what files
    are contained within it, and so forth:

     */
        var file = new File("C:\\Users\\Neu\\Desktop\\Home\\prueba.txt");
        System.out.println(("File Exists: " + file.exists()));
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                for (File subfile: file.listFiles()) {
                    System.out.println("   " + subfile.getName());
                }
            }
        }
    }
    /*
    If the path provided did not point to a file, it would output the following:

    File Exists: false
    If the path provided pointed to a valid file, it would output something
    similar to the following:
    File Exists: true
    Absolute Path: c:\data\zoo.txt
    Is Directory: false
    Parent Path: c:\data
    Size: 12382
    Last Modified: 1606860000000

    Finally, if the path provided pointed to a valid directory, such as c:\data,
    it would output something similar to the following:

    File Exists: true
    Absolute Path: c:\data
    Is Directory: true
    Parent Path: c:\
    employees.txt
    zoo.txt
    zoo-backup.txt

    In these examples, you see that the output of an I/O‐based program is
    completely dependent on the directories and files available at runtime in
    the underlying file system.
    On the exam, you might get paths that look like files but are directories, or
    vice versa. For example, /data/zoo.txt could be a file or a directory,
    even though it has a file extension. Don't assume it is either unless the
    question tells you it is!

    In the previous example, we used two backslashes ( \\) in the path
    String, such as c:\\data\\zoo.txt. When the compiler sees a \\
    inside a String expression, it interprets it as a single \ value.
     */
}
