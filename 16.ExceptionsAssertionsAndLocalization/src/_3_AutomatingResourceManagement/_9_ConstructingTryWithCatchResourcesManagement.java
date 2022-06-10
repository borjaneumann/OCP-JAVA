package _3_AutomatingResourceManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class _9_ConstructingTryWithCatchResourcesManagement {

    /*The first rule you should know is: try‐with‐resources statements require
    resources that implement the AutoCloseable interface.

    The second rule you should be familiar with is: a try‐with‐resources
    statement can include multiple resources, which are closed in the reverse
    order in which they are declared. Resources are terminated by a
    semicolon ( ;), with the last one being optional.

    resources declared within a try‐with‐resources statement are in scope only within the try block.*/

    public static void main(String[] args) {
//        try (String reptile = "lizard"){ //does not implement theAutoCloseable interface

        /*Inheriting AutoCloseable requires implementing a compatible close()
        method.
        interface AutoCloseable {
            public void close() throws Exception;
        }*/
        try (var bookReader =  new MyFileReader("monkey")) {
            System.out.println("Try Block");
        } finally {
            System.out.println("Finally Block");
        }
        /* Behind the scenes, the JVM calls the close() method inside a hidden finally block, which we
        can refer to as the implicit finally block. The finally block that the programmer declared can
        be referred to as the explicit finally block.
        */
        try (var bookReader = new MyFileReader("1");
             var movieReader = new MyFileReader("2");
             var tvReader = new MyFileReader("3");) {
            System.out.println("Try Block multiple resources");
        } finally {
            System.out.println("Finally Block multiple resources");
        }
        //FINAL RULE EXAMPLE (SCOPE)
        try (Scanner s = new Scanner(System.in)) {
           s.nextLine();
        } catch(Exception e) {
//           s.nextInt(); // DOES NOT COMPILE
        } finally {
//           s.nextInt(); // DOES NOT COMPILE
        }
        /*
        The problem is that Scanner has gone out of scope at the end of the try
        clause. Lines 50 and 52 do not have access to it. This is actually a nice
        feature. You can't accidentally use an object that has been closed.
         */

    }
    public static class MyFileReader implements AutoCloseable {
        private String tag;
        public MyFileReader(String tag){
            this.tag = tag;
        }
        @Override
        public void close()  {
            System.out.println("Closed: " + tag);
        }
    }

    //WHY USING TRY-WITH-RESOURCES STATEMENTS
    public void copyData(Path path1, Path path2) throws Exception {
      BufferedReader in = null;
      BufferedWriter out = null;
      try {
           in = Files.newBufferedReader(path1);
           out = Files.newBufferedWriter(path2);
           out.write(in.readLine());
      } finally {
            if (out != null) {
                out.close();
            }
            if (in != null) {
                in.close();
            }
      }
    }
    /*Switching to the try‐with‐resources syntax, we can replace it with
    the following, much shorter implementation:*/
    public void copyData2(Path path1, Path path2) throws Exception {
        try (var in = Files.newBufferedReader(path1);
            var out = Files.newBufferedWriter(path2))
        {
            out.write(in.readLine());
        }
    }
}
