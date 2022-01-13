import java.nio.file.Path;
import java.nio.file.Paths;

public class _12_CleaningUpAPathWithNormalize {

    /*
    So far, we've presented a number of examples that included path symbols that were unnecessary.
    public Path normalize()
    ./ and ../ are considered redundant
     */
    public static void main(String[] args) {
        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize()); // shells.txt
        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize()); // /panther/food
        var p3 = Path.of("../../fish.txt");
        System.out.println(p3.normalize()); // ../../fish.txt

        /*
        The normalize() method also allows us to compare equivalent paths.
        Consider the following example:
         */
        var p4 = Paths.get("/pony/../weather.txt");
        var p5 = Paths.get("/weather.txt");
        System.out.println(p4.equals(p5)); //false
        System.out.println(p4.normalize().equals(p5.normalize())); //true

        //This is the primary function of the
        //normalize() method, to allow us to better compare different paths.
    }

}
