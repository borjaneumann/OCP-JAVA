public class _3_DefiningAThreadTask {
    public static void main(String[] args) {
        System.out.println("begin");
        (new ReadInventoryThread()).start();
        (new Thread(new PrintData())).start();
        (new ReadInventoryThread()).start();
        System.out.println("end");
    }

    /*Defining the task that a Thread instance will execute can be done two
    ways in Java:
    1) Provide a Runnable object or lambda expression to the Thread
    constructor.
    2) Create a class that extends Thread and overrides the run() method.
    The following are examples of these techniques:*/
    //NUmber 1
    static class PrintData implements Runnable {
        public static void main(String[] args) {
            (new Thread(new PrintData())).start();
        }

        @Override
        public void run() { // Overrides method in Runnable
            for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
        }
    }
    //NUmber 2
    static class ReadInventoryThread extends Thread { //less common practise
        public static void main(String[] args) {
            (new ReadInventoryThread()).start();
        }

        @Override
        public void run() { // Overrides method in Thread
            System.out.println("Printing zoo inventory");
        }
    }
    /*
    Let's try this. What is the output of the following code snippet using these two classes?
    */
    public static void main1(String[] args) { // First used thread
        System.out.println("begin");
        (new ReadInventoryThread()).start(); // Second used thread
        (new Thread(new PrintData())).start(); // Third used thread
        (new ReadInventoryThread()).start(); // Fourth used thread
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

    The opposite of this behavior is a synchronous task in which the program waits (or blocks) on
    line 4 for the thread to finish executing before moving on to the next line.
    The vast majority of method calls used in this book have been synchronous up until now.

     */


}
