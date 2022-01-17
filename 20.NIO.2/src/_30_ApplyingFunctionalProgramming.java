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

    //DON'T USE DIRECTORYSTREAM AND FILEVISITOR (just don't do it!)

    /*
    Selecting a Search Strategy
    ===========================
    There are two common strategies associated with walking a directory tree:

    1) A depth‐first traverses the structure from the root to an arbitrary
    leaf and then navigates back up toward the root, traversing
    fully down any paths it skipped along the way. The search depth is the
    distance from the root to current node.
    To prevent endless searching, Java includes a search depth that is used to
    limit how many levels (or hops) from the root the search is allowed to go.

    2) A breadth‐first search starts at the root and processes all
    elements of each particular depth, before proceeding to the next depth
    level. The results are ordered by depth, with all nodes at depth 1 read
    before all nodes at depth 2, and so on. While a breadth‐first tends to be
    balanced and predictable, it also requires more memory since a list of
    visited nodes must be maintained.

    For the exam, you don't have to understand the details of each search
    strategy that Java employs; you just need to be aware that the NIO.2
    Streams API methods use depth‐first searching with a depth limit, which
    can be optionally changed.
     */

    /*
    Walking a Directory with walk()
    ===============================
    Two methods for walking the directory tree using a depth‐first search.

    public static Stream<Path> walk(Path start, FileVisitOption… options) throws IOException
    public static Stream<Path> walk(Path start, int maxDepth, FileVisitOption… options) throws IOException

    Like our other stream methods, walk() uses lazy evaluation and evaluates
    a Path only as it gets to it. This means that even if the directory tree
    includes hundreds or thousands of files, the memory required to process a
    directory tree is low. The first walk() method relies on a default maximum
    depth of Integer.MAX_VALUE, while the overloaded version allows the
    user to set a maximum depth.

    Rather than just printing the contents of a directory tree, we can again do
    something more interesting. The following getPathSize() method walks
    a directory tree and returns the total size of all the files in the directory:

    private long getSize(Path p) {
        try {
        return Files.size(p);
        } catch (IOException e) {
        // Handle exception
        }
        return 0L;
        }
        public long getPathSize(Path source) throws IOException {
            try (var s = Files.walk(source)) {
            return s.parallel()
            .filter(p -> !Files.isDirectory(p))
            .mapToLong(this::getSize)
            .sum();
        }
    }

    var size = getPathSize(Path.of("/fox/data"));
    System.out.format("Total Size: %.2f megabytes", (size/1000000.0));

    Depending on the directory you run this on, it will print something like this:

    Total Directory Tree Size: 15.30 megabytes
     */

}
