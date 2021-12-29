package _3_AutomatingResourceManagement;

public class _9_ConstructingTryWithCatchResourcesManagement {

    //The first rule you should know is: try‐with‐resources statements require
    //resources that implement the AutoCloseable interface.

    /*The second rule you should be familiar with is: a try‐with‐resources
    statement can include multiple resources, which are closed in the reverse
    order in which they are declared. Resources are terminated by a
    semicolon ( ;), with the last one being optional.*/

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


}
