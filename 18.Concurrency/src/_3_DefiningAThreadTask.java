public class _3_DefiningAThreadTask {
    /*Defining the task that a Thread instance will execute can be done two
    ways in Java:
    1) Provide a Runnable object or lambda expression to the Thread
    constructor.
    2) Create a class that extends Thread and overrides the run() method.
    The following are examples of these techniques:*/

    static class PrintData implements Runnable {
        @Override public void run() { // Overrides method in Runnable
            for(int i = 0; i < 3; i++)
                System.out.println("Printing record: "+i);
        }
        public static void main(String[] args) {
            (new Thread(new PrintData())).start();
        }
    }
    static class ReadInventoryThread extends Thread { //less common practise
        @Override public void run() { // Overrides method in Thread
            System.out.println("Printing zoo inventory");
        }
        public static void main(String[] args) {
            (new ReadInventoryThread()).start();
        }
    }

    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");
    }
    /*
    The answer is that it is unknown until runtime. The following is just one possible output:
    begin
    Printing zoo inventory
    Printing record: 0
    end
    Printing zoo inventory
    Printing record: 1
    Printing record: 2

    This sample uses a total of four threads—the main() user thread and three
    additional threads created on lines 4–6. Each thread created on these lines
    is executed as an asynchronous task. By asynchronous, we mean that the
    thread executing the main() method does not wait for the results of each
    newly created thread before continuing.
     */



}
