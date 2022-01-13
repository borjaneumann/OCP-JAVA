import java.nio.file.Path;

public class _10_JoiningPathsWithResolve {

    /*
    Suppose you want to concatenate paths in a similar manner as we
    concatenate strings. The Path interface provides two resolve() methods
    for doing just that.

    public Path resolve(Path other)
    public Path resolve(String other)
     */
    public static void main(String[] args) {
        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2)); //\cats\..\panther\food

        /*
        Like the other methods we've seen up to now, resolve() does not clean
        up path symbols. In this example, the input argument to the resolve()
        method was a relative path, but what if it had been an absolute path?
         */
        Path path3 = Path.of("/turkey/food");
        System.out.println(path3.resolve("/tiger/cage")); //\tiger\cage
        /*Since the input parameter path3 is an absolute path, the output would be
        the following: /tiger/cage

        If an absolute path is provided as input
        to the method, then that is the value that is returned. Simply put, you
        cannot combine two absolute paths using resolve().
        */
    }
}
