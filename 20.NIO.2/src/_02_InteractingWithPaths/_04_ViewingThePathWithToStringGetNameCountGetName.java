package _02_InteractingWithPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class _04_ViewingThePathWithToStringGetNameCountGetName {
     /*
     Now that we've covered the basics of NIO.2, you might ask, what can we
    do with it? Short answer: a lot. NIO.2 provides a rich plethora of methods
    and classes that operate on Path objects—far more than were available in
    the java.io API. In this section, we present the Path methods you should
    know for the exam, organized by related functionality.
    Just like String values, Path instances are immutable. In the following
    example, the Path operation on the second line is lost since p is
    immutable:
    Path p = Path.of("whale");
    p.resolve("krill");
    System.out.println(p); // whale
    Many of the methods available in the Path interface transform the path
    value in some way and return a new Path object, allowing the methods to
    be chained. We demonstrate chaining in the following example, the details
    of which we'll discuss in this section of the chapter:

    Path.of("/zoo/../home").getParent().normalize().toAbsolutePath();

    If you start to feel overwhelmed by the number of methods available
    in the Path interface, just remember: the function of many of them
    can be inferred by their method name. For example, what do you
    think the Path method getParent() does? It returns the parent
    directory of a Path. Not so difficult, was it?
    Many of the code snippets in this part of the chapter can be run without
    the paths they reference actually existing. The JVM communicates with
    the file system to determine the path components or the parent directory of
    a file, without requiring the file to actually exist. As rule of thumb, if the
    method declares an IOException, then it usually requires the paths it
    operates on to exist.
  */
    public static void main(String[] args) {
        getNameCountAndGetName();
        getNameCountAndGetName2();
    }

    /*
        The Path interface contains three methods to retrieve basic information
        about the path representation.

        public String toString()
        public int getNameCount()
        public Path getName(int index)

        The first method, toString(), returns a String representation of the
        entire path. In fact, it is the only method in the Path interface to return a
        String. Many of the other methods in the Path interface return Path
        instances.
        The getNameCount() and getName() methods are often used in
        conjunction to retrieve the number of elements in the path and a reference
        to each element, respectively. These two methods do not include the root
        directory as part of the path.

     */
    public static void getNameCountAndGetName() {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        System.out.println("The getNameCount is: " +path.getNameCount());
        for(int i=0; i<path.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " +
                    path.getName(i));
        }
    }
    public static void getNameCountAndGetName2() {
        var p = Path.of("/"); // these methods do not consider the root as part of the path.
        System.out.print(p.getNameCount()); // 0
        System.out.print(p.getName(0)); //IllegalArgumentException
    }


}
