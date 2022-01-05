import java.io.File;
import java.io.IOException;

public class _1_IntroducingTheFileClass {

    /*
    The File class is used to read information about existing files and directories,
    list the contents of a directory, and create/delete files and directories.
    An instance of a File class represents the path to a particular file or
    directory on the file system. The File class cannot read or write data
    within a file, although it can be passed as a reference to many stream
    classes to read or write data, as you will see in the next section.

    Remember, a File instance can represent a file or a directory.
     */

    //For convenience, Java offers two options to
    //retrieve the local separator character: a system property and a static
    //variable defined in the File class.
    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("file.separator")); // \
        System.out.println(File.separator); // \

        //The following code creates a File object and determines whether the path
        //it references exists within the file system:
        var zooFile1 = new File("/home/tiger/data/stripes.txt");
        System.out.println(zooFile1.exists()); // true if the file exists. In our case it shows false
        File zooFile2 = new File("C:\\Users\\anyName\\Desktop\\Home\\", "stripes.txt");//Creates a File from a String path.
        zooFile2.createNewFile();

    }
    //Constructing files
    File zooFile2 = new File("\\Home\\", "data\\stripes.txt");//Creates a File from a String path.
    File parent = new File("/home/tiger"); //This one and the one below work together.
    File zooFile3 = new File(parent, "data/stripes.txt");

    /* File Methods
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

     */


}
