package _01_UnderstandingFilesAndDirectories;

public class _01_ConceptualizingTheFileSystem {
    /*
    We start with the basics. Data is stored on persistent storage devices, such
    as hard disk drives and memory cards.

    A file is a record within the storage device that holds data.
    Files are organized into hierarchies using directories.
    A directory is a location that can contain files as well as other
    directories. When working with directories in Java, we often treat them
    like files. In fact, we use many of the same classes to operate on files and
    directories. For example, a file and directory both can be renamed with the
    same Java method.

    To interact with files, we need to connect to the file system. The file
    system is in charge of reading and writing data within a computer.
    Different operating systems use different file systems to manage their
    data. For example, Windows‐based systems use a different file system
    than Unix‐based ones. For the exam, you just need to know how to issue
    commands using the Java APIs. The JVM will automatically connect to
    the local file system, allowing you to perform the same operations across
    multiple platforms.

    Next, the root directory is the topmost directory in the file system, from
    which all files and directories inherit. In Windows, it is denoted with a
    drive name such as c:\, while on Linux it is denoted with a single forward
    slash, /.

    Finally, a path is a String representation of a file or directory within a file
    system. Each file system defines its own path separator character that is
    used between directory entries. The value to the left of a separator is the
    parent of the value to the right of the separator. For example, the path
    value /user/home/zoo.txt means that the file zoo.txt is inside the home
    directory, with the home directory inside the user directory. You will see
    that paths can be absolute or relative later in this chapter.

     */
}
