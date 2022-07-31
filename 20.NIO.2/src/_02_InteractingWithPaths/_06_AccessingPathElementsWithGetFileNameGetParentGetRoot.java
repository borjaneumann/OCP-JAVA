package _02_InteractingWithPaths;

import java.nio.file.Path;

public class _06_AccessingPathElementsWithGetFileNameGetParentGetRoot {

    /*The Path interface contains numerous methods for retrieving particular
    elements of a Path, returned as Path objects themselves.

    public Path getFileName()   --> The getFileName() returns the Path
                                    element of the current file or directory
    public Path getParent()     --> getParent() returns the full path of the containing directory.
                                    Returns null if operated on the root path or at the top of a relative path.
    public Path getRoot()       --> The getRoot() method returns the root element of the file
                                    within the file system, or null if the path is a relative path.
     */

    public static void main(String[] args) {
        Path path = Path.of("/zoo/elephant/newElephant.txt");
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getFileName: " + path.getFileName());
        printPathInformation(Path.of("zoo"));
        printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
        printPathInformation(Path.of("./armadillo/../shells.txt"));


    }
    public static void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("  Root is: " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) !=null) {
            System.out.println("  Current parent is: " + currentParent);
        }
    }
    /*
    Output:
    Filename is: zoo
       Root is: null
    Filename is: shells.txt
       Root is: \
      Current parent is: \zoo\armadillo
      Current parent is: \zoo
      Current parent is: \
    Filename is: shells.txt
       Root is: null
      Current parent is: .\armadillo\..
      Current parent is: .\armadillo
      Current parent is: .
     */


}
