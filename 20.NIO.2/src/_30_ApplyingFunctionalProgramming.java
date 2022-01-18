import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    /*
    Applying a Depth Limit
    ======================
    Let's say our directory tree was quite deep, so we apply a depth limit by
    changing one line of code in our getPathSize() method.

    try (var s = Files.walk(source, 5)) {
    This new version checks for files only within 5 steps of the starting node.
    A depth value of 0 indicates the current path itself. Since the method
    calculates values only on files, you'd have to set a depth limit of at least 1
    to get a nonzero result when this method is applied to a directory tree.
     */

    /*
    Avoid Citcular Paths
    =====================
    Many of our earlier NIO.2 methods traverse symbolic links by default,
    with a NOFOLLOW_LINKS used to disable this behavior. The walk() method
    is different in that it does not follow symbolic links by default and requires
    the FOLLOW_LINKS option to be enabled. We can alter our getPathSize()
    method to enable following symbolic links by adding the FileVisitOption:

    try (var s = Files.walk(source,
    FileVisitOption.FOLLOW_LINKS)) {

    When traversing a directory tree, your program needs to be careful of
    symbolic links if enabled. For example, if our process comes across a
    symbolic link that points to the root directory of the file system, then every
    file in the system would be searched!

    Worse yet, a symbolic link could lead to a cycle, in which a path is visited
    repeatedly. A cycle is an infinite circular dependency in which an entry in
    a directory tree points to one of its ancestor directories.

    Be aware that when the FOLLOW_LINKS option is used, the walk() method
    will track all of the paths it has visited, throwing a
    FileSystemLoopException if a path is visited twice.
     */

    /*
    Searching A Directory With Find()
    public static Stream<Path> find(Path start,
                    int maxDepth,
                    BiPredicate<Path,BasicFileAttributes> matcher,
                    FileVisitOption… options) throws IOException

    The find() method behaves in a similar manner as the walk() method,
    except that it takes a BiPredicate to filter the data. It also requires a depth
    limit be set. Like walk(), find() also supports the FOLLOW_LINK option.
    The two parameters of the BiPredicate are a Path object and a
    BasicFileAttributes object,
    */
    public void findingFiles() throws IOException {
        Path path = Paths.get("/bigcats");
        long minSize = 1_000;
        try (var s = Files.find(path, 10,
                (p, a) -> a.isRegularFile()
                        && p.toString().endsWith(".java")
                        && a.size() > minSize)) {
            s.forEach(System.out::println);
        }
    }

    /*
    This example searches a directory tree and prints all .java files with a size
    of at least 1,000 bytes, using a depth limit of 10. While we could have
    accomplished this using the walk() method along with a call to
    readAttributes(), this implementation is a lot shorter and more
    convenient than those would have been. We also don't have to worry about
    any methods within the lambda expression declaring a checked exception,
    as we saw in the getPathSize() example.

     */
    /*
    Reading A File WIth Lines()
    ===========================
    Earlier in the chapter, we presented Files.readAllLines() and
    commented that using it to read a very large file could result in an
    OutOfMemoryError problem. Luckily, NIO.2 solves this problem with a
    Stream API method.

    public static Stream<String> lines(Path path) throws IOException

    The contents of the file are read and processed lazily, which means that
    only a small portion of the file is stored in memory at any given time.
    */
    public void readingWitLines() {
        Path path = Paths.get("/fish/sharks.log");
        try (var s = Files.lines(path)) {
            s.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    Taking things one step further, we can leverage other stream methods for a
    more powerful example.*/
    public void readingWitLines2() throws IOException {
        Path path = Paths.get("/fish/sharks.log");
        try (var s = Files.lines(path)) {
            s.filter(f -> f.startsWith("WARN:"))
                    .map(f -> f.substring(5))
                    .forEach(System.out::println);
    }
    /*
    This sample code searches a log for lines that start with WARN:, outputting
    the text that follows. Assuming that the input file sharks.log is as
    follows:
    INFO:Server starting
    DEBUG:Processes available = 10
    WARN:No database could be detected
    DEBUG:Processes available reset to 0
    WARN:Performing manual recovery
    INFO:Server successfully started
    Then, the sample output would be the following:
    No database could be detected
    Performing manual recovery

     */

}
