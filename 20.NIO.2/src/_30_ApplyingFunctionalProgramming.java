public class _30_ApplyingFunctionalProgramming {

    /*
    We saved the best for last! In this part of the chapter, we'll combine
    everything we've presented so far with functional programming to perform
    extremely powerful file operations, often with only a few lines of code.
    The Files class includes some incredibly useful Stream API methods that
    operate on files, directories, and directory trees.

    LISTING DIRECTORY CONTENTS
    ==========================
    The following Files method lists the contents of a directory:

    public static Stream<Path> list(Path dir) throws IOException

    The Files.list() is similar to the java.io.File method listFiles(),
    except that it returns a Stream<Path> rather than a File[]. Since streams
    use lazy evaluation, this means the method will load each path element as
    needed, rather than the entire directory at once.
    Printing the contents of a directory is easy.

    try (Stream<Path> s = Files.list(Path.of("/home"))) {
    s.forEach(System.out::println);
    }

    Let's do something more interesting, though. Earlier, we presented the
    Files.copy() method and showed that it only performed a shallow copy
    of a directory. We can use the Files.list() to perform a deep copy.

    public void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if(Files.isDirectory(source))
            try (Stream<Path> s = Files.list(source)) {
            s.forEach(p -> copyPath(p, target.resolve(p.getFileName())));
            }
        } catch(IOException e) {
        // Handle exception
        }
    }

    The method first copies the path, whether it be a file or a directory. If it is
    a directory, then only a shallow copy is performed. Next, it checks
    whether the path is a directory and, if it is, performs a recursive copy of
    each of its elements. What if the method comes across a symbolic link?
    Don't worry, we'll address that topic in the next section. For now, you just
    need to know the JVM will not follow symbolic links when using this
    stream method.
     */

    /*
    CLOSING THE STREAM
    ==================
    Did you notice that in the last two code samples, we put our Stream
    objects inside a try‐with‐resources method? The NIO.2 stream‐based
    methods open a connection to the file system that must be properly
    closed, else a resource leak could ensue. A resource leak within the
    file system means the path may be locked from modification long
    after the process that used it completed.

    Not all streams need to be closed, only those that open resources, like
    the ones found in NIO.2.

    Finally, the exam doesn't always properly close NIO.2 resources. To
    match the exam, we will sometimes skip closing NIO.2 resources in
    review and practice questions. Please, in your own code, always use
    try‐with‐resources statements with these NIO.2 methods.
     */

    /*
    TRAVERSING A DIRECTORY TREE
    ===========================
    Traversing a directory, also referred to as walking a directory tree, is the
    process by which you start with a parent directory and iterate over all of its
    descendants until some condition is met or there are no more elements
    over which to iterate. For example, if we're searching for a single file, we
    can end the search when the file is found or when we've checked all files
    and come up empty.
     */

}
