package _03_HandlingExceptions;

import java.util.Scanner;

public class _19_ScopeOfTryWithResources {
    public void scanResourcesOutOfScope(){
        /*
        The resources created in the try clause are in scope only within the try
        block. This is another way to remember that the implicit finally runs
        before any catch/finally blocks that you code yourself. The implicit
        close has run already, and the resource is no longer available.
         */
        try (Scanner sc = new Scanner(System.in)) {
            sc.nextLine();
        } catch (Exception e) {
//            sc.nextInt(); // does not compile, out of the scope
        } finally {
//            sc.nextInt(); //doesn not compile, out of the scope
        }
    }
    //in order to be able to use it!
    public void scanResourcesInScope(){
        Scanner sc = new Scanner(System.in);
        try {
            sc.nextLine();
        } catch (Exception e) {
            sc.nextInt(); // does not compile, out of the scope
        } finally {
            sc.nextInt(); //doesn not compile, out of the scope
        }
    }
}
