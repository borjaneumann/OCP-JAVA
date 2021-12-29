package _3_AutomatingResourceManagement;
import static _3_AutomatingResourceManagement._9_ConstructingTryWithCatchResourcesManagement.MyFileReader;

import java.nio.file.Files;

public class _10_LearningNewEffecticvelyFinalFeature {
    /*Starting with Java 9, it is possible to use resources declared prior to the
    try‐with‐resources statement, provided they are marked final or
    effectively final.The syntax is just to use the resource name in place of the
    resource declaration, separated by a semicolon ( ;).
    */
    public void relax() {
        final var bookReader = new MyFileReader("4");
        MyFileReader movieReader = new MyFileReader("5");//effectively final variable.only used once.
            try (bookReader; //new way of declaring
                var tvReader = new MyFileReader("6");
                movieReader) {
                System.out.println("Try Block");
            } finally {
                System.out.println("Finally Block");
            }
    }
    public void writer() {
//        var writer = Files.newBufferedWriter(path);
//        try(writer) { // DOES NOT COMPILE
//            writer.append("Welcome to the zoo!");
//            }
//        writer = null;//not effecitvely final as it is reassigned in this line.
    }
    public void alreadyClosed() {
        /*The other place the exam might try to trick you is accessing a resource
    after it has been closed. Consider the following:*/
//        var writer = Files.newBufferedWriter(path);
//        writer.append("This write is permitted but a really bad idea!");
//        try(writer) {
//            writer.append("Welcome to the zoo!");
//        }
//        writer.append("This write will fail!"); // IOException
    /*This code compiles but throws an exception on line 46 with the message
    Stream closed. While it was possible to write to the resource before the
    try‐with‐resources statement, it is not afterward.*/
    }



    public static void main(String[] args) {
        _10_LearningNewEffecticvelyFinalFeature b = new _10_LearningNewEffecticvelyFinalFeature();
        b.relax();
    }
}
