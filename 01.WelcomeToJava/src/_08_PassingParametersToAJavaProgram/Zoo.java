package _08_PassingParametersToAJavaProgram;

public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}
/*
java Zoo2 peter johnny
peter
johnny
 */

/*when needing to pass arguments with spaces
java Zoo2 peter "Mister Robinson"
peter
Mister Robinson
 */
