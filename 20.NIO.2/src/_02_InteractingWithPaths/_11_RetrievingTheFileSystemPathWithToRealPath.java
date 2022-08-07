package _02_InteractingWithPaths;

import java.io.IOException;
import java.nio.file.Paths;

public class _11_RetrievingTheFileSystemPathWithToRealPath {

    /*
    While working with theoretical paths is useful, sometimes you want to
    verify the path actually exists within the file system.

    public Path toRealPath(LinkOption… options) throws IOException

    This method is similar to normalize(), in that it eliminates any redundant
    path symbols. It is also similar to toAbsolutePath(), in that it will join
    the path with the current working directory if the path is relative.
    Unlike those two methods, though, toRealPath() will throw an exception
    if the path does not exist. In addition, it will follow symbolic links, with an
    optional varargs parameter to ignore them.

    Let's say that we have a file system in which we have a symbolic link from
    /zebra to /horse. What do you think the following will print, given a
    current working directory of /horse/schedule?
    */
    public static void main(String[] args) throws IOException {
        System.out.println(Paths.get("/zebra/food.txt").toRealPath()); // /horse/food.txt //if file would exist
        System.out.println(Paths.get(".././food.txt").toRealPath()); // /horse/food.txt //if file would exist

       // We can also use the toRealPath() method to gain access to the current working directory as a Path object.
        System.out.println(Paths.get(".").toRealPath());

    }
}
