public class _32_ComparingLegacyJavaIOFile_And_NIO2Methods {

    /*
    Comparison of java.io.File and NIO.2 methods
    Legacy I/O File method                      NIO.2 method
    ===============================================================
    file.delete()                               Files.delete(path)
    file.exists()                               Files.exists(path)
    file.getAbsolutePath()                      path.toAbsolutePath()
    file.getName()                              path.getFileName()
    file.getParent()                            path.getParent()
    file.isDirectory()                          Files.isDirectory(path)
    file.isFile()                               Files.isRegularFile(path)
    file.lastModified()                         Files.getLastModifiedTime(path)
    file.length()                               Files.size(path)
    file.listFiles()                            Files.list(path)
    file.mkdir()                                Files.createDirectory(path)
    file.mkdirs()                               Files.createDirectories(path)
    file.renameTo(otherFile)                    Files.move(path,otherPath)

    Bear in mind that a number of methods and features are available in NIO.2
    that are not available in the legacy API, such as support for symbolic
    links, setting file system–specific attributes, and so on. The NIO.2 is a
    more developed, much more powerful API than the legacy java.io.File
    class.

     */

}
