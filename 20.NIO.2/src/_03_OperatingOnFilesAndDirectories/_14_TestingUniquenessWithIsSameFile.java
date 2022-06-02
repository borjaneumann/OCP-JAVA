package _03_OperatingOnFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _17_TestingUniquenessWithIsSameFile {

    /*
    TESTING UNIQUENESS WITH ISSAMEFILE()
    Since a path may include path symbols and symbolic links within a file
    system, it can be difficult to know if two Path instances refer to the same
    file. Luckily, there's a method for that in the Files class:

    public static boolean isSameFile(Path path, Path path2) throws IOException

    The method takes two Path objects as input, resolves all path symbols,
    and follows symbolic links. Despite the name, the method can also be used
    to determine whether two Path objects refer to the same directory.

    While most usages of isSameFile() will trigger an exception if the paths
    do not exist, there is a special case in which it does not. If the two path
    objects are equal, in terms of equals(), then the method will just return
    true without checking whether the file exists.

    Assume the file system exists as shown in Figure 20.4 with a symbolic
    link from /animals/snake to /animals/cobra.
     */
    public static void main(String[] args) throws IOException {
        System.out.println(Files.isSameFile(
                Path.of("/animals/cobra"),
                Path.of("/animals/snake"))); //true
        System.out.println(Files.isSameFile(
                Path.of("/animals/monkey/ears.png"),
                Path.of("/animals/wolf/ears.png")));// false they are in different locations

    }
}
