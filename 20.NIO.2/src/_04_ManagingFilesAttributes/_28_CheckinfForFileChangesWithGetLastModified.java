public class _28_CheckinfForFileChangesWithGetLastModified {
    /*Most operating systems support tracking a last‐modified date/time value
    with each file. Some applications use this to determine when the file's
    contents should be read again. In the majority of circumstances, it is a lot
    faster to check a single file metadata attribute than to reload the entire
    contents of the file.


    The Files class provides the following method to retrieve the last time a file was modified:

    public static FileTime getLastModifiedTime(Path path, LinkOption… options) throws IOException

    The method returns a FileTime object, which represents a timestamp. For
    convenience, it has a toMillis() method that returns the epoch time,
    which is the number of milliseconds since 12 a.m. UTC on January 1,
    1970.
    The following shows how to print the last modified value for a file as an
    epoch value:
    final Path path = Paths.get("/rabbit/food.jpg");
    System.out.println(Files.getLastModifiedTime(path).toMillis())
;
    */
}
