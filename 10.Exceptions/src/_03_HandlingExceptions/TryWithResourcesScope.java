package HandlingExceptions;

import java.util.Scanner;

public class TryWithResourcesScope {

    public void scanResourcesOutOfScope(){
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
