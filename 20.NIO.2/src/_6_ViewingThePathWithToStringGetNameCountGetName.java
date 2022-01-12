import java.nio.file.Path;
import java.nio.file.Paths;

public class _6_ViewingThePathWithToStringGetNameCountGetName {

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
