import java.nio.file.Paths;

public class _9_CheckingPathTypeWithIsAbsoluteAndToAbsolutePath {

    /*
    The Path interface contains two methods for assisting with relative and absolute paths:

    public boolean isAbsolute() // returns true if the path the object references is absolute and false if the path the object references is relative.
    public Path toAbsolutePath() // converts a relative Path object to an absolute Path object by joining it to the current working directory.

    The current working directory can be selected from System.getProperty("user.dir"). This is the value that
    toAbsolutePath() will use when applied to a relative path.
     */
    public static void main(String[] args) {
        var path1 = Paths.get("C:\\birds\\egret.txt");
        System.out.println("Path1 is Absolute? " + path1.isAbsolute());  // Path1 is Absolute? true
        System.out.println("Absolute Path1: " + path1.toAbsolutePath()); // Absolute Path1: C:\birds\egret.txt

        var path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? " + path2.isAbsolute()); // Path2 is Absolute? false
        System.out.println("Absolute Path2 " + path2.toAbsolutePath()); // Absolute Path2 C:\Users\Will Smith\Desktop\Home\repo\OCP-JAVA\birds\condor
        // .txt

    }
}
