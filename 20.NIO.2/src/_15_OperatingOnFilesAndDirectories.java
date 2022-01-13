public class _15_OperatingOnFilesAndDirectories {
    /*
    Most of the methods we covered in the Path interface operate on
    theoretical paths, which are not required to exist within the file system.
    What if you want to rename a directory, copy a file, or read the contents of a file?

    Enter the NIO.2 Files class. The Files helper class is capable of
    interacting with real files and directories within the system. Because of
    this, most of the methods in this part of the chapter take optional
    parameters and throw an IOException if the path does not exist. The
    Files class also replicates numerous methods found in the java.io.File,
    albeit often with a different name or list of parameters.
     */
}
