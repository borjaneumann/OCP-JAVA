import java.io.File;

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
    public static void main(String[] args) {
        System.out.println(System.getProperty("file.separator")); // \
        System.out.println(File.separator); // \
    }
}
